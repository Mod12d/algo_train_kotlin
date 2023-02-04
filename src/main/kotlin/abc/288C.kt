import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    /*
    val t = readLine()!!.toInt()
    repeat(t) {
        solve()
    }
    */
    solve()
}

@OptIn(kotlin.ExperimentalStdlibApi::class)
fun solve() {
    val (n, m) = readLine()!!.split(" ").map{it.toInt()}.toIntArray()
    val edges = ArrayList<Edge>()
    for (i in 0 until m) {
        val (a, b) = readLine()!!.split(" ").map{it.toInt()}.toIntArray()
        edges.add(Edge(a - 1, b - 1))
    }
    val g = Graph(n, edges, true)
    val topolo = g.topologicalSort()
    if (topolo.size != n) {
        println(-1)
        return
    }
    println(topolo.map{it + 1}.joinToString(" "))
}

data class Edge(val from: Int, val to: Int, val cost: Int = 1)

//頂点数n,辺のリスト,有向グラフかどうかのフラグ（デフォルトは無向グラフ）を渡して初期化
@OptIn(ExperimentalStdlibApi::class)
class Graph(val n: Int, val edges: ArrayList<Edge>, directed: Boolean = false) {
    val g: Array<ArrayList<Edge>> = Array(n) { ArrayList<Edge>() }

    init {
        if (directed) {
            for (e in edges) {
                add(e)
            }
        } else {
            for (e in edges) {
                add(e)
                add(Edge(e.to, e.from, e.cost))
            }
        }
    }

    fun add(e: Edge) {
        g[e.from].add(e)
    }

    //隣接頂点のリスト
    fun adjacent(n: Int) = g[n].map { it.to }

    //返り値のサイズが頂点数と一致しない場合、閉路が存在する
    fun topologicalSort(): ArrayList<Int> {
        val indeg = IntArray(n)
        for (i in 0 until n) {
            for ((_, v) in g[i]) {
                indeg[v]++
            }
        }
        val q = PriorityQueue<Int>()
        val ret = ArrayList<Int>()
        for (i in 0 until n) {
            if (indeg[i] == 0) q.add(i)
        }
        while (q.isNotEmpty()) {
            val cur = q.poll()
            ret.add(cur)
            for ((_, v) in g[cur]) {
                indeg[v]--
                if (indeg[v] == 0) q.add(v)
            }
        }
        return ret
    }


}
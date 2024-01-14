import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)

    // NとMの入力を受け取る
    val N = sc.nextInt()
    val M = sc.nextInt()

    // グラフの初期化
    val G = Array(N) { ArrayList<Int>() }

    // エッジの入力を受け取り、グラフに追加
    repeat(M) {
        val A = sc.nextInt()
        val B = sc.nextInt()

        // 頂点Aから頂点Bへの辺を張る
        G[A].add(B)

    // 無向グラフの場合は以下の行も実行
    // G[B].add(A)
    }
}
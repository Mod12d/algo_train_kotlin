import java.util.PriorityQueue
import java.io.PrintWriter

fun main() {
    val fp = PrintWriter(System.out)
    val (N,M) = readLine()!!.split(" ").map{it.toInt()}
    val graph = HashMap<Int,PriorityQueue<Int>>()
    val reader = System.`in`.bufferedReader()
    val arr = (0 until M).map{reader.readLine()!!.split(" ").map {it.toInt()}}
    if(M!=0) {
        for (i in 0 until M) {
            if (graph[arr[i][0]] != null ) {
                    graph[arr[i][0]]!!.offer(arr[i][1])
            } else {
                graph[arr[i][0]] = PriorityQueue<Int>()
                graph[arr[i][0]]?.add(arr[i][1])
            }
        }
        reader.close()
        for (i in 0 until N) {
            if (graph[i] != null) {
                print(graph)
            }
            fp.println(graph)
        }
        fp.close()
    }
}

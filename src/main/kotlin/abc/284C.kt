//import java.util.PriorityQueue
//import java.io.PrintWriter
//
//fun main() {
//    val (N,M) = readLine()!!.split(" ").map{it.toInt()}
//    val graph = HashMap<Int,PriorityQueue<Int>>()
//  	val gg = List<Int,List<Int>>()
//    val arr = (0 until M).map{readLine()!!.split(" ").map {it.toInt()}}
//    if(M!=0) {
//        var cnt = 0
//        for (i in 0 until M) {
//            if (graph[arr[i][0]] != null ) {
//                graph[arr[i][0]]!!.offer(arr[i][1])
//            } else {
//                graph[arr[i][0]] = PriorityQueue<Int>()
//                graph[arr[i][0]]?.add(arr[i][1])
//            }
//        }
//    for(g in graph){
//        gg.(g.toList())
//    }
//        print(gg)
//        for(g in graph){
//            if(g.value.size!=1) cnt+=g.value.size
//        }
//        print(cnt)
//    }
//    else{print(M)}
//}

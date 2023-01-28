import java.util.PriorityQueue
import java.io.PrintWriter

fun main() {
    val fp = PrintWriter(System.out)
    val (N,M) = readLine()!!.split(" ").map{it.toInt()}
    val graph = HashMap<Int,PriorityQueue<Int>>()
    val reader = System.`in`.bufferedReader()
    var ret = 0
    var flg = true
    var idx =  100001
    val arr = (0 until M).map{reader.readLine()!!.split(" ").map {it.toInt()}}
    if(M!=0) {
        for (i in 0 until M) {
            if (graph[arr[i][0]] != null) {
                    graph[arr[i][0]]!!.offer(arr[i][1])
            } else {
                graph[arr[i][0]] = PriorityQueue<Int>()
                graph[arr[i][0]]?.add(arr[i][1])
            }
            if (graph[arr[i][1]] != null) {
                    graph[arr[i][1]]!!.offer(arr[i][0])
            } else {
                graph[arr[i][1]] = PriorityQueue<Int>()
                graph[arr[i][1]]?.add(arr[i][0])
            }
        }
        reader.close()
        for((i,v) in graph.toSortedMap()){
            if(v.size>ret){
                idx= i
                ret = v.size
            }

        }
      /*
        while(graph[idx]!!.size>0){
             fp.print(graph[idx]?.poll())
             fp.print(" ")
         }
         */

      var min = Integer.MAX_VALUE
      for(a in graph){
          if(a.key < min) min = a.key
          for (k in a.value){
              if(k == a.key){
                  flg = false
                  break
              }
          }
      }
        if(flg)fp.print("Yes") else fp.print("No")
        fp.close()
    }else{
        print("No")
    }
}

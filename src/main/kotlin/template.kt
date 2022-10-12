import java.util.PriorityQueue
import java.io.PrintWriter

fun main() {
    val fp = PrintWriter(System.out)
    val (N,M) = readLine()!!.split(" ").map{it.toInt()}
    val reader = System.`in`.bufferedReader()
    val arr = (0 until M).map{reader.readLine()!!.split(" ").map {it.toInt()}}
    
    reader.close()
       
    fp.println(arr)
    fp.close()
    }
}

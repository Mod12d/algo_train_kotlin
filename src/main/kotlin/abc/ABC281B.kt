import java.util.PriorityQueue
import java.io.PrintWriter

fun main() {
    val fp = PrintWriter(System.out)
    val reader = System.`in`.bufferedReader()
    val N = reader.readLine()!!.toInt()
    reader.close()
    for(i in N downTo 0){
        println(i)
    }

    fp.close()
}


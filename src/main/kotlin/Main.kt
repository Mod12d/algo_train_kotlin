import java.util.PriorityQueue
import java.io.PrintWriter
fun main(){
    val fp = PrintWriter(System.out)
    val reader = System.`in`.bufferedReader()
//    val number = reader.readLine()!!.toInt()

    reader.close()

    //fp.println(number*2)
    fp.close()
}
//    val (N,M) = readLine()!!.split(" ").map{it.toDouble()}

fun factorial(n: Int): Long {
    return if (n == 0) 1  else n*factorial(n-1)
}
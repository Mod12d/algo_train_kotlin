import java.util.Scanner
import kotlin.math.*
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val N = readLine()!!.toInt()
    val K = readLine()!!.toInt()
    for (i in 1..N){
        val x = sc.nextInt()
        print(sqrt(Math.pow(Math.abs(x-10).toDouble(),2.0)+Math.pow(Math.abs(i-K).toDouble(),2.0)))
    }

}
import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.toCharArray()

    if(a.contains('o') && !a.contains('x')){
        print("Yes")

    }else{
        print("No")
    }
}
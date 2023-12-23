import kotlin.math.*

fun main() {
    val (k, g) = readLine()!!.split(" ").map{it.toInt()}
    print(max(g,k))
}


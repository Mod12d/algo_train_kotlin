

fun main() {
    val (a,b) = readLine()!!.split(" ").map{it.toDouble()}

    print(Math.pow(a,b).toInt())
}

@OptIn(ExperimentalStdlibApi::class)

fun main() {
    val n = readLine()!!.toInt()
    val (s,t) = readLine()!!.split(" ")
    val ret = s.zip(t,{a,b->a.toString()+b.toString()}).joinToString(separator="")

    print(ret)

}

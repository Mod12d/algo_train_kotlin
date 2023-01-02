
@OptIn(ExperimentalStdlibApi::class)
tailrec fun gcd(a: Long, b: Long): Long =
      if (b == 0L) a
      else gcd(b, a % b)

fun lcm(a: Long, b: Long): Long = a / gcd(a, b) * b

fun main() {
    val (a, b) = readLine()!!.split(' ').map{it.toLong()}

    print(lcm(a,b))

}

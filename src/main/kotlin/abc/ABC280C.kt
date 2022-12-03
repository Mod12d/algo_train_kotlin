

fun check(s1: String, s2: String): Int {
    var count = 0
    s2.forEachIndexed { index, c ->
        if (s1.contains(c) && s1[index] != c) count++
    }
    return count
}

fun main() {
    val s = readLine()!!.split("").windowed(size=20, step=20, partialWindows=true)
    val t = readLine()!!.split("")
    print(s)
}
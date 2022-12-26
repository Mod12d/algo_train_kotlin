fun main() {
    val (x,y,z) = readLine()!!.split(" ").map{it.toInt()}
    val a:MutableList<Int> = mutableListOf(0)
    a.add(z)
    a.add(x)
    a.add(y)
    a.forEach{print(it.toString()+" ") }

}
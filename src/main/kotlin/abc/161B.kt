fun main() {
    val (n,m) = readLine()!!.split(" ").map{it.toInt()}
    val a =  readLine()!!.split(" ").map{it.toLong()}.toMutableList().sorted().reversed()
    var border= 1 /(4*m)*a.sum()
    var cnt = 0
    a.forEach{it->if(it>=border)cnt++}
    if(cnt<m)print("No") else print("Yes")
}
fun main(){
    val (n,k) = readLine()!!.split(" ").map{it.toInt()}
    val s = List(n){readLine()!!}.slice(0..k-1).sorted()
    for (i in 0..k-1){
        println(s[i])
    }

}
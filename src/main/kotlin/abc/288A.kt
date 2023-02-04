fun main(){
    val n = readLine()!!.toInt()
    val a = List(n){readLine()!!.split(" ").map{it.toInt()}}
    for ((a,b) in a){
      	println(a+b)
    }

}


fun main() {
    val (n,k,q) = readLine()!!.split(" ").map{it.toInt()}
    var a = List(q){readLine()!!.toInt()}
    var dp = MutableList(n){index->k}


    for((i,v) in a.withIndex()){
        dp.map { it->it-1 }
    }
    for (d in dp){
        if(d<=0){
            println("No")
        }
        else println("Yes")
    }
    print(dp)
}

fun main() {
    val (N,M) = readLine()!!.split(" ").map{it.toInt()}
    val A = (0..N-1).map{readLine()!!.split(" ").map{it.toInt()}.toMutableList()}.toMutableList().groupBy{it.first()}
    var ret : MutableList<Int> = arrayListOf()
    for (i in 0..N-1){
        if(A.containsKey(i)){
            for( a in A.values){
                println(a.groupBy {it.first()})
            }
            println(ret)}
        else println("")
    }
}

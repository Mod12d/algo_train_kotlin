fun main() {
    val (n,k) = readLine()!!.split(" ").map{it.toInt()}
    val a = (0..n-1).map{readLine()!!.split(" ").map{it.toInt()}.toMutableList()}
    val q = readLine()!!.toInt()
    val s = (0..n-1).map{readLine()!!.split(" ").map{it.toInt()}.toMutableList()}
    print(s)
    print(a)
//    var ret : MutableList<Int> = arrayListOf()
//    for (i in 0..n-1){
//        if(a.containsKey(i)){
//            for( a in a.values){
//                println(a.groupBy {it.first()})
//            }
//            println(ret)}
//        else println("")
//    }
}

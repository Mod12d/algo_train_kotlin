@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val (n,m) = readLine()!!.split(" ").map{it.toInt()}
    val s =  List(n){readLine()!!}
    val t =  List(m){readLine()!!}
    var aCnt = 0

    for(ss in s){
        for(tt in t){
            if(ss.takeLast(3)==tt){
                aCnt++
                break
            }
        }
    }

    print(aCnt)

}
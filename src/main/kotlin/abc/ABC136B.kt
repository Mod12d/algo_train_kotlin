@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val n =  readLine()!!.toInt()
    var cnt = 0
    for (i in 0..n){
        if(i.toString().length%2!=0)cnt++
    }
    print(cnt)
}
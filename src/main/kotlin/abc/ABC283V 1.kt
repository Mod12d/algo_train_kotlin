@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val n = readLine()!!.toInt()
    val a =  List(n){readLine()!!}
    var aCnt = 0

    for(i in a){
        if(i=="For")aCnt++
    }

    if(aCnt >= ((n+1)/2))
        print("Yes")
    else print("No")

}
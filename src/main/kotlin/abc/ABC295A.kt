@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val n = readLine()!!.toInt()
    val w = readLine()!!.split(" ")
    val a = listOf("and", "not", "that", "the", "you")
    var flg = true
    for(ww in w ){
        if(a.contains(ww)){
            print("Yes")
            flg = false
            break
        }
    }
    if(flg)print("No")

}
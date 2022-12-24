

fun main() {
    val n = readLine()!!.toInt()
    var a =readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val q = readLine()!!.toInt()
    val query = (0..q-1).map{readLine()!!.split(" ")}

    for(qi in query){
        if(qi.size>2){
            a[qi[1].toInt()-1] = qi[2].toInt()
        }else{
            println(a[qi[1].toInt()-1])
        }
    }
}

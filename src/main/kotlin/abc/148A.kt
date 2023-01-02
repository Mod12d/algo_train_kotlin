@OptIn(ExperimentalStdlibApi::class)

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val arr = MutableList(3){ index->3}

    for(j in 1..3){
        if(j!=a && j!=b){
            print(j)
        }
    }

}

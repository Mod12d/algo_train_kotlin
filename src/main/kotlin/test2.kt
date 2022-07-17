fun main(args: Array<String>) {
    val (N, K, Q) = readLine()!!.split(" ").map { it.toInt() }

    var A = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    val Lraw = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val ary = Array(N){it-it}

    for ( a in A){
        ary[a-1] = 1
    }

    for ( l in Lraw){
        if(l<=K && ary[l]>0){
            ary[l-1] = 0
            ary[l] = 0
        }
    }
    for((i,v) in ary.withIndex()){
        if(v>0){
            print(i)
            print(" ")
        }
    }

    //ary.forEach{print(it)}
}
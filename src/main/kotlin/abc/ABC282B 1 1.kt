

fun main() {
    val (N,M) = readLine()!!.split(" ").map{it.toInt()}
    var S = (0..N-1).map{readLine()!!.split("")}

    var ret = 0
    for(i in 0..N-1){
       for(j in 0..M-1){
           if(S[i][j]=='o'.toString())ret++
       }
    }
    print(ret)
}

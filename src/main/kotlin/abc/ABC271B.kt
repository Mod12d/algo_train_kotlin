fun main(args: Array<String>) {
    val (N,Q) = readLine()!!.split(" ").map{it.toInt()}
  	var L = (0..N-1).map{readLine()!!.split(" ").map{it.toInt()}}
  	var S = (0..Q-1).map{readLine()!!.split(" ").map{it.toInt()}}

    for (i in 0..Q-1){
    println(L[S[i][0]-1][S[i][1]])
    }
}
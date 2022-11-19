fun main(){
    val (N,K) = readLine()!!.split(" ").map{it.toInt()}
    val A = ArrayDeque(readLine()!!.split(" ").map{it.toInt()}.toMutableList())

    for(i in 0..K-1){
        A.removeFirst()
        A.addLast(0)
    }

    A.forEach{print(it.toString() + " ")}
}
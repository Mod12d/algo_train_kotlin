//ABC 142
import kotlin.math.*
fun main(args:Array<String>){

    var N = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val B: MutableList<Int> = MutableList(N) {0}
    for((i,v) in A.withIndex()){
        B[N-v]=v
    }

    B.forEach{print(it.toString()+" ")}

}
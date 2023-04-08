import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val (n,x) = readLine()!!.split(" ").map{it.toInt()}
    val a = readLine()!!.split(" ").map{it.toInt()}.toIntArray()
    if(checkPairsExist(a,x) || x==0){
        print("Yes")
    }
    else{
        print("No")
    }
}

fun checkPairsExist(A: IntArray, X: Int): Boolean {
    val set = mutableSetOf<Int>()
    for (i in A.indices) {
        if (set.contains(A[i] - X) || set.contains(A[i] + X)) {
            return true
        }
        set.add(A[i])
    }
    return false
}
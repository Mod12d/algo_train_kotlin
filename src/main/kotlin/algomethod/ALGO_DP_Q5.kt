//https://algo-method.com/tasks/306
import kotlin.math.*

fun main() {
    val (n,m) = readLine()!!.split(" ").map{it.toInt()}
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val dp : MutableList<Int> = ArrayList()
    dp.add(a[0])
    for(i in 1..n){
        for(j in 1..m+1){
            if(i-j>=0)dp[i] = min(dp[i],dp[i-j]+ a[i]*j)
        }
    }
    print(dp[n-1])
}
//https://algo-method.com/tasks/306
import kotlin.math.*
fun perm(n: Int, k: Int): Int {
    require(n > 0 && k >= 0)
    return (n - k + 1 .. n).fold(1) { acc, i -> acc * i }
}
fun comb(n: Int, k: Int): Int {
    require(n > 0 && k >= 0)
    val fact = (2..k).fold(1) { acc, i -> acc * i }
    return perm(n, k) / fact
}
fun main() {
    val (n,m) = readLine()!!.split(" ").map{it.toInt()}
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val dp : MutableList<Int> = MutableList(n){0}

    for(i in 1.. n-1){
        for(j in 1..m-1){
            if(i -j -1<0) break
            dp[i]  =  min(dp[i],dp[i-j]+ a[i]*j)
        }
    }
    print(dp)
}
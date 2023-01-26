//https://algo-method.com/tasks/306
import kotlin.math.*
fun main() {
    val n =  readLine()!!.toInt()
    val a =  List(n){readLine()!!.split(" ").map{it.toInt()}.toMutableList()}
    var dp : MutableList<MutableList<Int>> = MutableList(n){ index->MutableList(3){index->0} }
    // replace later

   // 0 日目の情報をセットする
    for (i in 0..2){
        dp[0][i] = a[0][i]
    }

   // 1, 2, ..., N-1 日目の報酬を求める
   for (i in 1..n-1) {
       dp[i][0] = max(dp[i-1][1], dp[i-1][2]) + a[i][0];
       dp[i][1] = max(dp[i-1][0], dp[i-1][2]) + a[i][1];
       dp[i][2] = max(dp[i-1][0], dp[i-1][1]) + a[i][2];
   }

   // dp[N-1][0], dp[N-1][1], dp[N-1][2] の最大値を出力
    val list = listOf(dp[n-1][0], dp[n-1][1], dp[n-1][2])
    var maxval = 0
    for(i in list){
        if(maxval<i)maxval=i
    }
    print(maxval)
}
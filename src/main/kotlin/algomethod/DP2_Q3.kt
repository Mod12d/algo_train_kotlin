//https://algo-method.com/tasks/306

fun main() {
    val n =  readLine()!!.toInt()
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var dp : MutableList<MutableList<Int>> = MutableList(n){ index->MutableList(3){index->0} }
    // replace later
   
    print(dp[n-1][n-1])

}
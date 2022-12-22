//https://algo-method.com/tasks/306

fun main() {
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val dp : MutableList<MutableList<Int>> = ArrayList()
    // replace later
        dp[0]= mutableListOf(0,0,0,0)
    // 0 case
    for(i in 0..3){
        dp[0][i] = a[i]
    }
    // n case
    for(i in 1..3){
        for(j in 0..3 ){
            if(j==0) dp[i][j] = dp[i-1][j]+dp[i-1][j]
            if(j==1 or 2) dp[i][j] = dp[i-1][j]+dp[i-1][j]+dp[i-1][j+1]
            if(j==3) dp[i][j] = dp[i-1][j]+dp[i-1][j+1]
        }
    }

    print(dp[3][3])
}
//https://algo-method.com/tasks/306

fun main() {
    val n =  readLine()!!.toInt()
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var dp : MutableList<MutableList<Int>> = MutableList(n){ index->MutableList(n){index->0} }
    // replace later
    // 0 case
    for(i in 0..n-1){
        dp[0][i] = a[i]
    }

    // n case
    for(i in 1..n-1){
        for(j in 0..n-1 ){
            if(j>0 && j<n-1)
                dp[i][j] = (dp[i-1][j]+dp[i-1][j-1]+dp[i-1][j+1]) % 100
            else if(j==0)
                dp[i][j] = (dp[i-1][j]+dp[i-1][j+1]) % 100
            else
                dp[i][j] = (dp[i-1][j]+dp[i-1][j-1]) % 100
        }
    }
    print(dp[n-1][n-1])

}
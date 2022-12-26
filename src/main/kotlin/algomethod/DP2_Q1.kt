//https://algo-method.com/tasks/306

fun main() {
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var dp : MutableList<MutableList<Int>> = MutableList(4){ index -> mutableListOf(0,0,0,0) }
    // replace later
    // 0 case
    for(i in 0..3){
        dp[0][i] = a[i]
    }
    // n case
    for(i in 1..3){
        for(j in 0..3 ){
            if(j>0 && j<3)
            dp[i][j] = dp[i-1][j]+dp[i-1][j-1]+dp[i-1][j+1]
            else if(j==0)
             dp[i][j] = dp[i-1][j]+dp[i-1][j+1]
            else
             dp[i][j] = dp[i-1][j]+dp[i-1][j-1]
        }
    }
    print(dp[3][3])
}
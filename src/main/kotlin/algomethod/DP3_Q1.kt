//https://algo-method.com/tasks/306

fun main() {
    val (n,m) =  readLine()!!.split(" ").map{it.toInt()}
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    // dp for searching space could be or not
    var dp : MutableList<MutableList<Boolean>> = MutableList(n){ index->MutableList(m){false} }

    // 0 case
    dp[0][0] = true;

    for (i in 0..n-2) {
        for (j in 0..m-1) {
            if (!dp[i][j]) continue;

            dp[i+1][j] = true;

            if (j+a[i] < m) dp[i+1][j+a[i]] = true;
        }
    }
    var res = 0;
    for (j in 0..m-1) {
        if (dp[n-1][j]) ++res;
    }
    print(res)

}
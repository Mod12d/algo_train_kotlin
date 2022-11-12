fun main(){
    val N = readLine()!!.toInt()
    var dp : MutableList<Int> = ArrayList()
    var A = (0..N-1).map{readLine()!!.split(" ").map { it.toInt()}.toMutableList()}
    val map: MutableMap<Int, Int> = HashMap()
    var flag = true
    for(i in A){
        if(map.containsKey(i[0])){
            if(i[1]>map.get(i[0])!!){
                map[i[0]] = i[1]
            }else{
                map[i[0]] = map.get(i[0])!!
            }
        }else{
           map[i[0]] = i[1]
         }
    }

    dp.add(1)
	var count = 0
    while(flag){
        if(map.containsKey(dp[count])){
            dp.add(map.get(dp[count])!!)
          	count++
        }
      	else{
          flag=false
        }
    }
    print(dp[dp.size-1])
}
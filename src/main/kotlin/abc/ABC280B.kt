fun main() {
    val n = readLine()!!.toInt()
    val a =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val dp : MutableList<Int> = ArrayList()
    dp.add(a[0])
    for(i in 1.. n-1){
        dp.add(a[i]-a[i-1])
    }
    dp.forEach{print(it.toString()+" ")}
}
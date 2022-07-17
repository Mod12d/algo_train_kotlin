fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var A = 0
    var B = 0
    val L = readLine()!!.split(" ").map{it.toInt()}.toMutableList().sortedDescending()
    for(n in 0..N-1){
        if(n%2==0){
            A+= L[n]
        }
        else{
            B+= L[n]
        }
    }
    print(A-B)
}
import kotlin.math.max
@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val n = readLine()!!.toInt()
    val h =  readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    if(h.size==1) print("Yes")
    else {
        var ret = "Yes"
        var max = Integer.MAX_VALUE
        for (i in 0..n-2){
            if(h[i]>max)max=h[i]
            if(h[i+1] - h[i]+1<0) {
                ret = "No"
            }else if(h[i] < max-1 ){
                ret = "No"
            }
        }
        print(ret)
    }
}
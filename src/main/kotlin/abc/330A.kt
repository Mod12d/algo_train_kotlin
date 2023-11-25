import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val (n,l) = readLine()!!.split(" ").map{it.toInt()}
    val a = readLine()!!.split(" ").map{it.toInt()}.toIntArray()
    var cnt = 0
    
    for(v in a){
        if(v>=l)cnt++
    }
    
    print(cnt)
    
}
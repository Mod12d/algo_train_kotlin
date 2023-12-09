import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val (n,l,r) = readLine()!!.split(" ").map{it.toInt()}
    val a = readLine()!!.split(" ").map{it.toInt()}.toIntArray()
    var cnt = Integer.MAX_VALUE
    for(v in a){
        for( i in l..r){
            if(abs(i-v)>=i)cnt=i
        }
        print(cnt.toString() + " ")
        
    }
}
//EE
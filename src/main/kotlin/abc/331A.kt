import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {
    val (m ,d) = readLine()!!.split(" ").map{it.toInt()}
    val (Y ,M,D) = readLine()!!.split(" ").map{it.toInt()}
    
    // switch year
   if(D==d && M==m){
       println(String.format("%s %s %s",Y+1,1,1))    
   }
   // switch month
   else if(D==d && M!=m){
       println(String.format("%s %s %s",Y,M+1,1))     
   }    
   // switch day
    else{
        println(String.format("%s %s %s",Y,M,D+1))    
        
    }
}
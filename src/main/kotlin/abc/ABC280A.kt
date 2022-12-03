import java.util.PriorityQueue
import java.io.PrintWriter

fun main() {
    val fp = PrintWriter(System.out)
    val reader = System.`in`.bufferedReader()
    val(h,w) = reader.readLine()!!.split(" ").map {it.toInt()}
    val arr = (0 until h).map{reader.readLine()!!.split("")}
    reader.close()
    var cnt = 0
    for(i in arr){
        cnt += i.count{it =='#'.toString()}
    }

    fp.println(cnt)
    fp.close()
}


@OptIn(ExperimentalStdlibApi::class)
fun main() {
    var deque = ArrayDeque(readLine()!!.split("").toMutableList().filter{it-> it !=null})
  	deque.removeFirst()
    var cnt = 0
    while(deque.lastOrNull()!=null){

        if(deque.size>0&& deque.last() != '0'.toString()) {
            deque.removeLast()
            cnt++

        }
        else if(deque.last() == '0'.toString()){
            deque.removeLast()

            if(deque.last() == '0'.toString()){
                deque.removeLast()
                cnt++
            }else{
                cnt++
            }
        }
    }
    println(cnt-1)
}
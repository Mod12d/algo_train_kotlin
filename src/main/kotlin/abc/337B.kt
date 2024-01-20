import java.util.LinkedList
import java.util.Queue

fun main() {
    val input = readLine()!!.toCharArray()  // 対象の文字列を動的に変更

    val queue: Queue<Char> = LinkedList()
    var cnt = 0
    var prev = ' '
    var flg = true
    
    for (char in input) {
    if(flg){
        cnt++
        if (cnt > 1) {
            if (!check(char, prev)) {
            flg = false
            }
        }
        prev = char
    }
    else {
        break
    }
    }
    if(flg)print("Yes") else print ("No")

}

fun check(char: Char, prev: Char): Boolean {
    if (prev == 'A') {
        if (char == 'B' || char == 'A') return true
    } else if (prev == 'B') {
        if (char == 'B' || char == 'C') return true
    } else if (prev == 'C') {
        if (char == 'C') return true
    }
    return false
}
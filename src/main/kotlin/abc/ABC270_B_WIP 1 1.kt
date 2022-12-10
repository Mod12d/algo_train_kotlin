import java.util.PriorityQueue
import java.io.PrintWriter

fun <T> List<T>.permutations(k0: Int = this.size): List<List<T>> {

    val n = this.size
    val k = if(k0 > n) n else k0

    fun <T> List<T>.generatePermutations(k: Int, n: Int): List<List<T>> {

        var retList = emptyList<List<T>>().toMutableList()

        this.forEach { a ->
            if (this.size == n - k + 1)
                retList.add(listOf(a))

            else {
                var nextList = emptyList<T>().toMutableList()
                this.forEach { b -> if (a != b) nextList.add(b) }
                nextList.generatePermutations(k, n).forEach { c -> retList.add(listOf(a).plus(c)) }
            }
        }
        return retList.toList()
    }
    return this.generatePermutations(k, n)
}



fun main() {

    val fp = PrintWriter(System.out)
    val reader = System.`in`.bufferedReader()
    val N= reader.readLine()!!.toInt()
    val S = reader.readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    val PS= (1..N).map{it.toInt()}.permutations()

    for(i in PS[PS.indexOf(S)-1]){
        fp.print(i)
        fp.print(" ")
    }
    fp.close()

}

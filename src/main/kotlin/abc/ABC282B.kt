

fun main() {
    val N = readLine()!!.toInt()
    var alphabets: MutableList<Char> = mutableListOf()

    for (a in 'A'..'Z')
    {
        alphabets.add(a)
    }
    for(i in 0..N-1){
        print(alphabets[i])
    }
}

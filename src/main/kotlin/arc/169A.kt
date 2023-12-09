fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val p = readLine()!!.split(" ").map { it.toInt()  }.toIntArray()
    var dp : MutableList<Int> = ArrayList()

    repeat(10) {
        val tempArray = a.copyOf() // 
        for (index in p) {
            
            if (index > 0 && index < a.size) {
                a[index - 1] = tempArray[index - 1] + tempArray[index]
            }
        }
        dp.add(a[0])
       
    }
    


    when {
        a[0] < 0 -> print('-')
        a[0] == 0 -> print('0')
        else -> print('+')
    }
}
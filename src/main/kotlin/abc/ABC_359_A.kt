fun main(){
    val N = readLine()!!.toInt()
    val S = (0 until N).map { readLine()!! }.toMutableList()

    print(S.count { it.contains("Takahashi") })
}
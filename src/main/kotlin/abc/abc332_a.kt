
fun main() {
    val (k,g,m) = readLine()!!.split(" ").map{it.toInt()}

    simulateGlassProcess(g, m, k)
}

fun simulateGlassProcess(aCapacity: Int, bCapacity: Int, k: Int) {
    var aCurrent = 0
    var bCurrent = 0

    for (i in 1..k) {
        when {
            aCurrent == aCapacity -> {
                // グラスAが満タンの場合、空にする
                aCurrent = 0
                break
            }
            bCurrent == 0 -> {
                // グラスBが空の場合、満タンにする
                bCurrent = bCapacity
                break
            }
            else -> {
                // グラスAにグラスBの内容を注ぐ
                if(bCurrent > aCapacity){
                    bCurrent = bCurrent - aCapacity
                    aCurrent = aCapacity
                }
                else if(bCurrent == aCapacity)  {
                    bCurrent = 0
                    aCurrent = aCapacity
                }
                else {
                    aCurrent += bCurrent
                    bCurrent = 0
                }
            }
        }
    }

    println("操作後のグラスA: $aCurrent, グラスB: $bCurrent")
}

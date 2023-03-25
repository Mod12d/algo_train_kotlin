@OptIn(ExperimentalStdlibApi::class)

fun numMap(n:String):Int{
    var ret = 0
    when(n){
        "1"->{ret= 1}
        "2"->{ret= 2}
        "3"->{ret= 3}
        "4"->{ret= 4}
        "5"->{ret= 5}
        "6"->{ret= 6}
        "7"->{ret= 7}
        "8"->{ret= 8}
        "9"->{ret= 9}
    }
    return ret
}

fun main() {
    val (r,c) = readLine()!!.split(" ").map{it.toInt()}
    val b = List(r){readLine()!!.split(" ")}.toMutableList()
    val a = listOf("1","2","3","4","5","6","7","8","9")
    for(aa in a)
        for(bb in b){
            print(bb.contains(aa))
        }

//    if(b.contains(a)){
//        for(i in 0..r-1){
//            for(j in 0..c-1){
//                if(a.contains(b[i][j])) {
//                    val n = numMap(b[i][j])
//                    for(k in 0..n-1){
//                        print("number")
//                    }
//                }
//            }
//        }
//    }
//    else{
//       for(i in 0..r-1){
//            b[i].forEach{print(it+" ")}
//           println("")
//        }
//    }

}
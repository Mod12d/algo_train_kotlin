fun main(args: Array<String>) {

    var A = readLine()!!.split(" ").map{it.toInt() to false}.toMutableList()
    var B = readLine()!!.split(" ").map{it.toInt() to false}.toMutableList()
    var C = readLine()!!.split(" ").map{it.toInt() to false}.toMutableList()

    var N = readLine()!!.toInt()
    var n = 0
    var idx =0

    for (i in 0..N-1){
        n = readLine()!!.toInt()
        var tmpPair:Pair<Int, Boolean> = (n to false)
        if(A.contains(tmpPair)){
            idx = A.indexOf(tmpPair)
            A[idx] = (n to true)
        }
        else if(B.contains(tmpPair)){
            idx = B.indexOf(tmpPair)
            B[idx] = (n to true)
        }
        else if(C.contains(tmpPair)){
            idx = C.indexOf(tmpPair)
            C[idx] = ( n to true)
        }

    }
    if(A[0].second.and(B[0].second).and(C[0].second)||
    A[0].second.and(B[0].second).and(C[0].second) ||
    A[0].second.and(A[1].second).and(A[2].second) ||
    A[0].second.and(B[1].second).and(C[2].second) ||
    B[0].second.and(B[1].second).and(B[2].second) ||
    C[0].second.and(C[1].second).and(C[2].second) ||
    A[1].second.and(B[1].second).and(C[1].second) ||
    A[2].second.and(B[2].second).and(C[2].second) ||
    A[2].second.and(B[1].second).and(C[0].second)) print("Yes") else print("No")
}
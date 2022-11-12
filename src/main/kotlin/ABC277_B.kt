fun main(){
    var N = readLine()!!.toInt()
    var A = (0..N-1).map{readLine()!!}
    var ret = true
    var S1 = listOf('H','D','S','C')
    var S2 = listOf('A','2','3','4','5','6','7','8','9','T','J','Q','K')

    if(A.size != A.toSet().size){
        ret = false
    }else{
        for(i in A){
            if(!S1.contains(i[0]) || !S2.contains(i[1])){
                println(i[0])
                println(i[1])
                ret=false
                break
            }
        }
    }

    if(ret)print("Yes") else print("No")
}
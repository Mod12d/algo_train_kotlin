fun main() {
    val S = readLine()!!
    var flg = true
    for((i,v) in S.withIndex()){
        if(i%2==0){
            if(v !='R' && v !='U' && v =='D')flg = false
        }
        else{
            if(v !='L' && v !='U' && v =='D')flg = false
        }
    }
    if(flg)print("Yes") else print("No")
}
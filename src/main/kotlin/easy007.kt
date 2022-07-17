fun main(){
    val N = readLine()!!.toInt()
    var ret = 0
    if(N>=64){
        ret=64
    }
    else if(N>=32 && N<64){
        ret=32
    }
    else if(N>=16 && N<64){
        ret=16
    }
    else if(N>=4 && N<64){
        ret=4
    }
    else if(N>=2 && N<4){
        ret=2
    }
    else{
        ret=1
    }
    print(ret)
}


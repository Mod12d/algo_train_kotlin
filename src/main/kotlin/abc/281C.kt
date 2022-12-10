fun main() {
    val (n,t) = readLine()!!.split(" ").map{it.toLong()}
    val a =  readLine()!!.split(" ").map{it.toLong()}.toMutableList()
    val sum = a.sum().toLong()
    var tmpt = Long.MAX_VALUE
    var reti = 0L
    var retv = 0L

    if(t>=sum+a[0]){
        tmpt = t%sum
    }
    else{
        tmpt = t
    }

    for((i,v) in a.withIndex()){
       tmpt = tmpt - v
        if(i!=a.size-1 && tmpt-a[i+1]<=0){
            reti = i.toLong()+2L
            retv = tmpt
          	break
        }else if(i==a.size-1) {
          	retv = tmpt
          	reti = 1
          	break
        }
    }
    print(reti.toString() + " " + retv.toString())
}
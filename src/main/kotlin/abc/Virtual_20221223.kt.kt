@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val (a,b,c) =  readLine()!!.split(" ").map{it.toInt()}
    var ret = b+c
    if(ret>a){
        ret = ret%a
    }
  else{
    ret =0
  }
    print(ret)
}
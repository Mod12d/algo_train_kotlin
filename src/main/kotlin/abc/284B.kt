fun main(){
    val n = readLine()!!.toInt()
    val a = (0..n*2-1).map{readLine()!!.split(" ").map{it.toInt()}}
  	var cnt = 0
    for ((i,v) in a.withIndex()){
      	if(i%2==0)
      	else {
          println(v.filter{it->it%2!=0}.size)
        }
    }

}
fun main(args:Array<String>) {
    val (N,A,B) = readLine()!!.split(" ").map{it.toInt()}
    var graph = (0..N-2).map{readLine()!!.split(" ").map{it.toInt()}}.toMutableList()
  	var tmp = mutableListOf<List<Int>>()
  	
  	
  	for (i in graph){
      if(i[1]==A)tmp.add(i)
      
      if(i[1]==B)tmp.add(i)
    }
  
  	print(tmp)
}

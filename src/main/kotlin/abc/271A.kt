fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
  	var NN = Integer.toHexString(N).toString().toUpperCase()
  	if(NN.length==1) NN = "0"+NN
    print(NN)

}
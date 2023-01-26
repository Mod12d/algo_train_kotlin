fun main() {
    val n = readLine()!!.toInt()
    var cnt = 1
    var ret = 0
    for(i in 1..9){
        i+i
        if(i.toString().toCharArray()[0]==i.toString().toCharArray()[1]
           &&i.toString().toCharArray()[4]==i.toString().toCharArray()[5]
           &&i.toString().toCharArray()[6]==i.toString().toCharArray()[8]
            ){
            if(n==cnt){
                break
                ret = n
            }
            cnt++
        }
        }
    print(ret)
}

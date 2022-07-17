fun main(){
    var K = readLine()!!.toInt()
    var I = (K/60 + 21)
    var i = (K%60)

    if(I>=24 && i>0){
        I = 0+K/60
    }
    var II = I.toString()
    var ii = i.toString()
    if(I.toString().length<2)II='0'+I.toString()
    if(i.toString().length<2)ii='0'+i.toString()
    print(II + ":" +ii)
}
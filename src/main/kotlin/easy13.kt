fun main(){

    var (a, b,c ) = readLine()!!.split(' ').map(String::toInt)
    var flg = true
    var cnt = 0

    while(flg){
        if(a%2==0 && b%2==0 && c%2==0){
            a = a/2
            b = b/2
            c = c/2
            cnt++
        }
        else{
            break
        }
    }
    print(cnt)

}
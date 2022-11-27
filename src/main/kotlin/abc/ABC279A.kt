//git
fun main(){
    val S = readLine()!!
    val T = readLine()!!
    if(S.length>=T.length && T.contains(S)) print("Yes") else print("No")
}
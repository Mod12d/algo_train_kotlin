
fun check(S:String) :Boolean{
  val alpha = ArrayList<String>()
  val num = ArrayList<String>()
  val c = 'A'
  while(c <= 'Z'){
    alpha.add(c.toString())
  }

  if(S.length!=8)return false
  else if(!(S[0].toString() in alpha)) return false
  else if(!(S.substring(1,6).toInt()<100000 && S.substring(1,6).toInt()>999999 )) return false
  else if(!(S[7].toString() in alpha)) return false
  else return true
}

fun main() {
    val reader = System.`in`.bufferedReader()
    val S = readLine()!!
    //reader.close()
    if(check(S)) print("Yes") else print("No")
}

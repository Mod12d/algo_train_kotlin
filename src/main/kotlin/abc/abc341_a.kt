package abc

class ABC341A {
    fun run() {
        val n = readLine()!!.toInt() // Reads input from the user and converts it to an integer

        print('1') // Prints '1'

        repeat(n) {
            // Repeats the following block of code 'n' times
            print("01") // Prints "01" each time it repeats
        }
    }
}

fun main() {
    val abc = ABC341A() // Create an instance of the ABC341A class
    abc.run() // Call the run function of the instance
}
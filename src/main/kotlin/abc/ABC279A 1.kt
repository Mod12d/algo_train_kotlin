
//fun main(args: Array<String>) {
//    val (row,column) = readLine()!!.split(" ").map{it.toInt()}
//    val matrix = (0..column).map{readLine()!!.split("")}
//
//    // Display current matrix
//    display(matrix)
//
//    // Transpose the matrix
//    val transpose = Array(column) { Array<String>(row) }
//    for (i in 0..row - 1) {
//        for (j in 0..column - 1) {
//            transpose[j][i] = matrix[i][j]
//        }
//    }
//
//    // Display transposed matrix
//    display(transpose)
//}

//fun display(matrix: Array) {
//    println("The matrix is: ")
//    for (row in matrix) {
//        for (column in row) {
//            print("$column    ")
//        }
//        println()
//    }
//}

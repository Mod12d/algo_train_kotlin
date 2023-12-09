//import java.util.*
//import kotlin.math.*
//
//fun main(args: Array<String>) {
//    val (n ,s,m,l) = readLine()!!.split(" ").map{it.toInt()}
//
//   val target = n  // 目標とする卵の総数
//    val maxPossible = target + sizes.maxOrNull()!!  // 最大探索範囲
//    val dp = IntArray(maxPossible + 1) { Int.MAX_VALUE }
//    val packCombination = Array(maxPossible + 1) { mutableListOf<Int>() }
//    dp[0] = 0
//
//    for (i in 1..maxPossible) {
//        for (size in sizes) {
//            if (i >= size && dp[i - size] != Int.MAX_VALUE) {
//                if (dp[i] > dp[i - size] + 1) {
//                    dp[i] = dp[i - size] + 1
//                    packCombination[i] = mutableListOf(size).apply {
//                        addAll(packCombination[i - size])
//                    }
//                }
//            }
//        }
//    }
//
//    // 目標以上で最小の組み合わせを探す
//    val resultIndex = dp.indices.firstOrNull { it >= target && dp[it] != Int.MAX_VALUE }
//    if (resultIndex == null) {
//        println("解が存在しません。")
//    } else {
//        println("必要な最少のパック数: ${dp[resultIndex]}")
//        println("使用するパックの組み合わせ: ${packCombination[resultIndex]}")
//    }
//}
//

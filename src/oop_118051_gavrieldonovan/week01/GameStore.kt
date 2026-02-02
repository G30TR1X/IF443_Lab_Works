package oop_118051_gavrieldonovan.week01

fun main() {
    val gameTitle: String
    val price: Int
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)
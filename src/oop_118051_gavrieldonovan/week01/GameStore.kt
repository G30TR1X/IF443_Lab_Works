package oop_118051_gavrieldonovan.week01

fun main() {
    val gameTitle: String = "There Is No Game"
    val price: Int = 600000

    println("Title: $gameTitle, Original Price: $price")
    printReceipt(finalPrice = price, title = gameTitle)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int) {
    println("Title: $title, Final price: ${calculateDiscount(finalPrice)}")
}
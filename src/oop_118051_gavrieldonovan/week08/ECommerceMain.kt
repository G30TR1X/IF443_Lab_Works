package oop_118051_gavrieldonovan.week08

import oop_118051_gavrieldonovan.week06.processCheckout

fun main() {
    val rawApiData: List<Map<String, Any>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not an Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD"),
        )

    val parser = ApiParser()
    for (raw in rawApiData) {
        try {
            val parsedData: Product? = parser.parseProduct(raw)
            parsedData?.let { product ->
                parser.checkout(product)
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}
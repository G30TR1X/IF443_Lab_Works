package oop_118051_gavrieldonovan.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        try {
            val id: String = requireNotNull(rawJson["id"]) {
                "API Invalid: Missing id"
            } as String
            val name = requireNotNull(rawJson["name"]) {
                "API Invalid: Missing name"
            } as String

            val type = rawJson["type"] as? String
            if (type == "ELECTRONIC") {
                val warranty = rawJson["warranty"] as? Int ?: 12
                return Product.Electronic(id, name, warranty)
            } else if (type == "CLOTHING") {
                val size =  rawJson["size"] as? String ?: "All Size"
                return Product.Clothing(id, name, size)
            }
        } catch(e: IllegalArgumentException) {
            println(e.message)
        }

        return null
    }

    fun checkout(product: Product) {
        val id: String = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        val result: String = JavaPaymentService.processPayment(id)!!
        println(result)
    }
}
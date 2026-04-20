package oop_118051_gavrieldonovan.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "Long", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "Short", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "Long", 5, 2.0, "OPEN"),
        TradeLog("DOTBTC", "Short", 3, 12.8, "CLOSED"),
        TradeLog("ADAUSDT", "Long", 10, -1.5, "OPEN"),
        TradeLog("BNBUSDT", "Short", 25, 45.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}
package oop_118051_gavrieldonovan.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")

    try {
        return TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        return null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach { out.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch(e: FileNotFoundException) {
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 150.0, 25.5),
        TradeRecord(2, "ETHUSDT", "SHORT", 200.0, -12.3),
        TradeRecord(3, "BTCUSDT", "LONG", 100.0, 40.0)
    )

    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY")

    val loadedData= loadTrades("crypto_trades.csv")
    println("Trades PNL sum: ${loadedData.sumOf { it.pnl }}\n")

    var totalPnl = 0
    loadedData.forEach { trade ->
        println("Trade ID:${trade.id}, Symbol:${trade.symbol}, Type:${trade.type},  Margin:${trade.margin}, PNL:${trade.pnl}")
        ++totalPnl
    }

    println("=== TOTAL PnL BERSIH: $totalPnl ===")
}

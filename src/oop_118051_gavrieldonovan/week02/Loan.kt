package oop_118051_gavrieldonovan.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration <= 3) 0 else (loanDuration - 3) * 2000
    }
}
package oop_118051_gavrieldonovan.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    /* Guided Lab
    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
    */

    /* Tugas Mandiri 1
    print("Masukan Judul: ")
    val title = scanner.nextLine()

    print("Masukan Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam: ")
    var duration = scanner.nextInt()

    if (duration < 0)
        duration = 1

    val loanBook = Loan(title, borrower, duration)
    println("Judul Buku: ${loanBook.bookTitle}\nPeminjam: ${loanBook.borrower}\nLama Pinjam: ${loanBook.loanDuration}")
    */

    /* Tugas Mandiri 2 */
    print("Masukan Nama Hero: ")
    val name: String = scanner.nextLine()

    print("Masukan Damage Hero: ")
    val damage: Int = scanner.nextInt()

    val hero: Hero = Hero(name, damage)
    var enemyHp: Int = 100
    while (hero.isAlive() && enemyHp > 0) {
        println("Menu:\n1. Serang\n2. Kabur")
        print("Masukan Opsi: ")
        val opsi: Int = scanner.nextInt()
        if (opsi == 1) {
            enemyHp -= hero.baseDamage
            println("Sisa HP Musuh: $enemyHp")
            if (enemyHp > 0) {
                hero.takeDamage((10..20).random())
                println("Sisa HP Hero: ${hero.hp}")
                if (hero.hp <= 0)
                    break
            } else {
                println("Musuh telah dikalahkan, Hero menang!!!\n")
            }
        } else if (opsi == 2) {
            println("Hero kabur dari pertempuran!\n")
            break
        } else {
            println("Opsi tidak sesuai!\n")
        }
    }

    println("\n\nHP Hero Akhir: ${hero.hp}\nHP Musuh Akhir: $enemyHp")
    if (hero.isAlive()) {
        if (enemyHp > 0)
            println("Hero kabur dan gagal mengalahkan musuh!\n")
        else
            println("Hero berhasil mengalahkan musuh!\n")
    } else {
        println("Hero mati dikalahkan oleh musuh!\n")
    }
}

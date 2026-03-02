package oop_118051_gavrieldonovan.week05

fun main() {
    /*
    // val pegawai1 = Pegawai("Rah")
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("------------------------------")
     */

    println("=== MATH HELPER TEST ===")
    val mathHelper: MathHelper = MathHelper()
    val luasPersegi = mathHelper.hitungLuas(4)
    val luasPersegiPanjang = mathHelper.hitungLuas(5, 6)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi dengan sisi 4: $luasPersegi")
    println("Luas Persegi Panjang dengan panjang 5 dan lebar 6: $luasPersegiPanjang")
    println("Luas Lingkaran dengan jari jari 7: $luasLingkaran")
}
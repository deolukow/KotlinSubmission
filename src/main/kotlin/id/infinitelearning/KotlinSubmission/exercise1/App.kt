package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    var namaDepan: String = "Excelsis"
    var namaBelakang: String = "Deo Lukow"
    var umur: Number = 19
    var single: Boolean = false

    println("Nama saya adalah $namaDepan $namaBelakang")
    println("umur saya sekarang $umur Tahun")
    if (single){
        println("Status saya masih single" )
    } else {
        println("Status saya Tidak single anymore" )
    }

}
        /**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
            println(groupId)
            println(groupMember)
            println(session)

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val daftarAnggota = arrayOf("Icha", "Deo", "Aristo", "Darma", "Adell")
    val namaSaya = daftarAnggota[1]
    return "$namaSaya"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    val totalMember = mentor.count() + countOfGroup
    return totalMember

}

fun main() {

    println("=================================================================================================================================\n")
    myProfile()
    println("\n=================================================================================================================================\n")

    val myName = myName()
    println("My Name is: $myName")
    println("\n=================================================================================================================================\n")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")
    println("\n=================================================================================================================================\n")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(5, listOf("Adellina Sylvira Azis", "Ahmad Darma Wijaya Atenza", "Aristo Demos", "Excelsis Deo Lukow", "Icha Sinaga"), "Morning")
    println("\n=================================================================================================================================\n")

}
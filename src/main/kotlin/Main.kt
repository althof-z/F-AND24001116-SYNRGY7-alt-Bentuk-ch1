import kotlin.system.exitProcess

fun main() {

    do {
        val menuTerpilih: Int = displayMainMenu()
        val jumlahBaris: Int = numberOfRows()

        val objBentukAbsurd = BentukAbsurd(jumlahBaris)
        val objBentuk = Bentuk(jumlahBaris)

        when (menuTerpilih) {
            1 -> objBentuk.segitigaNormal()
            2 -> objBentuk.segitigaTerbalik()
            3 -> objBentukAbsurd.belahKetupat()
            4 -> objBentukAbsurd.garisSilang()
            5 -> objBentuk.segitigaOutline()
            6 -> return
            else -> {
                println("Silahkan Masukan Pilihan Dengan Benar!!!")
                continue
            }
        }

    }while(validationStay())
}

// 1 task 1 function
fun displayMainMenu(): Int {
    while (true) {
        print(
            """
                    =========================
                    PILIHLAH ANGKA DARI MENU
                    1. Segitiga 
                    2. Segitiga Terbalik
                    3. Belah Ketupat
                    4. Garis Silang
                    5. Segitiga Outline
                    6. Keluar
                    =========================
                    Pilih Tampilan: 
                """.trimIndent()
        )

        val menuTerpilih = readlnOrNull()?.toIntOrNull()

        if (menuTerpilih == null || menuTerpilih <= 0 || menuTerpilih > 6) {
            println("Masukkan angka yang valid!")
            continue
        }else if (menuTerpilih == 6){
            exitProcess(0)
        }
        return menuTerpilih
    }
}

fun numberOfRows(): Int{
    while (true) {
        print("Berapa Jumlah Baris yang anda inginkan: ")
        val userInput = readlnOrNull()?.toIntOrNull()

        if (userInput == null || userInput <= 0) {
            println("Masukkan angka yang valid!")
            continue
        }

        return userInput
    }
}

fun validationStay(): Boolean {
    var stay : Boolean
    while (true) {
        print("\nApakah Anda ingin tetap berada dalam aplikasi? (Y/T): ")
        stay = when (readln().uppercase()) {
            "Y" -> true
            "T" -> false
            else -> {
                println("MASUKAN Y / T !!!")
                continue
            }

        }
        return stay
    }
}
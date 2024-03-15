open class Bentuk(jumlahBaris: Int) {
    // encapsulation
    var jumlahBaris: Int
    init {
        this.jumlahBaris = jumlahBaris
    }

    fun segitigaTerbalik(){
        for (i in jumlahBaris.downTo(1)){
            for(j in jumlahBaris.downTo(i+1)){
                print(" ")
            }
            for(k in (2*i-1).downTo(1)){
                print("*")
            }
            print("\n")
        }
    }
    fun segitigaNormal(){
        for (i in 1..jumlahBaris) {
            for (j in i until jumlahBaris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                print("*")
            }
            print("\n")
        }

    }

    fun segitigaOutline(){
        for (i in 1..jumlahBaris) {
            for (j in i until jumlahBaris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                val random = (31..39).random()
                // a little easter edd ( rainbow )
                val color = "\u001b["+random+"m"
                val resetColor = "\u001b[39m"
                if(i == jumlahBaris) {
                    if(k%2 != 0){
                        print(color + "*" + resetColor)
                    }else{
                        print(" ")
                    }
                }else if(k== 1 || k == ((2*i)-1)){
                    print(color + "*")
                }
                else{
                    print(" ")
                }
            }
            print("\n")
        }
    }
}
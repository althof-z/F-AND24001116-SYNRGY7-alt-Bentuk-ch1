import kotlin.math.ceil

class BentukAbsurd(jumlahBaris: Int) : Bentuk(jumlahBaris) { //inheritance
    init{
        this.jumlahBaris = ceil((jumlahBaris.toDouble())/2).toInt()
    }

    fun garisSilang(){

        for (i in jumlahBaris.downTo(1)){
            for(j in jumlahBaris.downTo(i+1)){
                print(" ")
            }
            for(k in (2*i-1).downTo(1)){
                if(k== 1 || k == ((2*i)-1)){
                    print("*")
                }else{
                    print(" ")
                }
            }
            print("\n")
        }

        for (i in 2..jumlahBaris) {
            for (j in i until jumlahBaris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                if(k== 1 || k == ((2*i)-1)){
                    print("*")
                }else{
                    print(" ")
                }
            }
            print("\n")
        }
    }
    fun belahKetupat(){

        for (i in 1 until jumlahBaris){
            for(j in i until jumlahBaris){
                print(" ")
            }
            for(k in 1 until 2*i){
                print("*")
            }
            print("\n")
        }

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
}
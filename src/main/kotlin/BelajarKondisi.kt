fun main(){
    var nilai = 80

//    if (nilai > 50) {
//        println("Anda mendapatkan nilai A")
//    } else {
//        println("Anda mendapatkan nilai B")
//    }
    if ((nilai >=80) && (nilai <=100)){
        println("Nilai anda = A")
    } else if ((nilai < 81) && (nilai >=61)) {
        println("Nilai anda = B")
    } else if ((nilai < 61) && (nilai >=41)) {
        println("Nilai anda = C")
    } else if ((nilai < 41) && (nilai >=21)) {
        println("Nilai anda = D")
    } else {
        println("Nilai anda salah")
    }

}
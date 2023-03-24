fun main() {
    val numbers = arrayOf(30, 26, 70, 40, 32, 20, 11, 80)


    for (number in numbers)
        if (number % 2 == 0) {
            println("$number Bilangan Genap")
        } else {
            println("$number Bilangan Ganjil")
        }

//        val numbers = intArrayOf(30, 26, 70, 40, 32, 20, 11, 80)
//
//        // Mencetak bilangan genap
//        val evenNumbers = numbers.filter { it % 2 == 0 }
//        println("Bilangan genap: $evenNumbers")
//
//        // Mencetak bilangan ganjil
//        val oddNumbers = numbers.filter { it % 2 != 0 }
//        println("Bilangan ganjil: $oddNumbers")


//    when (nilai){
//        100 -> println("Sempurna")
//        90,91,92,93,94,95,96,97,98,99 -> println("Sangat Baik")
//        in 80..89 -> print("Baik")
//        !in 0..100 -> print("Nilai Tidak Valid")
//        else -> print("cukup")
//    }
    }
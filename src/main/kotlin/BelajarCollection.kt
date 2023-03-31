fun main() {
    var hari = listOf("Senin", "Selasa", "Rabu", "Kamis", null, null, "Senin")
    println(hari)
    println(hari[0])
    println(hari.get(2))

    var hariMutable = mutableListOf("Senin", "Selasa", "Rabu", "Kamis", null, null, "Senin")
    println(hariMutable)
    hariMutable[4] = "Jum'at"
    hariMutable.set(5, "Sabtu")
    println(hariMutable)

    hariMutable.removeAt(6)
    println(hariMutable)
    hariMutable.add("Minggu")
    println(hariMutable)

    hariMutable.forEach{
        print("$it, ")
    }
    println()
    for (day in hariMutable) {
        print("$day, ")
    }
}
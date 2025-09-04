fun main() {
    missionOne()
}

fun missionOne() {
    println("Сортировка (Задание 2)")
    val listWords: List<String> = readLine()!!.split(" ")
    printList(listWords)
    missionTwo(listWords)
}

fun missionTwo(listWords: List<String>) {
    println("Сортировка (Задание 2)")

    val listWordsSorted = listWords.sorted()

    printList(listWordsSorted)
    missionThree(listWordsSorted)
}

fun missionThree(list: List<String>) {
    printList(list.distinct())
}

fun printList(list: List<String>) {
    for (item in list) {
        println(item)
    }
}
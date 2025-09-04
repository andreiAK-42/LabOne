data class WordsListWithRepeatCounter(var word: String, var repeatCounter: Int)

fun printDifficultList(list: MutableList<WordsListWithRepeatCounter>) {
    for (item in list) {
        println("${item.word} ${item.repeatCounter}")
    }
}

fun printList(list: List<String>) {
    for (item in list) {
        println(item)
    }
}
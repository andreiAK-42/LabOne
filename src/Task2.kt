/* Слова из предыдущего задания должны быть отсортированы по алфавиту */
fun main(args: Array<String>) {
    val listWords: List<String> = args.toList()
    val listWordsSorted = listWords.sorted()

    printList(listWordsSorted)
}
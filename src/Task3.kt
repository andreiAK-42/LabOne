/* Слова из предыдущего задания должны быть уникальными. */
fun main(args: Array<String>) {
    val listWords: List<String> = args.toList()
    printList(listWords.distinct())
}
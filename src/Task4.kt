/* После каждого слова выведите количество его повторений. */
fun main(args: Array<String>) {
    val listWords: List<String> = args.toList()
    val newList: MutableList<WordsListWithRepeatCounter> = arrayListOf()

    for (item in listWords.distinct()) {
        newList.add(WordsListWithRepeatCounter(item, listWords.count{ it == item }))
    }

    printDifficultList(newList)
}
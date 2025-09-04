/* Список должен быть отсортирован сначала по количеству повторений в
обратном порядке, в случае одинакового количества – по алфавиту */
fun main(args: Array<String>) {
    val listWords: List<String> = args.toList()
    val newList: MutableList<WordsListWithRepeatCounter> = arrayListOf()

    for (item in listWords.distinct()) {
        newList.add(WordsListWithRepeatCounter(item, listWords.count{ it == item }))
    }

    printDifficultList(newList.sortedWith(compareBy({ it.word }, { it.repeatCounter })).sortedByDescending { it.repeatCounter } as MutableList<WordsListWithRepeatCounter>)
}
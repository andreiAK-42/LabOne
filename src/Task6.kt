/* Если вашему приложению из задания 5 не передано ни одного параметра, то считайте список слов для сортировки из
стандартного потока ввода (stdin), чтобы ваше приложение дополнительно могло запускаться вот так:
echo "the quick brown fox jumps over the lazy dog" | java -jar yourapp.jar */
fun main(args: Array<String>) {
    var listWords: List<String> = listOf()

    if (args.isEmpty()) {
        listWords = readLine()!!.split(" ")
    }
    else {
        listWords = args.toList()
    }

    val newList: MutableList<WordsListWithRepeatCounter> = arrayListOf()

    for (item in listWords.distinct()) {
        newList.add(WordsListWithRepeatCounter(item, listWords.count{ it == item }))
    }

    printDifficultList(newList.sortedWith(compareBy({ it.word }, { it.repeatCounter })).sortedByDescending { it.repeatCounter } as MutableList<WordsListWithRepeatCounter>)
}
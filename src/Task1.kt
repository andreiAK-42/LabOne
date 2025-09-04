/* Напишите приложение, которое на вход через параметры командной строки получит текст и выдаст список слов,
разделенных пробельными символами. */
fun main(args: Array<String>) {
    val listWords: List<String> = args.toList()

    printList(listWords)
}
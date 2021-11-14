fun main(args: Array<String>) {

    println(calculate("two-one-zero-five"))
    println(calculate("four-seven-one-eight-three"))
    println(calculate("nine-two-six-zero-four"))
    println(calculate("three-eight-ten"))

}

fun calculate(input: String): String {

    val words = input.split("-").map { it.trim() }
    val numbers: MutableList<Int> = mutableListOf()

    for (elem in words) {
        when (elem) {
            "zero" -> numbers.add(0)
            "one" -> numbers.add(1)
            "two" -> numbers.add(2)
            "three" -> numbers.add(3)
            "four" -> numbers.add(4)
            "five" -> numbers.add(5)
            "six" -> numbers.add(6)
            "seven" -> numbers.add(7)
            "eight" -> numbers.add(8)
            "nine" -> numbers.add(9)
            else -> throw Exception("Only numbers 0-9 accepted as input")
        }
    }

    return  numbers.joinToString ( "+", postfix = "=" ) + numbers.sum()
}
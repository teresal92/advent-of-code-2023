fun main() {

    val stringToInt: Map<String, Int> = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    fun findCalibrationValue(chars: List<Char>): Int {
        val digits = chars.filter { it.isDigit() }
        val calibrationString = "" + digits.first() + digits.last()
        return calibrationString.toInt()
    }

    fun part1(input: List<String>): Int {
        return input.fold(0) { sum, line -> sum + findCalibrationValue(line.toList()) }
    }

    fun generateListOfValidDigits(line: String): List<String> {
        return stringToInt.keys.filter { line.contains(it)}
    }

    fun part2(input: List<String>): List<List<String>> {
        val newList = input.map {  line -> generateListOfValidDigits(line) }
        return newList
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 142)
//    check(part2(testInput) == 281)
//    part1(testInput).println()
    part2(testInput).println()


    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}

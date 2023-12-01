fun main() {
    fun part1(input: List<String>): Int {
        return input.map {
            it.find { it.isDigit() }.toString() + it.findLast { it.isDigit() }
        }.sumOf { it.toInt() }
    }

    fun part2(input: List<String>): Int {
        return part1(input.map {
            it.replace("one","one1one")
                .replace("two","two2two")
                .replace("three","three3three")
                .replace("four","four4four")
                .replace("five","five5five")
                .replace("six","six6six")
                .replace("seven","seven7seven")
                .replace("eight","eight8eight")
                .replace("nine","nine9nine")
        })
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("testinput")
    println(part2(testInput))
    check(part2(testInput) == 281)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}

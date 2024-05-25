fun main() {
    println("Repo para 100 challenge algoExperts")
    testCaesarCipherEncryptor()
    testIsPalindrome()
    testCommonCharacters()

    println("\n=====================\n")
    testTwoNumberSum()
    testIsValidSubsequence()
    testSortedSquaredArray()
    testTournamentWinner()
    testNonConstructibleChange()
    testFind()
    testTransposeMatrix()
    // Adicione chamadas de função para outros testes aqui
}

fun testCaesarCipherEncryptor() {
    val testCases = listOf(
        Pair("xyz", 2),
        Pair("abc", 0),
        Pair("abc", 3),
        Pair("xyz", 5),
        Pair("abc", 26),
        Pair("abc", 52),
        Pair("abc", 57),
        Pair("xyz", 25),
        Pair("iwufqnkqkqoolxzzlzihqfm", 25),
        Pair("ovmqkwtujqmfkao", 52),
        Pair("mvklahvjcnbwqvtutmfafkwiuagjkzmzwgf", 7),
        Pair("kjwmntauvjjnmsagwgawkagfuaugjhawgnawgjhawjgawbfawghesh", 15)
    )

    for ((string, key) in testCases) {
        val output = StringsDS.caesarCipherEncryptor(string, key)
        println("caesarCipherEncryptor: $output")
    }
}

fun testIsPalindrome() {
    val string = "abcdedcba"
    println("isPalindrome: ${StringsDS.isPalindrome(string)}")
}

fun testCommonCharacters() {
    val list = mutableListOf("abc", "bcd", "cbad")
    println("commonCharacters: ${StringsDS.commonCharacters(list)}")
}


fun testTwoNumberSum() {
    val array = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
    val targetSum = 10
    println("twoNumberSum: ${Array.twoNumberSum(array, targetSum)}")
}

fun testIsValidSubsequence() {
    val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    val sequence = listOf(1, 6, -1, 10)
    println("isValidSubsequence: ${Array.isValidSubsequence(array, sequence)}")
}

fun testSortedSquaredArray() {
    val array = listOf(1, 2, 3, 5, 6, 8, 9)
    println("sortedSquaredArray: ${Array.sortedSquaredArray(array)}")
}

fun testTournamentWinner() {
    val competitions = listOf(
        listOf("HTML", "C#"),
        listOf("C#", "Python"),
        listOf("Python", "HTML"),
    )
    val results = listOf(0, 0, 1)
    println("tournamentWinner: ${Array.tournamentWinner(competitions, results)}")
}

fun testNonConstructibleChange() {
    val coins = mutableListOf(5, 7, 1, 1, 2, 3, 22)
    println("nonConstructibleChange: ${Array.nonConstructibleChange(coins)}")
}

fun testFind() {
    val words = mutableListOf("baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz")
    val note = "ctay"
    println("find: ${Array.find(words, note)}")
}

fun testTransposeMatrix() {
    val matrix = mutableListOf(
        mutableListOf(1, 2, 3),
        mutableListOf(4, 5, 6),
        mutableListOf(7, 8, 9)
    )
    println("transposeMatrix: ${Array.transposeMatrix(matrix)}")
}
// Adicione funções de teste para outros algoritmos aqui
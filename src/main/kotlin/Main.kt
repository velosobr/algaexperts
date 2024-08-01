fun main() {
    println("Repo para 100 challenge algoExperts")

    println("\n=====================\n")
    println("\n========ARRAY=======\n")
    println("\n=====================\n")
    testTwoNumberSum()
    testIsValidSubsequence()
    testSortedSquaredArray()
    testTournamentWinner()
    testNonConstructibleChange()
    testFind()
    testTransposeMatrix()
    println("\n=====================\n")
    println("\n========STRING=======\n")
    println("\n=====================\n")
    testIsPalindrome()
    testCommonCharacters()
    testCaesarCipherEncryptor()
    println("\n=====================\n")
    println("\n========BINARY SEARCH TREES=======\n")
    println("\n=====================\n")
    testFindClosestValueInBst()
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
    val testCases = listOf(
        Pair(listOf("abc", "bcd", "cbad"), listOf("b", "c")),
        Pair(listOf("a"), listOf("a")),
        Pair(listOf("a", "b", "c"), listOf()),
        Pair(listOf("aa", "aa"), listOf("a")),
        Pair(listOf("aaaa", "a"), listOf("a")),
        Pair(listOf("abcde", "aa", "foobar", "foobaz", "and this is a string", "aaaaaaaa", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea"), listOf("a")),
        Pair(listOf("abcdef", "fedcba", "abcefd", "aefbcd", "efadbc", "effffffffffffbcda", "eeeeeffffffbbbbbaaaaaccccdddd", "**************abdcef************"), listOf("a", "b", "c", "d", "e", "f")),
        Pair(listOf("ab&cdef!", "f!ed&cba", "a&bce!d", "ae&fb!cd", "efa&!dbc", "eff!&fff&fffffffbcda", "eeee!efff&fffbbbbbaaaaaccccdddd", "*******!***&****abdcef************", "*******!***&****a***********f*", "*******!***&****b***********c*"), listOf("&", "!")),
        Pair(listOf("*abcd", "def*", "******d*****"), listOf("*", "d")),
        Pair(listOf("*abc!d", "de!f*", "**!!!****d*****"), listOf("*", "!", "d"))
    )

    for ((strings, expected) in testCases) {
        val output = StringsDS.commonCharacters(strings.toMutableList())
        println("commonCharacters: $output")
        assert(output == expected) { "Expected $expected but got $output" }
    }
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

fun testFindClosestValueInBst() {
    val tree = BinarySearchTrees.BST(10)
    tree.left = BinarySearchTrees.BST(5)
    tree.right = BinarySearchTrees.BST(15)
    tree.left?.left = BinarySearchTrees.BST(2)
    tree.left?.right = BinarySearchTrees.BST(5)
    tree.left?.left?.left = BinarySearchTrees.BST(1)
    tree.right?.left = BinarySearchTrees.BST(13)
    tree.right?.right = BinarySearchTrees.BST(22)
    tree.right?.left?.right = BinarySearchTrees.BST(14)
    val target = 12
    val expected = 13
    println("findClosestValueInBst: ${BinarySearchTrees.findClosestValueInBst(tree, target)} == $expected")
}
// Adicione funções de teste para outros algoritmos aqui
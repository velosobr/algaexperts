fun main() {
    println("Repo para 100 challenge algoExperts")

    var array: MutableList<Int> = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
    val targetSum = 10
    println("twoNumberSum: ${Array.twoNumberSum(array, targetSum)}")
    val isValidSubsequenceArray = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    val sequence = listOf(1, 6, -1, 10)
    println("isValidSubsequence: ${Array.isValidSubsequence(isValidSubsequenceArray, sequence)}")
    val sortedSquaredArrayArray = listOf(1, 2, 3, 5, 6, 8, 9)
    val sortedSquaredArrayArray2 = listOf(-1, -1, 2, 3, 3, 3, 4)
    val sortedSquaredArrayArray3 = listOf(-3, -2, -1)
    val sortedSquaredArrayArray4 = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    println("sortedSquaredArray: ${Array.sortedSquaredArray(sortedSquaredArrayArray)}")
    println("sortedSquaredArrayArray2: ${Array.sortedSquaredArray(sortedSquaredArrayArray2)}")
    println("sortedSquaredArrayArray3: ${Array.sortedSquaredArray(sortedSquaredArrayArray3)}")
    println("sortedSquaredArrayArray4: ${Array.sortedSquaredArray(sortedSquaredArrayArray4)}")

    val competitions = listOf(
        listOf("HTML", "C#"),
        listOf("C#", "Python"),
        listOf("Python", "HTML"),
    )
    val results = listOf(0, 0, 1)
    println("tournamentWinner: ${Array.tournamentWinner(competitions, results)}")
    val coins = mutableListOf(20)
    println("nonConstructibleChange: ${Array.nonConstructibleChange(coins)}")
}

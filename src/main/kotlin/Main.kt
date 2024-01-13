fun main() {
    println("Repo para 100 challenge algoExperts")

    var array: MutableList<Int> = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
    val targetSum = 10
    println("twoNumberSum: ${Array.twoNumberSum(array, targetSum)}")
    val isValidSubsequenceArray = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    val sequence = listOf(1, 6, -1, 10)
    println("isValidSubsequence: ${Array.isValidSubsequence(isValidSubsequenceArray, sequence)}")

}
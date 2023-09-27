fun main(args: Array<String>) {
    println("Hello World!")

    var array: MutableList<Int> = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
    val targetSum = 10

    println(Array.twoNumberSum(array, targetSum))

}
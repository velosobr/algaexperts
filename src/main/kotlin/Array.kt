class Array {


    companion object {
        fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
            // Write your code here.
            val list: MutableList<Int> = mutableListOf()
            outerLoop@ for (i in array) {
                innerLoop@ for (j in array) {
                    if (i != j) {
                        if (targetSum == i + j) {
                            list.add(i)
                            list.add(j)
                            break@outerLoop
                        }
                    }
                }
            }
            return list
        }

        fun twoNumberSumFromExperts(array: MutableList<Int>, targetSum: Int): List<Int> {
            // Write your code here.
            //3, 5, -4, 8, 11, 1, -1, 6
            val list: MutableList<Int> = mutableListOf()
            for (element in array) {
                val expectedPair = targetSum - element

                if (list.contains(expectedPair)) {
                    return listOf(element, expectedPair)
                }
                list.add(element)
            }
            return listOf()
        }
    }

}
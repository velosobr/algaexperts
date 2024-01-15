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

        fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
            var index = 0
            for (i in array.indices) {
                if (array[i] == sequence[index]) {
                    index++
                }
                if (index == sequence.size) {
                    return true
                }
            }
            return false
        }


        fun sortedSquaredArray(array: List<Int>): List<Int> {
            val returnList: MutableList<Int> = mutableListOf()
            for (i in array) returnList.add(i * i)
            return returnList.sorted()
        }

        fun sortedSquaredArrayAddInOrder(array: List<Int>): List<Int> {
            val returnList: MutableList<Int> = mutableListOf()
            var aux1 = 0
            var aux2 = 0

            for (i in array) {
                aux2 = i * i
                if (aux2 < aux1) {
                    returnList.add(aux1, aux2)
                }
                returnList.add(i * i)
            }
            return returnList.sorted()
        }

        fun sortedSquaredArrayMapFunVersion(array: List<Int>): List<Int> {
            return array.map { it * it }.sorted()
        }

        /** {
        "competitions": [
        ["HTML", "C#"],
        ["C#", "Python"],
        ["Python", "HTML"]
        ],
        "results": [0, 0, 1]
        }
         Output:
        "Python"
         */
        fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
            // Write your code here.
            var hashtable = hashMapOf<String,String>()
            for (i in competitions) {
                val auxList = competitions.get(i)
               if (!hashtable.containsValue(competitions[i],))
            }
            return ""
        }
    }

}
/**
 * Classe de estudo de Arrays
 */
class Array {


    companion object {
        /**
         * Função que recebe uma lista de inteiros e um alvo, e retorna uma lista de dois números que somam o alvo.
         * @param array A lista de inteiros.
         * @param targetSum O alvo da soma.
         * @return Uma lista de dois inteiros que somam o alvo, ou uma lista vazia se não houver tal par.
         */
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

        /**
         * Função que verifica se uma sequência é válida em um array.
         * @param array O array a ser verificado.
         * @param sequence A sequência a ser verificada.
         * @return Verdadeiro se a sequência é válida, falso caso contrário.
         */
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


        /**
         * Função que recebe uma lista de inteiros e retorna uma lista dos quadrados desses inteiros, ordenada.
         * @param array A lista de inteiros.
         * @return Uma lista dos quadrados dos inteiros, ordenada.
         */
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


        /**
         * Função que determina o vencedor de um torneio.
         * @param competitions Uma lista de competições.
         * @param results Uma lista de resultados.
         * @return O vencedor do torneio.
         */
        fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
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
            val hashtableTournament = hashMapOf<String, Int>()
            var winningTeam = ""
            var highScore = 0

            for ((i, team) in competitions.withIndex()) {
                val resultMatch = results[i]
                val teamPosition = if (resultMatch == 0) 1 else 0
                val actualWinningTeam = team[teamPosition]
                val oldScore = if (hashtableTournament.contains(actualWinningTeam)) {
                    hashtableTournament[actualWinningTeam]
                } else {
                    0
                }
                val newScore: Int = oldScore?.plus(3) ?: 0
                if (newScore > highScore) {
                    highScore = newScore
                    winningTeam = actualWinningTeam
                }
                hashtableTournament[actualWinningTeam] = newScore

            }
            return winningTeam
        }

        fun tournamentWinner2(competitions: List<List<String>>, results: List<Int>): String {
            val scores = mutableMapOf<String, Int>()
            var winningTeam = ""
            var highScore = 0

            competitions.forEachIndexed { index, (team1, team2) ->
                val actualWinningTeam = if (results[index] == 0) team2 else team1
                scores[actualWinningTeam] = scores.getOrDefault(actualWinningTeam, 0) + 3

                if (scores[actualWinningTeam]!! > highScore) {
                    highScore = scores[actualWinningTeam]!!
                    winningTeam = actualWinningTeam
                }
            }

            return winningTeam
        }

        /**
         * Função que determina a menor alteração não construtível.
         * @param coins Uma lista de moedas.
         * @return A menor alteração não construtível.
         * input
         * coins = [5,7,1,1,2,3,22]
         * output
         * 20
         */
        fun nonConstructibleChange(coins: MutableList<Int>): Int {

            coins.sort()
            //1,1,2,3,5,7,22
            var returnValue = 1
            for (i in coins) {
                if (returnValue < i) return returnValue
                else {
                    returnValue += i
                }
            }
            return returnValue
        }

        /**
         * You are running a classroom and suspect that some of your students are passing around the answer to a
         * multiple-choice question disguised as a random note.
         * Your task is to write a function that, given a list of words and a note, finds and returns the word in
         * the list that is scrambled inside the note, if any exists. If none exist, it returns the result "-" as
         * a string. There will be at most one matching word. The letters don't need to be in order or next
         * to each other. The letters cannot be reused.
         */
        fun find(words: List<String>, note: String): String {
            for (word in words) {
                if (word.all { char -> word.count { it == char } <= note.count { it == char } }) {
                    return word
                }
            }
            return "-"
        }

        fun explainedFind(words: List<String>, note: String): String {
            // Itera sobre cada palavra na lista de palavras
            for (word in words) {
                var isMatch = true

                // Itera sobre cada caractere na palavra
                for (char in word) {
                    // Verifica se a contagem de um caractere específico na palavra é menor ou igual à contagem desse caractere na nota
                    if (word.count { it == char } > note.count { it == char }) {
                        isMatch = false
                        break
                    }
                }

                // Se a condição for verdadeira para todos os caracteres na palavra, retorna a palavra
                if (isMatch) {
                    return word
                }
            }

            // Se nenhuma palavra satisfizer a condição, retorna "-"
            return "-"
        }

        fun transposeMatrix(matrix: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {

            return mutableListOf()
        }
    }

}
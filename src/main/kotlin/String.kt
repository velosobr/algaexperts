import kotlin.math.absoluteValue

class StringsDS {

    companion object {
        /**
         * Common Characters
         * Write a function that takes in a non-empty list of non-empty strongs and returns a list of characters that
         * are common to all strings in the list, ignoring multiplicity.
         *
         * Note tha the strings are not guaranteed to only contain alphanumeric characters. The List you return can be
         * in any order
         * Strings ["abc", "bcd", "cbad"]
         */
        fun commonCharacters(strings: MutableList<String>): List<String> {

            var commonCharactersList = strings[0].toList()


            for (i in 1 until strings.size) {
                println(i)
                for (letra in commonCharactersList) {
                    println(letra)
                }

            }
            return mutableListOf()
        }

        /**
         * Palindrome Check
         * write a function tha thakes in a non empty string and that returns a boolean representing whether the string
         * is a palindrome.
         *
         * A Palindrome is defined as a string thats written the same forward and backward. Note that single-character
         * strings are palindromes.
        Sample:"abcdcba"
         */
        fun isPalindrome(string: String): Boolean {
            val length = string.length
            for (i in 0..<length/2) {
                if (string[i] != string[length-i -1]){
                    return false
                }
            }
            return true
        }
    }
}
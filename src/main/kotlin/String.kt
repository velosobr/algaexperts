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
         * Sample input
         * strings = ["abc", "bcd", "cbaccd"]
         * Sample output
         * ["b", "c"]
         */
        fun commonCharacters(strings: MutableList<String>): List<String> {
            val outputCharacters = mutableListOf("")

            val firstString = strings[0]

            for (char in strings) {

            }




            return outputCharacters
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
            for (i in 0..<length / 2) {
                if (string[i] != string[length - i - 1]) {
                    return false
                }
            }
            return true
        }

        /**
         * Caesar Cipher Encrypter
         * Given an non-empty string of lowercase letters and a non-negativa
         * integer representing a key, write a function that returns a new string
         * obtained by shifting every letter in the unput string by k positions in
         * the alphabet, where k is the key.
         *
         * Note that letter should "wrap" around the alphabet; in other words, the letter Z shifted
         * by one returns the letter A.
         *
         * Sample Input
         * string = "xyz"
         * key = 2
         *
         * Sample Output
         * "zab"
         */
        fun caesarCipherEncryptor(string: String, key: Int): String {
            val alphabet = "abcdefghijklmnopqrstuvwxyz"
            var outputString = ""

            for (letter in string) {
                var position = alphabet.indexOf(letter)
                var newPosition = position + key
                while (newPosition >= alphabet.length) {
                    newPosition -= alphabet.length
                }

                val newLetter = alphabet[newPosition]
                outputString += newLetter
            }

            return outputString
        }



    }

}
import kotlin.math.abs

class BinarySearchTrees {

    companion object {

        /**
         * Find Closest Value in BST
         * Write a function that takes in a Binary Search Tree (BST) and a target integer value and returns the closest
         * value to that target value contained in the BST.
         *
         * You can assume that there will only be one closest value.
         *
         * Each BST node has an integer value, a left child node, and a right child node. A node is said to be a valid
         * BST node if and only if it satisfies the BST property: its value is strictly greater than the values of every
         * node to its left; its value is less than or equal to the values of every node to its right; and its children
         * nodes are either valid BST nodes themselves or None/null.
         *
         * Sample input:
         * tree = 10
         *      /    \
         *     5      15
         *    / \    /  \
         *   2   5  13  22
         *  /        \
         * 1         14
         * target = 12
         *
         * Sample output:
         * 13
         */
        fun findClosestValueInBst(tree: BST, target: Int): Int {
            // Write your code here.
            var currentNode: BST? = tree
            var closestValue = tree.value

            while (currentNode != null) {
                if(abs(target - closestValue) > abs(target - currentNode.value)) {
                    closestValue = currentNode.value
                }
                if (target < currentNode.value) {
                    currentNode = currentNode.left
                } else if (target > currentNode.value) {
                    currentNode = currentNode.right
                } else {
                    break
                }
            }
            return closestValue
        }

    }

    open class BST(var value: Int) {
        var left: BST? = null
        var right: BST? = null
    }
}
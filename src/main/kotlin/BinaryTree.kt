import java.util.Stack

class BinaryTree {

    companion object {
        /**
         * Branch Sums
         * Write a function that takes in a Binary Tree and returns a list of its branch sums ordered from leftmost
         * branch sum to rightmost branch sum.
         *
         * A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree branch is a path of nodes in a
         * tree that starts at the root node and ends at any leaf node.
         *
         * Each BinaryTree node has an integer value, a left child node, and a right child node. Children nodes can
         * either be BinaryTree nodes themselves or None / null.
         *
         * Sample Input
         * tree =     1
         *         /     \
         *         2       3
         *       /   \    /  \
         *      4     5  6    7
         *     / \   / \
         *     8 9  10 11
         *
         * Sample Output
         * [15, 16, 18, 10, 11]
         */
        fun branchSums(root: BinaryTree): List<Int> {
            // Write your code here.
            val result = mutableListOf<Int>()
            val stack = Stack<Pair<BinaryTree, Int>>()
            stack.push(Pair(root, 0))

            while (stack.isNotEmpty()) {
                val (node, sum) = stack.pop()
                val newSum = sum + node.value
                if (node.left == null && node.right == null) {
                    result.add(newSum)
                } else {
                    node.right?.let { stack.push(Pair(it, newSum)) }
                    node.left?.let { stack.push(Pair(it, newSum)) }
                }
            }
            return result
        }

        /*
        The distance between a node in a Binary Tree and the tree's root is called the node's depth.
        Write a function that takes in a Binary Tree and returns the sum of its nodes' depths.

        Each BinaryTree node has an integer value, a left child node, and a right child node. Children nodes can either be
        BinaryTree nodes themselves or None / null.

        Sample Input
        tree =     1
                /     \
                2       3
              /   \    /  \
             4     5  6    7
            / \
            8 9

        Sample Output
        16

         */

        fun nodeDepths(root: BinaryTree): Int {
            var sum = 0
            val stack = Stack<Pair<BinaryTree, Int>>()
            stack.push(Pair(root, 0))

            while (stack.isNotEmpty()) {
                val (node, depth) = stack.pop()
                sum += depth
                node.left?.let { stack.push(Pair(it, depth + 1)) }
                node.right?.let { stack.push(Pair(it, depth + 1)) }
            }

            return sum
        }

        /*
   You're given the root node of a Binary Tree. Write a function to evaluate this tree mathematically and return a
   single resulting integer.

   All leaf nodes in the tree represent operands, which will always be integers. All of the other nodes represent
   operators. There are 4 operators supported, each of which is represented by a negative integer>

   1. Addition: -1 -Addition operator, adding the left and right subtrees.
   2. Subtraction: -2 - Subtraction operator, subtracting the right subtree from the left subtree.
   3. Multiplication: -3 Division operator, dividing the left subtree by the right subtree. If the result is a decimal,
   it should be rounded towards zero.
   4. Division: -4 - Multiplication operator, multiplying the left and right subtrees.

you can assume the tree will always be a valid expression tree. Each operator also works as a grouping symbol, meaning
the bottom of the tree is always evaluated first, regardless of the operator.

sample input
tree =    -1
       /     \
      -2       -3
     /   \    /  \
    -4    2  8    3
    / \
   2   3

sample output
6 // (((2 * 3) -2) + (8/3)) = 6
//hint

 - This problem will be easiest to solve using recursion. Can you think of what
 the recursive subproblems would be? And what is the base case?

 - For each operator, a recursive call can be made on its left and right values.
 The result of these recursive calls can then be combined using that operator.
 The base case to finish recursing will be when we reach an operand, which is
 any positive integer.

    */
        fun evaluateExpressionTree(tree: BinaryTree?): Int {
            // Write your code here.
            var result = -1

            if (tree != null){
                val leftValue = evaluateExpressionTree(tree.left)
                val rightValue = evaluateExpressionTree(tree.right)

                result = when(tree.value){
                    -1 -> leftValue + rightValue
                    -2 -> leftValue - rightValue
                    -3 -> leftValue.div(rightValue)
                    -4 -> leftValue.times(rightValue)
                    else -> tree.value
                }
            }

            return result
        }
    }


    open class BinaryTree(var value: Int) {
        var left: BinaryTree? = null
        var right: BinaryTree? = null
    }
}
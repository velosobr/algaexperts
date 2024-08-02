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

            while(stack.isNotEmpty()) {
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

            while (stack.isNotEmpty()){
                val (node, depth) = stack.pop()
                sum += depth
                node.left?.let { stack.push(Pair(it, depth + 1)) }
                node.right?.let { stack.push(Pair(it, depth + 1)) }
            }


            return sum

        }
    }

    open class BinaryTree(var value: Int) {
        var left: BinaryTree? = null
        var right: BinaryTree? = null
    }
}
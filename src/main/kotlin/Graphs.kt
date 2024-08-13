class Graphs {

    class Node(val name: String) {
        var children = mutableListOf<Node>()

    }


    companion object {
        /**
         * Depth First Search


        You're given a Node class that has a name and an array of optional children nodes. When put together, nodes form
        an acyclic tree-like structure.

        Implement the depthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using
        the Depth-first Search approach (specifically navigating the tree from left to right), stores all of the nodes'
        names in the input array, and returns it.

         * Sample Input
         * graph = A
         *        /|\
         *       B C D
         *       /\   /\
         *      E F  G H
         *        /\  \
         *       I J  K
         *
         * Sample Output
         * ["A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"]
         *
         * Hint
         *
         * The Depth-first Search algorithm works by traversing a graph branch by branch. In other words, before
         * traversing any Node's sibling Nodes, its children nodes must be traversed. How can you simply and
         * effectively keep track of Nodes' sibling Nodes as you traverse them, all the while retaining the order
         * in which you must traverse them?
         *
         * 1) The depthFirstSearch function starts by adding the root node to a stack.
         * The stack is a data structure that follows the principle of "last in, first out" (LIFO).
         * This means that the last item added to the stack will be the first one to be removed.
         *
         * 2) It then enters a loop that continues until the stack is empty.
         *
         * 3) Inside the loop, the node at the top of the stack is removed.
         *
         * 4) If this node has not been visited yet, it is added to a set of visited nodes and its name is added to
         * a result list.
         *
         * 5) Next, all the children of the node are added to the stack. This means that in the next iteration of
         * the loop, the first child that was added will be the next one to be visited.
         *
         * 6) This process continues until all nodes have been visited, at which point the function returns the list
         * of node names in the order they were visited.
         */

        fun depthFirstSearch(root: Node): List<String> {
            val stack = mutableListOf<Node>()
            val visited = mutableSetOf<Node>()
            val result = mutableListOf<String>()

            stack.add(root)

            while (stack.isNotEmpty()) {
                val node = stack.removeAt(stack.size - 1)

                if (node !in visited) {
                    visited.add(node)
                    result.add(node.name)
                    stack.addAll(node.children)
                }
            }

            return result
        }


    }
}

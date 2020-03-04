package com.ftechiz.nodelist

import java.util.*

fun main() {
    var node1 = Node(5, null)
    var node2 = Node(3, null)
    var node3 = Node(7, null)

    node1.nxt = node2
    node2.nxt = node3

    val linkedList = LinkedList()

    linkedList.size(node1)
    linkedList.add(node3, node1)
    linkedList.delete(node3, node1)
    linkedList.addHead(node1)
    linkedList.deleteHead(node1)
    //linkedList.addAtPoint(node2,node3.nxt)

    println("Mynode  ==>$node1")

    var stack = Stack<Node>()

    stack.push(node1)
    stack.push(node2)
    stack.push(node3)

    for (x in 0..2) {
        var a = stack.pop()

        print(a.data)
    }

}



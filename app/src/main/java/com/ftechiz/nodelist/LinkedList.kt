package com.ftechiz.nodelist

class LinkedList {
    var head: Node? = null

    fun addHead(node1: Node) {
        head = node1
        head = head?.nxt

        if (head != null) {
            var node = Node(0, node1)
            println("New node  ==>$node")
            size(node)
        }
    }

    fun add(tail: Node, node1: Node) {
        head = node1
        for (x in 0..4) {

            head = head?.nxt

            if (head == null) {
                var node4 = Node(4, null)
                tail.nxt = node4

            }
        }
        println("New node  ==>$node1")
        size(node1)
    }

    fun delete(tail: Node, node1: Node) {
        head = node1
        for (x in 0..4) {

            head = head?.nxt

            if (head == null) {

                tail.nxt = null
            }
        }

        println("Deleted node  ==>$node1")

        size(node1)

    }

    fun deleteHead(node1: Node) {
        head = node1

        head = head?.nxt

        if (head != null) {

            head?.nxt == null
            println("Deleted Head node  ==>$node1")
            size(node1)
        }
    }

    fun size(node1: Node) {
        head = node1
        var count = 0
        while (head?.nxt != null) {
            count++
            head = head?.nxt

        }

        count++
        println("Size  ==>$count")
    }


}
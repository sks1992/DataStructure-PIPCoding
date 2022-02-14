package linked_list_kotlin

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = LinkedList()
    var str = br.readLine()
    while (str != "quit") {
        if (str.startsWith("addLast")) {
            val value = str.split(" ".toRegex()).toTypedArray()[1].toInt()
            list.addLast(value)
        }
        str = br.readLine()
    }
    testList(list)
}


fun testList(list: LinkedList) {
    var temp = list.head
    while (temp != null) {
        println(temp.data)
        temp = temp.next
    }
    println(list.size)
    if (list.size > 0) {
        println(list.tail!!.data)
    }
}


class Node {
    var data = 0
    var next: Node? = null
}

class LinkedList {
    var head: Node? = null
    var tail: Node? = null
    var size = 0

    fun addLast(value: Int) {
        val temp = Node()
        temp.data = value
        temp.next = null
        if (size == 0) {
            tail = temp
            head = tail
        } else {
            tail!!.next = temp
            tail = temp
        }
        size++
    }
}


import java.util.*

/*
 - 연결 리스트라고 함
 - 배열은 순차적으로 연결된 공간에 데이터를 나열하는 데이터 구조
 - 링크드 리스트는 떨어진 곳에 존재하는 데이터를 연결해서 관리하는 구조

  - 노드 (Node) : 데이터 저장 단위(데이터값, 포인터)로 구성
  - 포인터 (Pointer) : 각 노드안에서, 다음이나 이전의 노드와의 연결정보를 가지고 있는 공간
 */

fun main() {

    val linkedListKT: LinkedListKT<Int> = LinkedListKT()
    linkedListKT.addFirst(10)
    linkedListKT.addLast(20)

    println(linkedListKT.node(1))
}

class LinkedListKT<E> {

    private var head: Node? = null
    private var tail: Node? = null

    private var size = 0

    inner class Node(input: E) {
        var date: E = input
        var next: Node? = null

        override fun toString(): String {
            return this.date.toString()
        }
    }

    fun addFirst(input: E) {
        val node = Node(input)
        node.next = head
        head = node
        size++

        if (head?.next == null) {
            tail = head
        }

        println("First : ${node.toString()}")
    }

    fun addLast(input: E) {
        val node = Node(input)

        if (size == 0) {
            addFirst(input)
        } else {
            tail?.next = node
            tail = node
            size++
        }

        println("Last : ${node.toString()}")
    }

    fun node(index: Int): Node? {
        var node: Node? = head

        for (i in 0 until index) {
            node = node?.next
        }

        return node
    }
}

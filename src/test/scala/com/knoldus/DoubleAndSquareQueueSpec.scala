package com.knoldus

import com.knoldus.queue.{DoubleQueue, SquareQueue}
import org.scalatest.flatspec.AnyFlatSpec

class DoubleAndSquareQueueSpec extends AnyFlatSpec {

  "DoubleQueue" should "enqueue elements after doubling them" in {
    val queue = new DoubleQueue()
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    assert(queue.elements === List(4, 6, 8))
  }

  it should "dequeue elements in FIFO order" in {
    val queue = new DoubleQueue()
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    assert(queue.dequeue === List(6, 8))
    assert(queue.dequeue === List(8))
    assert(queue.dequeue === List())
  }

  "SquareQueue" should "enqueue elements after squaring them" in {
    val queue = new SquareQueue()
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    assert(queue.elements === List(4, 9, 16))
  }

  it should "dequeue elements in FIFO order" in {
    val queue = new SquareQueue()
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    assert(queue.dequeue === List(9, 16))
    assert(queue.dequeue === List(16))
    assert(queue.dequeue === List())
  }
}

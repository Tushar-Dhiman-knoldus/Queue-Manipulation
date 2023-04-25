package com.knoldus.queue

// Class to double the element and enqueue in list
class DoubleQueue() extends Queue {
//  override var elements: List[Int]

  override def enqueue(element: Int): List[Int] = {
    elements = elements :+ (element * 2)
    elements

  }
}

// Class to square the element and enqueue in list
class SquareQueue extends Queue {
//  override var elements: List[Int] = List()

  override def enqueue(element: Int): List[Int] = {
    elements = elements :+ (element * element)
    elements
  }
}


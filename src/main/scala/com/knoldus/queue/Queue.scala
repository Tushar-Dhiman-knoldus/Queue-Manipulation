package com.knoldus.queue

trait Queue {
  var elements: List[Int] = List()

  def enqueue(element: Int): List[Int]

  def dequeue: List[Int] = {

    if (elements.isEmpty) throw new IllegalArgumentException("List is empty") else elements = elements.drop(1)
    elements
  }
}

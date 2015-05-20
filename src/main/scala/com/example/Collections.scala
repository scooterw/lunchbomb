package com.example

import language.postfixOps

object Collections {

  def createList(n: Int, count: Int) =
    //Stream from (1, n) take count toList
    Stream.from(1,n).take(count).toList

  def multiplyListBy(list: List[Int], n: Int) =
    list map { _ * n }

}

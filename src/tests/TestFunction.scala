package tests

import org.scalatest._
import functions.Algebra

class TestFunction extends FunSuite {
  test("") {
    assert(Algebra.factor(1) == List())
    assert(Algebra.factor(2) == List(2))
    assert(Algebra.factor(8) == List(2,2,2))
  }
}

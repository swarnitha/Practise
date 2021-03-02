package com.practise
import com.practice.Calculator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {
  val calc = new Calculator

  "calc" should "return the sum of numbers" in {
    // one parameter
    calc.add(0) shouldBe "0"

    // two Parameter
    calc.add(2,0) shouldBe "2"

    // Three Parameters
    calc.add(3,4,8) shouldBe "15"
  }
  "calc" should "return the difference of numbers" in {
    // one parameter
    calc.sub(0) shouldBe "0"

    // two Parameter
    calc.sub(4,0) shouldBe "4"

    // Three Parameters
    calc.sub(0,4,9) shouldBe "5"
  }
  "calc" should "return the product of numbers" in {
    // one parameter
    calc.mul(0) shouldBe "0"

    // two Parameter
    calc.mul(2,0) shouldBe "0"

    // Three Parameters
    calc.mul(3,4,2) shouldBe "24"
  }
  "calc" should "return the division of numbers" in {
    // one parameter
    calc.div(0) shouldBe "0"

    // two Parameter
    calc.div(2,10) shouldBe "0.5"

    // two Parameters with zero
    calc.div(3,0) shouldBe "denominator cannot be 0"

  }
}

package com.practice

class Calculator{

  def add(n1 : Int , n2:  Int*): Double = n1+n2
  def sub(n1 : Int , n2 : Int*): Double = n1-n2
  def mul(n1 : Int , n2 : Int*): Long = n1*n2
  def div(n1 : Int , n2 : Int*): Float = n1/n2
}
object Calculator extends App
{

    val calc = new Calculator()

    println("Addition: " + calc.add(6,2))
    println("Subtraction: " + calc.sub(8,2))
    println("Multiplication: " + calc.mul(2,2))
    println("Division: " + calc.div(8, 2))

}

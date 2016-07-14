val numbers = Array(1, 7, 3, 9)

val numbersAsc = numbers.sorted
val numbersDesc = numbersAsc.reverse

numbers.mkString("-")
numbers.mkString(" | ")
numbers.mkString(">>>[ ", " | ", " ]<<<")


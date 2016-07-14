val numbers = Array(1,2,3,4,5)
val numbersPlus2 = for(number <- numbers ) yield  number.+(2)
val pairsNumbersPlus3 = for(number <- numbers if number % 2 != 0) yield number + 3
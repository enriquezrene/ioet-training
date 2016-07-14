import scala.collection.mutable.ArrayBuffer

// Remove all the negative number but the first one

var numbers = ArrayBuffer(1,-2,8,9,-10,15,-7,5,11)

var indexesFromNegativeNumbers =
  for(i<-0 until numbers.length if numbers(i)<0 ) yield i

var indexesToRemove = indexesFromNegativeNumbers.drop(1)

numbers.remove(4)
numbers
numbers.remove(6)
numbers
//for(index<-indexesToRemove) numbers.remove(index)
//numbers



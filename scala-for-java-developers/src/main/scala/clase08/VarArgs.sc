object worksheet {
  def sum(values: Int*): Int ={
    var result = 0
    for(value <- values){
      result += value
    }
    result
  }

  sum(1,2,3)
  // pass a sequence as argument, and inform that is a _* (like a cast)
  sum(1 to 3: _*)
}
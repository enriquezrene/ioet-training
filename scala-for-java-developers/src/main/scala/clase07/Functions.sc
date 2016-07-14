def absoluteValue (x:Double) = if(x>=0) x else -x

// Return a String
def addUnderscores(message:String): String ={
  "___" concat message concat "___"
}
addUnderscores("rene")

// Return Unit (Like java void/nothing)
def printMessage(message:String): Unit ={
  println ("___" concat message concat "___")
}
printMessage("rene")


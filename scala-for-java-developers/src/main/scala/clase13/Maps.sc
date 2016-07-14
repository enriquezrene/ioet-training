val scores = Map("Rene"->9, "Mathy"->10)

val reneScore = scores("Rene")
// In order to avoid exceptions on not found value
val johnScore = scores.getOrElse("John", 0)

// Not possible, it's because is in mutable Map
//scores("Rene") = 9

val mutableScores =scala.collection.mutable.Map("Rene" -> 9)
mutableScores("Rene") = 8
mutableScores
mutableScores+=("Mathy"->10, "John"->7)
mutableScores-="Rene"



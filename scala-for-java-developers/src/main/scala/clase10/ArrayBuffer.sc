import scala.collection.mutable.ArrayBuffer

val text = ArrayBuffer("I", "love", "Java")
text += "and"
text += "the"
text += ("JVM", "too")

// double +  to append an Array
text ++= Array("Scala", "plays", "well")
text.remove(1)
text

text.insert(1, "hate")
text

// Remove las 3 elements
text.trimEnd(3)
text


val textAsArray = text.toArray
val arrayAsBuffer = textAsArray.toBuffer
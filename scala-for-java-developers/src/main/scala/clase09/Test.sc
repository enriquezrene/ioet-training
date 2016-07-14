object worksheet {
  def isVowel(character:Char) = "aeiou".contains(character)

  isVowel('a')
  isVowel('b')

  def findVowelsInWord(word:String) = {
//    var vowelsFound : String = ""
//    for (character<-word){
//      if(isVowel(character)) vowelsFound += character
//      }
//    vowelsFound
    for (character<-word if isVowel(character)) yield character
  }

  findVowelsInWord("rene")

  def isInsideVowels(character:Char, vowels:String="aeiou"):Boolean = {
    vowels.contains(character)
  }

  def findTheseVowelsInWord(word:String, vowels:String="aeiou", ignoreCase:Boolean=true): String = {
    if(ignoreCase) findTheseVowelsInWord(word.toLowerCase(), vowels, false)
    else for (character <- word if isInsideVowels(character, vowels)) yield character
  }

  findTheseVowelsInWord("June")
}
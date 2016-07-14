object worksheet {

  def addWordsToText(word:String, before:String="learn ", after:String=", please")
  = before + word + after

  addWordsToText("Java")
  addWordsToText("Java", "Do not learn ")
  addWordsToText("Java", "Write code in ", " and enjoy it")
  addWordsToText("Java", after = " and enjoy it")
}
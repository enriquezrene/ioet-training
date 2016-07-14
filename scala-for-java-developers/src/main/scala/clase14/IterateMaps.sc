val scores = Map("Rene"->9, "Mathy"->10)
for((k,v)<-scores) println(k + " has score: "+ v)

val guys = for((k,v)<-scores) yield (v,k)
guys

scores.keySet
scores.values

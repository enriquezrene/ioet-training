val n = 10
for (i <- 1 to n) println("i:"+i)
for (character<-"Hello World") println(character)

// nested for: multiple generators
for (i <- 1 to 3; j <- 1 to 3) println((10*i+j)+" ")

// if inside for: guards
for (i <- 1 to 3; j <- 1 to 3; if i!=j) println((10*i+j)+" ")

// collect results : yield
val result = for (i <- 1 to 10) yield i%3
result
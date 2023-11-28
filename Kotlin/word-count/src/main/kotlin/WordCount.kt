object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
	var sentence = " "
		val mutableMap = mutableMapOf<String, Int>()
   
   if(phrase[(phrase.length)-1].equals('\'')) 
   {sentence = phrase.dropLast(1)} else {sentence = phrase}
	sentence = sentence.replace(","," ").replace("[^a-zA-Z0-9'\\s]".toRegex(), "").replace(" '"," ").replace("' "," ").lowercase()
     val words = sentence.split("\\s+".toRegex())
     val wordsDistinct = words.distinct()
     for(word in wordsDistinct)
	 if(word!= "") mutableMap.put(word, countOfOccurances(word,words))
	 return mutableMap
             
}

fun countOfOccurances(word:String,values:List<String>): Int {
    return(values.count{it == word})
    
 }
 }

class Anagram (val source:String) {
    // TODO: implement proper constructor to complete the task
	

    fun match(anagrams: Collection<String>): Set<String> {
        val result = mutableSetOf<String>()

        for(item in anagrams) {
        	var str = "set"
			if(item.toLowerCase() != source.toLowerCase())
        	{for(letter in 'a'..'z')
        		if(source.toLowerCase().count {it.equals(letter)} != item.toLowerCase().count {it.equals(letter)})
        			 str = "unset" 
        if(str == "set") result.add(item)}
        }
        return result
    }
}

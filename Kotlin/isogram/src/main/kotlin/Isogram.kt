object Isogram {

    fun isIsogram(input: String): Boolean {
     for(letter in 'a'..'z')
     if(input.toLowerCase().count { it == letter } > 1 ) return false
	 return true
    }
}

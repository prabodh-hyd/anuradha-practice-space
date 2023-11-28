class IsbnVerifier() {

    fun isValid(number: String): Boolean {
	val chkChars = "0123456789X".split("")
	
	 val abc = number.replace("-","") 
	 
	 
	 if(!((abc.length == 10) && (abc.split("").all {it in chkChars}))) return false 
	 
	 if((abc.contains("X")) && (abc.indexOf("X") != 9)) return false 


	var digi :Int
	var sum = 0
    var i = 10
		for(j in 0..9) {
		digi = if(abc[j] == 'X') 10 else abc[j].digitToInt()
		sum += digi * i 
        i--}
		if(sum%11 == 0) return true
		return false
    }
}
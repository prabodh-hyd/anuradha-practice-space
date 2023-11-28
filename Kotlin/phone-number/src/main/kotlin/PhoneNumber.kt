class PhoneNumber (val PhoneNumber: String) {
    var num = PhoneNumber.replace("[^0-9]".toRegex(), "")
    init {

        require(
                ((num.length == 10) && (!(listOf(num[0],num[3]).contains('0') ||
                        listOf(num[0],num[3]).contains('1')))) ||
                        ((num.length == 11) && (num[0].equals('1')) &&(!(listOf(num[1],num[4]).contains('0') ||
                                listOf(num[1],num[4]).contains('1'))))
        )
    }

    val number: String? =
    when {
        num.length == 10 
     ->   num
	else -> num.drop(1)
    }
}
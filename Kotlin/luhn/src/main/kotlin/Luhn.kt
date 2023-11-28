object Luhn {

        fun isValid(candidate: String): Boolean {

        if(candidate.length < 1 || candidate.replace(" ", "").contains(Regex("[^0-9]")) ||
        candidate.replace(" ", "") == "0")
        return false

        var str = candidate.replace(" ", "")
        var x = str.length-2
        val sb = StringBuilder(str)

        for(i in x downTo 0 step 2)
        if(str[i].digitToInt()*2 > 9) sb.setCharAt(i,(str[i].digitToInt()*2 - 9).digitToChar())
        else sb.setCharAt(i,(str[i].digitToInt()*2).digitToChar())

        val abc:Int =  sb.toList().map({it.toString().toInt()}).sum()
        return(abc%10==0)
        }
        }
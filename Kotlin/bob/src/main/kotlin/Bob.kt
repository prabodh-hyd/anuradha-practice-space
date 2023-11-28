object Bob {
        fun hey(sentence: String): String = 
        when {
            sentence.all{ it.isWhitespace() } || sentence== "" -> "Fine. Be that way!"
            sentence.any {it.isLetter()} && sentence.replace("[^a-zA-Z]".toRegex(), "").all {it.isUpperCase()}
                && sentence[(sentence.length)-1].equals('?') -> "Calm down, I know what I'm doing!"
            sentence[(sentence.trim().length)-1].equals('?') -> "Sure."
            sentence.any {it.isLetter()} && sentence.replace("[^a-zA-Z]".toRegex(), "").all {it.isUpperCase()}  ->  "Whoa, chill out!"
            else -> "Whatever."
             }
        }

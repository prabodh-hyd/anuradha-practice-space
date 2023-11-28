class Dna (val sequence:String){

    init {
        require (
                sequence.all {it == 'A' || it == 'G' || it == 'C' || it == 'T'}
)}


    val nucleotideCounts: Map<Char, Int>
    get() {
        val nucleo = mutableMapOf<Char, Int>()
        val dnaLst = listOf('A','G','C','T')
        for(letter in dnaLst)
            nucleo.put(letter, sequence.count{it.equals(letter)})
        return nucleo
    }
}

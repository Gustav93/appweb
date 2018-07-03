package appweb

class GeneroMusical {

    String nombre

    static constraints = {
        nombre blank:false
        musico nullable:true
    }
    static hasOne=[musico:Musico]


}

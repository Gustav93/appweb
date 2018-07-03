package appweb

class ExperienciaBanda {

    String nombreBanda
    int cantAños


    static constraints = {
        nombreBanda size: 0..30
        cantAños size:0..2
        musico nullable:true

    }

    static belongsTo=[musico:Musico]
}

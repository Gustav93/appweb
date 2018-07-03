package appweb

class Nota {

    int puntuacion
    String comentario

    static constraints = {
        puntuacion blank:false
        comentario blank:false
    }
    static belongsTo=[aspecto:Aspecto]
}

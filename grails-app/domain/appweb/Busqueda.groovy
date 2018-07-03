package appweb

class Busqueda {

    int añosExperiencia
    int tiempoMaximo

    static constraints = {
        añosExperiencia blank:false
        tiempoMaximo blank:false
    }
    static belongsTo=[banda:Banda,instrumento:Instrumento]
}
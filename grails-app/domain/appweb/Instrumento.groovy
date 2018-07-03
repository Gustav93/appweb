package appweb

class Instrumento {

    String nombre
    static constraints = {
        nombre blank:false
        experienciaInstrumento nullable:true
        postulacion nullable:true
        busqueda nullable:true

    }

    static hasOne=[experienciaInstrumento:ExperienciaInstrumento,postulacion:Postulacion,busqueda:Busqueda]

}

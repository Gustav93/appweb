package appweb

class Banda {

    String nombre


    static constraints =
            {
                nombre size:4..15, unique:true
                busquedas nullable:true
                discografia nullable:true
                notificacion nullable: true
            }


    static hasMany=[musicos:Musico,busquedas:Busqueda]
    static hasOne=[discografia:Discografia,notificacion:Notificacion]
}

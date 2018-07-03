package appweb

class Musico
{

    String nombre
    String apellido
    String formacion

    static constraints =
            {

                nombre size:5..15
                apellido size :3..12
                formacion size :1..240
                banda nullable:true
                experienciaEnBandas nullable:true
                onda nullable:true
                generosMusicales nullable:true
                reputacion nullable:true
                notificacion nullable: true
            }

    static hasMany=[experienciaEnBandas:ExperienciaBanda,experienciaEnInstrumentos:ExperienciaInstrumento,postulaciones:Postulacion,generosMusicales:GeneroMusical]
    static belongsTo=[banda:Banda]
    static hasOne=[onda:Onda,reputacion:Reputacion,notificacion:Notificacion]

    String toString()
    {
        return nombre+" "+apellido
    }

}
package appweb

class Reputacion {

    int reputacion=0

    static constraints =
            {
                reputacion blank:true
                aspectos nullable:true
                musico nullable:true

            }

    static hasMany=[aspectos:Aspecto]
    static belongsTo=[musico:Musico]
}
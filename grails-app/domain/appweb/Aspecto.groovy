package appweb

class Aspecto {

    String nombre


    static constraints = {
        nombre blank:false
    }
    static hasMany=[notas:Nota]
}
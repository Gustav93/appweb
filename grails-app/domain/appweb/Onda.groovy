package appweb

class Onda {

    String descripcion
    static constraints =
            {
                descripcion blank:true

            }

    static belongsTo=[musico:Musico]

}

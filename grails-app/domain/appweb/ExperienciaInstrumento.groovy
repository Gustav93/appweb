package appweb

class ExperienciaInstrumento
{

    int años

    static constraints =
            {
                años size:1..20
                musico nullable:true
            }
    static belongsTo=[musico:Musico,instrumento: Instrumento]



}

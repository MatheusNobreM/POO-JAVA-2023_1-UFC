package poo.test.avalicaoru;

public class AvaliacaoRU {
    String data;
    String turno;
    String proteina;
    Integer nota;
    String comentario;

    public AvaliacaoRU(String data, String turno, String proteina, Integer nota, String comentario) {
        this.data = data;
        this.turno = turno;
        this.proteina = proteina;
        this.nota = nota;
        this.comentario = comentario;
    }
    public String getData(){
        return this.data;

    }
    public String getTurno(){
        return this.turno;

    }
    public String getProteina(){
        return this.proteina;

    }
    public Integer getNota(){
        return this.nota;

    }
    public String getComentario(){
        return this.data+ " - "+ this.turno + " - "+ this.proteina+" - "+ this.nota+ " - "+this.comentario ;
    }


}

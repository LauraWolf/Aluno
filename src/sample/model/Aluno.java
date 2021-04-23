package sample.model;

/* Classes */

public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private double media;

    public Aluno(){

    }

    public Aluno(String nome){
        super(nome);
    }

    /* Getter e Setter */

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcular() {
        this.media = (nota1 + nota2) / 2;
    }
    public void setMedia(double nota1 , double nota2 ) {
        this.media = (nota1 + nota2) / 2;
    }

    /* toString */

    @Override
    public String toString() {
        return "Aluno" +
                ", Nota1: " + nota1 +
                ", Nota2: " + nota2 +
                ", Media: " + media;
    }
}

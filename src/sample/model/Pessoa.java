package sample.model;

/* Classes */

public class Pessoa {
    private String nome;
    public Pessoa(){}

    /* Getter Setter */

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* ToString */

    @Override
    public String toString() {
        return "Pessoa" +
                "Nome: '" + nome;
    }
}

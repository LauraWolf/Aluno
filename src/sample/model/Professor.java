package sample.model;

/* Classes */

public class Professor extends Pessoa {
    private double horasT;
    private double valorH;
    private double salario;

    public Professor(String nome){
        super(nome);
    }

    /* Getter e Setter */

    public double getHorasT() {
        return horasT;
    }

    public void setHorasT(double horasT) {
        this.horasT = horasT;
    }

    public double getValorH() {
        return valorH;
    }

    public void setValorH(double valorH) {
        this.valorH = valorH;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcular(){
        this.salario = horasT * valorH;

    }

    public void setSalario(double horasT , double valorH ) {
        this.salario = horasT * valorH;

    }

    /* toString */

    @Override
    public String toString() {
        return "Professor" +
                ", Horas Trabalhadas: " + horasT +
                ", Valor Horas: " + valorH +
                ", Salario: " + salario;
    }

}

package sample;

import sample.model.Aluno;
import sample.model.Professor;

/* Class Main */

public class Main {


    public static void main(String[] args) {
        Aluno pessoa1 = new Aluno();
        pessoa1.setNome("Alex");
        pessoa1.setNota1(8);
        pessoa1.setNota2(9);
        pessoa1.calcular();
        System.out.println(pessoa1);

        Professor pessoa2 = new Professor("Alfredo");
        pessoa2.setHorasT(60);
        pessoa2.setValorH(2000);
        pessoa2.calcular();
        System.out.println(pessoa2);



    }
}

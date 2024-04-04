package Teste;

import java.util.ArrayList;
import java.util.List;

public class TesteFunc {
    public static void main(String[] args) {

        //Funcionario f = new Funcionario("Maria", "12345698745");
    	//tá dando esse eror pq instanciei a classe como abstrata.
        CientistaDados c = new CientistaDados("Natalia", "1236549874");
        GerenteTI g = new GerenteTI("Thereza", "1234568791331");
        PessoaProgramadora p = new PessoaProgramadora("Joana", "456987125463");

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        //listaFuncionarios.add(f);
        listaFuncionarios.add(c);
        listaFuncionarios.add(g);
        listaFuncionarios.add(p);

        for (Funcionario fun : listaFuncionarios) {
            if (fun instanceof GerenteTI) {
                System.out.println("Essa pessoa é gerente de TI");
            } else if (fun instanceof CientistaDados) {
                System.out.println("Essa pessoa é um Cientista de Dados");
            } else if (fun instanceof PessoaProgramadora) {
                System.out.println("Essa pessoa é programadora");
            } else if (fun instanceof Funcionario) {
                System.out.println("Essa pessoa é um funcionário");
            }

            System.out.println("Bem-vinde " + fun.getName());
        }
    }
}

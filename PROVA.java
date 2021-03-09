
package prova;

import java.util.Scanner;


public class PROVA {

    
    public static void main(String[] args) {
        
       
        Scanner s = new Scanner(System.in); 
        
        System.out.println("1 - Cadastrar funcionário\n" +
                        "2 - Buscar cadastro de funcionárion\n" +
                        "3 - Atualizar salário de um funcionário\n" +
                        "4 - Remover cadastr o\n" +
                        "5 - Exibir lista de funcionarios (ordenadas por salário)\n" +
                        "6 - Calcular desconto do plano de saúde\n" +
                        "7 - Sair do sistema");
        
        System.out.println("escolha a opção desejada (Número) ");
        int opcaoDesejada = s.nextInt(); 
        
        switch(opcaoDesejada) {
            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("Informe o nome");
                String nome = sc.nextLine();
                System.out.println("Informe o cargo");
                String cargo = sc.nextLine();
                System.out.println("Informe o salario");
                double salario = sc.nextDouble();
                Funcionario f = new Funcionario(nome, cargo, salario);
                MetodosEmpresa.cadastroFuncionario(f);
                break;
            case 2:
                MetodosEmpresa.buscaFuncionario(MetodosEmpresa.chaveSequencial);
                break;
            case 3:
                MetodosEmpresa.atualizaSalarioFuncionario();
                break;
            case 4:
                MetodosEmpresa.deletaFuncionario();
                break;
            case 5:
                MetodosEmpresa.listaFuncionario();
                break;
            case 6:
                MetodosEmpresa.calculaPlanodeSaude();
                break;
            case 7:
                MetodosEmpresa.sair();
                break;
            default:
                System.out.println("Nenhuma opção selecionada");
        } 
    }
}
    
    
        

   

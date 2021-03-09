/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetodosEmpresa {
    private static List<Funcionario> listaEmpresa = new ArrayList<Funcionario>();
    public static Integer chaveSequencial = 1;
    
    public static void cadastroFuncionario(Funcionario func){
        func.setId(chaveSequencial++);
        listaEmpresa.add(func);
    }
    
    public static Funcionario buscaFuncionario(Integer id){
        for (Funcionario f : listaEmpresa) {
            if(f.getId() == id) {
                return f;
            }
        }
        return null;
    }
    
    public static void atualizaSalarioFuncionario(Integer id, double salario){
        if(buscaFuncionario(id) == null) {
            System.out.println("Usuário não encontrado");
        } else {
            Funcionario f = buscaFuncionario(id);
            f.setSalario(salario);
        }
    }
    
    public static void deletaFuncionario(Integer id){
        Iterator<Funcionario> it = listaEmpresa.iterator();
        while(it.hasNext()) {
            Funcionario f = it.next();
            
            if(f.getId() == id) {
                it.remove();
            }
        }
    }
    
    public List<Funcionario> getListaFuncionario(){
        return listaEmpresa;
    }
    
    public static void calculaPlanodeSaude(Funcionario f){
        if(f.getSalario() <= 2000) {
            f.setSalario(f.getSalario()*0.995);
        } else if (f.getSalario() >= 2000 && f.getSalario() <= 4000) {
            f.setSalario(f.getSalario()*0.98);
        } else {
            f.setSalario(f.getSalario()*0.96);
        }
    }
    
    public static void sair(){
        System.out.println("Saindo...");
    }
}

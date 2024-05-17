/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto.Faculdade;

/**
 *
 * @author Luciano
 */
public class Paciente {
    private String nome;
    private int telefone;
    private String sintomas;
    private String cpf;
    private int idade;
    
    public Paciente(String nome, int telefone, String sintomas, String cpf, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.sintomas = sintomas;
        this.cpf = cpf;
        this.idade = idade;
    };
    
    public String getNome(){
        return nome;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public String getSintomas(){
        return sintomas;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        nome = this.nome;
    }
    
    public void setTelefone(int telefone){
        telefone = this.telefone;
    }
    
    public void setSintomas(String sintomas){
        sintomas = this.sintomas;
    }
    
    public void setCpf(String cpf){
        cpf = this.cpf;
    }
    
    public void setIdade(int idade){
        idade = this.idade;
    }
    
    
}

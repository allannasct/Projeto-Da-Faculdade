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
    private String telefone;
    private String sintomas;
    private String cpf;
    private int idade;
    
    public Paciente(String nome, String telefone, String sintomas, String cpf, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.sintomas = sintomas;
        this.cpf = cpf;
        this.idade = idade;
    };
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
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
}

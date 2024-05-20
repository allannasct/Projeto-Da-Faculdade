/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto.Faculdade;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Luciano
 */
public class Principal {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    public static void main(String[] args){
    
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        cadastrarObjetosIniciais();
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1: {
                    cadastrarPaciente(scanner);
                    break;
                }
                case 2: {
                    ListarPacientes();
                    break;
                }
//                
//                case 3: {
//                    buscarPaciente(scanner);
//                    break;
//                }
                
                case 4: {
                    System.out.println("Operação encerrada");
                    break;
                }
                
                default: {
                    System.out.println("Opção invalida");
                }
                
        }
                    
        } while(opcao != 4);
        
    };
    
   public static void exibirMenu(){
        System.out.print("Escolha uma opção: ");
        System.out.println("Sistema de Gerenciamento de Pacientes");
        System.out.println("1. Cadastrar Paciente");
        System.out.println("2. Listar Pacientes");
        System.out.println("3. Buscar Paciente por CPF");
        System.out.println("4. Sair");    
   }
   
   public static void cadastrarPaciente(Scanner scanner){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Sintomas: ");
        String sintomas = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        
        Paciente paciente = new Paciente(nome, telefone, sintomas, cpf, idade);
        pacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
   }
   
   
   private static void cadastrarObjetosIniciais() {
        pacientes.add(new Paciente("João Silva", "123456789", "Dor de cabeça", "11111111111", 30));
        pacientes.add(new Paciente("Maria Souza", "987654321", "Febre", "22222222222", 25));
        pacientes.add(new Paciente("Pedro Santos", "555555555", "Tosse", "33333333333", 40));
        pacientes.add(new Paciente("Ana Lima", "444444444", "Dor de barriga", "44444444444", 20));
        pacientes.add(new Paciente("Paulo Costa", "333333333", "Cansaço", "55555555555", 50));
        pacientes.add(new Paciente("Carla Rocha", "222222222", "Dificuldade de respirar", "66666666666", 35));
        pacientes.add(new Paciente("Bruno Almeida", "111111111", "Dores no corpo", "77777777777", 45));
    }
   
   public static void ListarPacientes(){
       for(Paciente paciente : pacientes){
         System.out.printf("%-20s %-15s %-10d%n", paciente.getNome(), paciente.getTelefone(), paciente.getIdade());
       }
   };



   
   
}

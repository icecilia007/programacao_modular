package org.example;

import org.example.collections.*;
import org.example.model.*;

import java.util.Scanner;

public class Relatorio {
    public static ProfessoresCollection professoresCollection;
    public static EstudantesCollection estudantesCollection;
    public static ProfissionaisCollection profissionaisCollection;
    public static UniversidadesCollection universidadesCollection;
    public static EmpresasCollection empresasCollection;

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        professoresCollection = ProfessoresCollection.getInstance();
        estudantesCollection = EstudantesCollection.getInstance();
        profissionaisCollection = ProfissionaisCollection.getInstance();
        universidadesCollection = UniversidadesCollection.getInstance();
        empresasCollection = EmpresasCollection.getInstance();

        dumpData();
        System.out.println("Bem Vindo Ao Simposio Brasileiro de Banco de Dados");
        menu(ent);
        ent.close();
    }
    // Adiciona dados de exemplo às coleções
    private static void dumpData() {

        // Exemplo de professores
        professoresCollection.adicionarProfessor(new Professor("João", "Silva", "joao@example.com", "1234567890", "Informática", 1001));
        professoresCollection.adicionarProfessor(new Professor("Maria", "Santos", "maria@example.com", "9876543210", "Engenharia", 1002));

        // Exemplo de estudantes
        estudantesCollection.adicionarEstudante(new Estudante("Pedro", "Ferreira", "pedro@example.com", "5555555555", 2001, "Ciência da Computação"));
        estudantesCollection.adicionarEstudante(new Estudante("Ana", "Ribeiro", "ana@example.com", "6666666666", 2002, "Engenharia Civil"));

        // Exemplo de empresas
        empresasCollection.adicionarEmpresa(new Empresa(1234567890L, "Av. Principal, 123", "TechCorp", "Carlos Silva", "Tecnologia"));
        empresasCollection.adicionarEmpresa(new Empresa(9876543210L, "Rua Comercial, 456", "BuildIt", "Laura Pereira", "Construção"));

        // Exemplo de universidades
        universidadesCollection.adicionarUniversidade(new Universidade(1111111111L, "Av. Universitária, 789", "UniTech", "Roberto Souza", "UT", "Campus Central"));
        universidadesCollection.adicionarUniversidade(new Universidade(2222222222L, "Rua da Educação, 567", "UniEng", "Marta Oliveira", "UE", "Campus Sul"));
    }
    private static void menu(Scanner ent) {
        int options=0;
        do{
            System.out.println("0- Sair");
            System.out.println("1- Menu Professor");
            System.out.println("2- Menu Estudante");
            System.out.println("3- Menu Universidade");
            System.out.println("4- Menu Empresa");
//            System.out.println("5- Menu Trabalho");
            System.out.println("6- ");
            System.out.println("0- Sair");
            options = ent.nextInt();
                switch (options) {
                    case 1 -> menu("professor",ent);
                    case 2 -> menu("estudante",ent);
                    case 3 -> menu("universidade",ent);
                    case 4 -> menu("empresa",ent);
                    case 5 -> menu("trabalho",ent);
                    default -> {
                        System.out.println("Saindo");
                        return;
                    }
                }
        }while(options!=0);
    }
    private static void menu(String text, Scanner ent) {
        int options = 0;
        System.out.println(" Menu "+text);
        System.out.println("1 - Adicionar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Buscar");
        System.out.println("4 - Listar");
        System.out.println("5 - Excluir");
        System.out.println("0- Sair");
        options = ent.nextInt();
        ent.nextLine();
        switch (options) {
            case 1, 2 -> preencherDados(text, ent);
            case 3 -> {
                System.out.println("Escreva o nome do que deseja buscar: ");
                String search = ent.nextLine();
                buscarObjeto(text, search);
            }
            case 4 -> listarObjeto(text);
            case 5 -> {
                System.out.println("Escreva o nome do que deseja excluir: ");
                String search_delete = ent.nextLine();
                System.out.println(excluirObjeto(text, search_delete) ? "Excluido" : "Falha ao excluir, pode ser o nome!");
            }
            default -> {
                System.out.println("Saindo");
                return;
            }
        }
    }

    private static boolean excluirObjeto(String text, String searchDelete) {
        switch (text) {
            case "professor" -> {
                Professor professor = professoresCollection.buscarProfessor(searchDelete);
                if(professor!=null){
                    professoresCollection.excluirProfessor(professor);
                    return true;
                }
            }
            case "estudante" -> {
                Estudante estudante = estudantesCollection.buscarEstudante(searchDelete);
                if (estudante != null) {
                    estudantesCollection.excluirEstudante(estudante);
                    return true;
                }
            }
            case "empresa" -> {
                Empresa empresa = empresasCollection.buscarEmpresa(searchDelete);
                if (empresa != null) {
                    empresasCollection.excluirEmpresa(empresa);
                    return true;
                }
            }
            case "universidade" ->{
                Universidade universidade = universidadesCollection.buscarUniversidade(searchDelete);
                if (universidade != null) {
                    universidadesCollection.excluirUniversidade(universidade);
                    return true;
                }
            }
        }
        //caso não ache
        return false;
    }

    private static void listarObjeto(String text) {
        switch (text) {
            case "professor" -> System.out.println(professoresCollection.listarProfessores().toString());
            case "estudante" -> System.out.println(estudantesCollection.listarEstudantes().toString());
            case "empresa" -> System.out.println(empresasCollection.listarEmpresas().toString());
            case "universidade" -> System.out.println(universidadesCollection.listarUniversidades().toString());
        }
    }

    private static void buscarObjeto(String text, String search) {
        switch (text) {
            case "professor" -> System.out.println(professoresCollection.buscarProfessor(search).toString());
            case "estudante" -> System.out.println(estudantesCollection.buscarEstudante(search).toString());
            case "empresa" -> System.out.println(empresasCollection.buscarEmpresa(search).toString());
            case "universidade" -> System.out.println(universidadesCollection.buscarUniversidade(search).toString());
        }
    }

    private static void preencherDados(String text,Scanner ent) {
        ent.nextLine();
        switch (text) {
            case "professor", "estudante" -> {
                System.out.println("Nome: ");
                String nome = ent.nextLine();
                System.out.println("Sobrenome: ");
                String sobrenome = ent.nextLine();
                System.out.println("Email: ");
                String email = ent.nextLine();
                System.out.println("Telefone: ");
                String telefone = ent.nextLine();
                if (text.contains("professor")) {
                    System.out.println("Matricula: ");
                    int matricula = ent.nextInt();
                    ent.nextLine();
                    System.out.println("Departamento: ");
                    String departamento = ent.nextLine();
                    professoresCollection.adicionarProfessor(new Professor(nome, sobrenome, email, telefone, departamento, matricula));
                } else if (text.contains("estudante")){
                    System.out.println("Matricula: ");
                    int matricula = ent.nextInt();
                    ent.nextLine();
                    System.out.println("Curso: ");
                    String curso = ent.nextLine();
                    estudantesCollection.adicionarEstudante(new Estudante(nome, sobrenome, email, telefone, matricula, curso));
                }else{
                    System.out.println("Area especifica: ");
                    String area = ent.nextLine();
                    profissionaisCollection.adicionarProfissional(new Profissional(nome, sobrenome, email, telefone, area));
                }
            }
            case "universidade","empresa" ->{
                System.out.println("Cnpj: ");
                long cnpj = ent.nextLong();
                ent.next();
                System.out.println("Endereco: ");
                String endereco = ent.nextLine();
                System.out.println("Nome: ");
                String nome = ent.nextLine();
                System.out.println("Nome Responsável: ");
                String nome_responsavel = ent.nextLine();
                if(text.contains("empresa")){
                    System.out.println("Ramo da Atividade: ");
                    String ramo = ent.nextLine();
                    empresasCollection.adicionarEmpresa(new Empresa(cnpj,endereco,nome,nome_responsavel,ramo));
                }
                else {
                    System.out.println("Sigla: ");
                    String sigla = ent.nextLine();
                    System.out.println("Campus: ");
                    String campus = ent.nextLine();
                    universidadesCollection.adicionarUniversidade(new Universidade(cnpj,endereco,nome,nome_responsavel,sigla,campus));
                }
            }
        }
    }

}
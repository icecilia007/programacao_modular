package org.example.collections;

import org.example.model.Apresentacao;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApresentacaoCollection {
    private static ApresentacaoCollection instancia;
    private List<Apresentacao> listaApresentacoes;

    private ApresentacaoCollection() {
        listaApresentacoes = new ArrayList<>();
    }

    public static ApresentacaoCollection getInstance() {
        if (instancia == null) {
            instancia = new ApresentacaoCollection();
        }
        return instancia;
    }

    public void adicionarApresentacao(Time horaApresentacao) {
        listaApresentacoes.add(new Apresentacao(horaApresentacao));
    }

    public void removerApresentacao(Apresentacao apresentacao) {
        listaApresentacoes.remove(apresentacao);
    }

    public void atualizarApresentacao(Apresentacao apresentacaoAntiga, Apresentacao apresentacaoNova) {
        int index = listaApresentacoes.indexOf(apresentacaoAntiga);
        if (index != -1) {
            listaApresentacoes.set(index, apresentacaoNova);
        }
    }

    public List<Apresentacao> listarTodasApresentacoes() {
        return listaApresentacoes;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu ###");
            System.out.println("1. Adicionar Apresentacao");
            System.out.println("2. Listar Todas as Apresentacoes");
            System.out.println("3. Remover Apresentacao");
            System.out.println("4. Atualizar Apresentacao");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar Apresentacao
                    System.out.print("Digite a hora da apresentacao (hh:mm:ss): ");
                    String hora = scanner.next();
                    try {
                        Time horaApresentacao = Time.valueOf(hora);
                        ApresentacaoCollection.getInstance().adicionarApresentacao(horaApresentacao);
                        System.out.println("Apresentacao adicionada com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Formato de hora inválido. Use hh:mm:ss.");
                    }
                    break;

                case 2:
                    // Listar Todas as Apresentacoes
                    List<Apresentacao> apresentacoes = ApresentacaoCollection.getInstance().listarTodasApresentacoes();
                    System.out.println("### Lista de Apresentacoes ###");
                    for (Apresentacao apresentacao : apresentacoes) {
                        System.out.println(apresentacao);
                    }
                    break;

                case 3:
                    // Remover Apresentacao
                    System.out.print("Digite o índice da apresentação a ser removida: ");
                    int indiceRemover = scanner.nextInt();
                    List<Apresentacao> apresentacoesLista = ApresentacaoCollection.getInstance().listarTodasApresentacoes();
                    if (indiceRemover >= 0 && indiceRemover < apresentacoesLista.size()) {
                        ApresentacaoCollection.getInstance().removerApresentacao(apresentacoesLista.get(indiceRemover));
                        System.out.println("Apresentacao removida com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    // Atualizar Apresentacao
                    System.out.print("Digite o índice da apresentação a ser atualizada: ");
                    int indiceAtualizar = scanner.nextInt();
                    List<Apresentacao> apresentacoesListaAtualizar = ApresentacaoCollection.getInstance().listarTodasApresentacoes();
                    if (indiceAtualizar >= 0 && indiceAtualizar < apresentacoesListaAtualizar.size()) {
                        System.out.print("Digite a nova hora da apresentacao (hh:mm:ss): ");
                        String novaHora = scanner.next();
                        try {
                            Time novaHoraApresentacao = Time.valueOf(novaHora);
                            Apresentacao apresentacaoAntiga = apresentacoesListaAtualizar.get(indiceAtualizar);
                            Apresentacao apresentacaoNova = new Apresentacao(novaHoraApresentacao);
                            ApresentacaoCollection.getInstance().atualizarApresentacao(apresentacaoAntiga, apresentacaoNova);
                            System.out.println("Apresentacao atualizada com sucesso!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("Formato de hora inválido. Use hh:mm:ss.");
                        }
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do menu...");
                    return;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}


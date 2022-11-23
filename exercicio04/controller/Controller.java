package controller;

import java.util.Scanner;

public class Controller {

    private static int escolha;
    private VagaController vagaController = new VagaController();
    private CandidatoController cadastraCandidato = new CandidatoController();
    private EntrevistController entrevistController = new EntrevistController();

    public void applicationEscolha() {
        do {
            switch (escolha()) {
                case 1:
                    cadastraCandidato.cadastraCandidato();
                    break;
                case 2:
                    vagaController.cadastraVaga();
                    break;
                case 3:
                    entrevistController.cadastraEntrevista();
                    break;
                case 4:
                    vagaController.listarVagas();
                    break;
                case 5:
                    cadastraCandidato.listarCandidatos();
                    break;
                case 6:
                    entrevistController.listarEntrevistas();
                    break;
                case 7:
                    cadastraCandidato.deletarCandidato();
                    break;
                case 8:
                    vagaController.deletarVaga();
                    break;
                case 9:
                    entrevistController.deletarEntrevista();
                    break;
            }
        } while (escolha != 10);
    }

    private static int escolha() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("-SISTEMA DE GERENCIAMENTO DE ENTREVISTAS-");
        System.out.println("========== Escolha uma opção ===========");
        System.out.println("1 - Cadastra um novo candidato");
        System.out.println("2 - Cadastra uma nova vaga");
        System.out.println("3 - Para registrar entrevista");
        System.out.println("4 - Para lista as vagas cadastradas");
        System.out.println("5 - Para lista os candidatos cadastrados");
        System.out.println("6 - Para lista as entrevistas realizadas");
        System.out.println("7 - Para deletar candidatos");
        System.out.println("8 - Para deletar vagas");
        System.out.println("9 - Para deletar entrevistas");
        System.out.println("10 - Para Sair do sistema");
        escolha = leitor.nextInt();
        leitor.nextLine();
        return escolha;
    }
}
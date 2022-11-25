package controller;

import java.util.Objects;
import java.util.Scanner;

public class Controller {

    private static String escolha;
    private VagaController vagaController = new VagaController();
    private CandidatoController candidatoController = new CandidatoController();
    private EntrevistController entrevistController = new EntrevistController();

    public static Object getEscolha() {
        return escolha;
    }

    public static void setEscolha(String escolha) {
        Controller.escolha = escolha;
    }

    public void applicationEscolha() {
        while (!Objects.equals(escolha, "13")){
            switch (escolha()) {
                case "1":
                    candidatoController.cadastraCandidato();
                    break;
                case "2":
                    vagaController.cadastraVaga();
                    break;
                case "3":
                    entrevistController.cadastraEntrevista();
                    break;
                case "4":
                    vagaController.listarVagas();
                    break;
                case "5":
                    candidatoController.listarCandidatos();
                    break;
                case "6":
                    entrevistController.listarEntrevistas();
                    break;
                case "7":
                    candidatoController.deletarCandidato();
                    break;
                case "8":
                    vagaController.deletarVaga();
                    break;
                case "9":
                    entrevistController.deletarEntrevista();
                    break;
                case "10":
                    vagaController.atualizarVaga();
                    break;
                case "11":
                    candidatoController.atualizarCandidato();
                    break;
                case "12":
                    entrevistController.atualizarEntrevista();
                    break;
            }
        }
    }

    private static String escolha() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("-SISTEMA DE GERENCIAMENTO DE ENTREVISTAS-");
        System.out.println("========== Escolha uma opção ===========");
        System.out.println("1 - Cadastra um novo candidato.");
        System.out.println("2 - Cadastra uma nova vaga.");
        System.out.println("3 - Registrar entrevista.");
        System.out.println("4 - Listar as vagas cadastradas.");
        System.out.println("5 - Listar os candidatos cadastrados.");
        System.out.println("6 - Listar as entrevistas realizadas.");
        System.out.println("7 - Deletar candidatos.");
        System.out.println("8 - Deletar vagas.");
        System.out.println("9 - Deletar entrevistas.");
        System.out.println("10 - Atualizar vaga.");
        System.out.println("11 - Atualizar candiadto.");
        System.out.println("12 - Atualizar entrevista.");
        System.out.println("13 - Sair do sistema.");
        escolha = leitor.next();
        leitor.nextLine();
        return escolha;
    }
}
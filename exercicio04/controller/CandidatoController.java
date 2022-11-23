package controller;

import model.Candidato;
import model.StatusEnum;
import model.Vaga;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CandidatoController {

    private Controller controller;
    private static Vaga vaga;
    private Candidato candidato = new Candidato();
    private VagaController vagaController;
    private static final ArrayList<Candidato> candidatosList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void cadastraCandidato() {

        Scanner leitor = new Scanner(System.in);

        candidato = new Candidato();

        /**
         * Bloco responsável pela geração do id
         */
        int idTmp;
        if (candidato.getGenerator() == 0) {
            candidato.setGenerator(1);
        } else {
            idTmp = candidato.getGenerator();
            candidato.setGenerator(idTmp + 1);
        }

        candidato.setId(candidato.getGenerator());

        System.out.println("Digite o nome do Candidato: ");
        candidato.setNome(leitor.nextLine());
        System.out.println("Digite o cidade do " + candidato.getNome() + ":");
        candidato.setCidade(leitor.nextLine());
        System.out.println("Digite a idade do " + candidato.getNome() + ":");
        candidato.setIdade(leitor.nextInt());
        System.out.println("Quais são as habilidades tecnicas do " + candidato.getNome() + "?");
        candidato.setHalibidadesTecnicas(leitor.nextLine());
        candidato.setHalibidadesTecnicas(leitor.nextLine());
        System.out.println("Quais são as habilidades Interpessoais do " + candidato.getNome() + "?");
        candidato.setHalibiladesInterpessoais(leitor.nextLine());
        System.out.println("Qual é o salario proposto para o " + candidato.getNome() + "?");
        candidato.setSalarioOferecido(leitor.nextDouble());

        System.out.println("Digite o código da vaga: ");
        candidato.setCodigoVaga(leitor.nextInt());

        candidato.setStatus(StatusEnum.A_ENTREVISTAR);

        candidatosList.add(candidato);
        candidato.setCandidatosList(candidatosList);
        System.out.println("Cadastro realizado com sucesso!");
    }

    public void listarCandidatos() throws NullPointerException {

        try {
            for (Candidato candidato : candidato.getCandidatosList()) {
                System.out.println("============= LISTA DE CANDIDATOS ============");
                System.out.println(candidato.toString());
            }
        } catch (NullPointerException error) {
            System.err.println("Não há candidatos cadastrados, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }
    }

    public void deletarCandidato() {
        try {
            System.out.println("Digite o ID do candidato:");
            int escolha = sc.nextInt();
            candidatosList.remove((escolha - 1));
            System.out.println("Candidato deletada com sucesso!\n");
        } catch (InputMismatchException error) {
            System.err.println("ID inválido. Repita a operação!\n");
            sc.nextLine();
        } catch (IndexOutOfBoundsException error) {
            System.err.println("Não há candidato cadastrado para o ID informado. Repita a operação!\n");
            sc.nextLine();
        }
    }
}

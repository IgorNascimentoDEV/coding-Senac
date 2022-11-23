package controller;

import model.Entrevista;
import model.SenioridadeEnum;
import model.StatusEnum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntrevistController {

    private Entrevista entrevista;

    private static final ArrayList<Entrevista> entrevistasList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void cadastraEntrevista() {

        Scanner leitor = new Scanner(System.in);

        entrevista = new Entrevista();

        /**
         * Bloco responsável pela geração do id
         */
        if (entrevista.getGenerator() == 0) {
            entrevista.setGenerator(1);
        } else {
            int idTmp;
            idTmp = entrevista.getGenerator();
            entrevista.setGenerator(idTmp + 1);
        }

        entrevista.setId(entrevista.getGenerator());
        System.out.println("Digite a data da entrevista: Ex: 2022-12-12");
        entrevista.setDataEntrevista(leitor.nextLine());

        System.out.println("Digite o código da vaga:");
        entrevista.setCodigoVaga(leitor.nextInt());

        System.out.println("Digite o nome do candidato:");
        entrevista.setNomecandidato(leitor.nextLine());
        entrevista.setNomecandidato(leitor.nextLine());

        System.out.println("Qual é o status do candidato?" + " \n 1 - Aprovado \n 2 - Inapto \n 3 - Contratado \n Digite o número: ");

        int escolha = leitor.nextInt();

        if (escolha == 1) {
            entrevista.setStatusEnum(StatusEnum.APROVADO);
        } else if (escolha == 2) {
            entrevista.setStatusEnum(StatusEnum.INAPTO);
        } else if (escolha == 3) {
            entrevista.setStatusEnum(StatusEnum.CONTRATADO);
        } else {
            System.out.println("Escolha inválida");
            escolha = leitor.nextInt();
        }

        System.out.println("Qual é a senioridade do candidato?" + " \n 1 - Júnior \n 2 - Pleno \n 3 - Sênior \n Digite o número: ");

        escolha = leitor.nextInt();

        if (escolha == 1) {
            entrevista.setNivelProposto(SenioridadeEnum.JUNIOR);
        } else if (escolha == 2) {
            entrevista.setNivelProposto(SenioridadeEnum.PLENO);
        } else if (escolha == 3) {
            entrevista.setNivelProposto(SenioridadeEnum.SENIOR);
        } else {
            System.out.println("Escolha inválida");
            escolha = leitor.nextInt();
        }

        System.out.println("Digite o salário proposto:");
        entrevista.setSalarioProposto(leitor.nextBigDecimal());

        entrevistasList.add(entrevista);
        entrevista.setEntrevistasList(entrevistasList);

        System.out.println("Cadastro realizado com sucesso!");
    }

    public void listarEntrevistas() {
        try {
            System.out.println("============= LISTA DE ENTREVISTAS ============");
            for (Entrevista entrevista : entrevista.getEntrevistasList()) {
                System.out.println(entrevista.toString());
            }
        } catch (NullPointerException error) {
            System.err.println("Não há entrevistas registradas, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }
    }

    public void deletarEntrevista() {
        try {
            System.out.println("Digite o ID da entrevista:");
            int escolha = sc.nextInt();
            entrevistasList.remove((escolha - 1));
            System.out.println("Entrevista deletada com sucesso!\n");
        } catch (InputMismatchException error) {
            System.err.println("ID inválido. Repita a operação!\n");
            sc.nextLine();
        } catch (IndexOutOfBoundsException error) {
            System.err.println("Não há entrevistas para o ID informado. Repita a operação!\n");
            sc.nextLine();
        }
    }
}
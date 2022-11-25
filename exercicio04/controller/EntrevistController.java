package controller;

import model.Entrevista;
import model.SenioridadeEnum;
import model.StatusEnum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntrevistController {

    private static int sequence;
    private Entrevista entrevista;
    private static final ArrayList<Entrevista> entrevistasList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        EntrevistController.sequence = sequence;
    }

    public void cadastraEntrevista() {

        Scanner leitor = new Scanner(System.in);

        entrevista = new Entrevista();

        /**
         * Bloco responsável pela geração do id
         */
        if (getSequence() == 0) {
            setSequence(1);
        } else {
            int idTmp;
            idTmp = getSequence();
            setSequence(idTmp + 1);
        }

        try {
            entrevista.setId(getSequence());
            System.out.println("== CADASTRO DE ENTREVISTA ==");
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
            }

            System.out.println("Digite o salário proposto:");
            entrevista.setSalarioProposto(leitor.nextBigDecimal());

            entrevistasList.add(entrevista);
            entrevista.setEntrevistasList(entrevistasList);

            System.out.println("Cadastro realizado com sucesso! Clique em qualquer tecla para continuar: \n");
            sc.nextLine();

        }catch(NullPointerException error){
            System.err.println("Valor nulo para o campo, repita a operação ou tente novamente");
            System.err.println("Tecle ENTER ou qualquer outra tecla para continuar:");
            sc.nextLine();
        }catch (InputMismatchException error){
            System.err.println("Valor inválido, repita a operação ou tente novamente.");
            System.err.println("Tecle ENTER ou qualquer outra tecla para continuar:");
            sc.nextLine();
        }catch (IndexOutOfBoundsException error){
            System.err.println("Lista vazia ou registro não cadastrado para o ID informado, repita a operação ou tente novamente.");
            System.err.println("Tecle ENTER ou qualquer outra tecla para continuar:");
            sc.nextLine();
        }
    }

    public void listarEntrevistas() {

        try {

            System.out.println("============= LISTA DE ENTREVISTAS ============");
            for (Entrevista entrevista : entrevista.getEntrevistasList()) {
                System.out.println(entrevista.toString());
            }

            if (entrevista.getEntrevistasList().isEmpty()){
                System.err.println("Lista de entrevistas vazia!");
            }

            System.out.println("Clique em qualquer tecla para continuar: ");
            sc.nextLine();
        } catch (NullPointerException error) {
            System.err.println("Não há entrevistas registradas, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }
    }

    public void deletarEntrevista() {
        try {
            System.out.println("=== DELETAR VAGA ===");
            System.out.println("Digite o ID da entrevista:");
            int escolha = sc.nextInt();
            entrevistasList.remove((escolha - 1));
            System.out.println("Entrevista deletada com sucesso!\n");
            System.out.println("Clique em qualquer tecla para continuar: ");
            sc.nextLine();
            sc.nextLine();
        } catch (InputMismatchException error) {
            System.err.println("ID inválido. Repita a operação!\n");
            sc.nextLine();
        } catch (IndexOutOfBoundsException error) {
            System.err.println("Não há entrevistas para o ID informado. Repita a operação!\n");
            sc.nextLine();
        }
    }

    public void atualizarEntrevista(){

        int escolha;
        int idTmp;
        try{
            System.out.println("===== ATUALIZAR ENTREVISTA =====");
            System.out.println("Só é possível atualizar o status:");
            System.out.println("Digite o ID da entrevista:");
            escolha = sc.nextInt();
            idTmp = escolha - 1;
            entrevista.getEntrevistasList().get(idTmp);
            String input;

            System.out.println("Qual é o status do candidato?" + " \n 1 - Aprovado \n 2 - Inapto \n 3 - Contratado \n Digite o número: ");

            escolha = sc.nextInt();

            if (escolha == 1) {
                entrevista.getEntrevistasList().get(idTmp).setStatusEnum(StatusEnum.APROVADO);
            } else if (escolha == 2) {
                entrevista.getEntrevistasList().get(idTmp).setStatusEnum(StatusEnum.INAPTO);
            } else if (escolha == 3) {
                entrevista.getEntrevistasList().get(idTmp).setStatusEnum(StatusEnum.CONTRATADO);
            } else {
                System.out.println("Escolha inválida");
            }

            System.out.println("Entrevista atualizada com sucesso. Clique em qualquer tecla para continuar: ");
            sc.nextLine();

        }catch(NullPointerException error){
            System.err.println("Lista de entrevitas vazia ou nula.");
            sc.nextLine();
        }catch (InputMismatchException error){
            System.err.println("ID inválido, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }catch (IndexOutOfBoundsException error){
            System.err.println("Não há entrevistas cadastradas para o ID.");
            sc.nextLine();
        }
    }
}
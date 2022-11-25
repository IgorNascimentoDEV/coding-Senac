package controller;

import model.Candidato;
import model.StatusEnum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CandidatoController {

    private static int sequence;
    private Candidato candidato;
    private static final ArrayList<Candidato> candidatosList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        CandidatoController.sequence = sequence;
    }

    public void cadastraCandidato() {

        Scanner leitor = new Scanner(System.in);

        candidato = new Candidato();

        /**
         * Bloco responsável pela geração do id
         */
        int idTmp;
        if (getSequence() == 0) {
            setSequence(1);
        } else {
            idTmp = getSequence();
            setSequence(idTmp + 1);
        }

        try{
        candidato.setId(getSequence());
        System.out.println("== CADASTRO DE CANDIDATO ==");
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

    public void listarCandidatos() throws NullPointerException {

        try {

            for (Candidato candidato : candidato.getCandidatosList()) {
                System.out.println("============= LISTA DE CANDIDATOS ============");
                System.out.println(candidato.toString());
            }

            if (candidato.getCandidatosList().isEmpty()){
                System.err.println("Lista de candidatos vazia!");
            }

            System.out.println("Clique em qualquer tecla para continuar: ");
            sc.nextLine();
        } catch (NullPointerException error) {
            System.err.println("Não há candidatos cadastrados, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }
    }

    public void deletarCandidato() {
        try {
            System.out.println("=== DELETAR CANDIDATO ===");
            System.out.println("Digite o ID do candidato:");
            int escolha = sc.nextInt();
            candidatosList.remove((escolha - 1));
            System.out.println("Candidato deletada com sucesso!\n");
            System.out.println("Clique em qualquer tecla para continuar: ");
            sc.nextLine();
            sc.nextLine();
        } catch (InputMismatchException error) {
            System.err.println("ID inválido. Repita a operação!\n");
            sc.nextLine();
        } catch (IndexOutOfBoundsException error) {
            System.err.println("Não há candidato cadastrado para o ID informado. Repita a operação!\n");
            sc.nextLine();
        }
    }

    public void atualizarCandidato(){

        int escolha;
        double escolhaD;
        int idTmp;
        try{
            System.out.println("===== ATUALIZAR CANDIDATO =====");
            System.out.println("Digite o ID do candidato:");
            escolha = sc.nextInt();
            idTmp = escolha - 1;
            candidato.getCandidatosList().get(idTmp);
            String input;

            System.out.println("Digite o nome do Candidato: ");
            input = sc.nextLine();
            input = sc.nextLine();
            candidato.getCandidatosList().get(idTmp).setNome(input);

            System.out.println("Digite o cidade do " + candidato.getNome() + ":");
            input = sc.nextLine();
            candidato.getCandidatosList().get(idTmp).setCidade(input);

            System.out.println("Digite a idade do " + candidato.getNome() + ":");
            escolha = sc.nextInt();
            candidato.getCandidatosList().get(idTmp).setIdade(escolha);

            System.out.println("Quais são as habilidades tecnicas do " + candidato.getNome() + "?");
            input = sc.nextLine();
            input = sc.nextLine();
            candidato.getCandidatosList().get(idTmp).setHalibidadesTecnicas(input);

            System.out.println("Quais são as habilidades Interpessoais do " + candidato.getNome() + "?");
            input = sc.nextLine();
            candidato.getCandidatosList().get(idTmp).setHalibiladesInterpessoais(input);

            System.out.println("Qual é o salario proposto para o " + candidato.getNome() + "?");
            escolhaD = sc.nextDouble();
            candidato.getCandidatosList().get(idTmp).setSalarioOferecido(escolhaD);

            System.out.println("Digite o código da vaga: ");
            escolha = sc.nextInt();
            candidato.getCandidatosList().get(idTmp).setCodigoVaga(escolha);

            System.out.println("Candidato atualizada com sucesso. Clique em qualquer tecla para continuar: ");
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
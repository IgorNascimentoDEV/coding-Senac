package controller;

import model.Vaga;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VagaController {

    private static int sequence;
    private Vaga vaga;
    private static final ArrayList<Vaga> vagasList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        VagaController.sequence = sequence;
    }

    public void cadastraVaga() {

        vaga = new Vaga();

        Scanner leitor = new Scanner(System.in);

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

        try{
        vaga.setIdVaga(getSequence());
        vaga.setCodigoVaga(getSequence() + 1000);
        System.out.println("== CADASTRO DE VAGA ==");
        System.out.println("Digite o nome da Vaga:");
        vaga.setNomeVaga(leitor.nextLine());
        System.out.println("Digite a localidade:");
        vaga.setLocal(leitor.nextLine());
        System.out.println("Digite o tempo de alocação da vaga:");
        vaga.setData(leitor.nextLine());
        System.out.println("Digite a Modalidade da vaga:");
        vaga.setModalidade(leitor.nextLine());

        vagasList.add(vaga);
        vaga.setVagasList(vagasList);

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

    public void listarVagas() {
        try {

            System.out.println("============= LISTA DE VAGAS ============");
            for (Vaga vaga : vaga.getVagasList()) {
                System.out.println(vaga.toString());
            }

            if (vaga.getVagasList().isEmpty()){
                System.err.println("Lista de vagas vazia!");
            }

            System.out.println("Clique em qualquer tecla para continuar: ");
            sc.nextLine();
        } catch (NullPointerException error) {
            System.err.println("Não há vagas cadastradas, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }
    }

    public void deletarVaga() {
        try {
            System.out.println("=== DELETAR VAGA ===");
            System.out.println("Digite o ID da vaga:");
            int escolha = sc.nextInt();
            vagasList.remove((escolha - 1));
            System.out.println("Vaga deletada com sucesso!\n");
            System.out.println("Clique em qualquer tecla para continuar: ");
            sc.nextLine();
            sc.nextLine();
        } catch (InputMismatchException error) {
            System.err.println("ID inválido. Repita a operação!\n");
            sc.nextLine();
        } catch (IndexOutOfBoundsException error) {
            System.err.println("Não há vaga cadastrada para o ID informado. Repita a operação!\n");
            sc.nextLine();
        }
    }

    public void atualizarVaga(){

        int escolha;
        int idTmp;
        try{
            System.out.println("===== ATUALIZAR VAGAS =====");
            System.out.println("Digite o ID da vaga:");
            escolha = sc.nextInt();
            idTmp = escolha - 1;
            vaga.getVagasList().get(idTmp);
            String input;

            System.out.println("Digite o nome da Vaga:");
            input = sc.nextLine();
            input = sc.nextLine();
            vaga.getVagasList().get(idTmp).setNomeVaga(input);

            System.out.println("Digite a localidade:");
            input = sc.nextLine();
            vaga.getVagasList().get(idTmp).setLocal(input);

            System.out.println("Digite o tempo de alocação da vaga:");
            input = sc.nextLine();
            vaga.getVagasList().get(idTmp).setData(input);

            System.out.println("Digite a Modalidade da vaga:");
            input = sc.nextLine();
            vaga.getVagasList().get(idTmp).setModalidade(input);
            System.out.println("Vaga Atualizada com sucesso. Clique em qualquer tecla para continuar: ");
            sc.nextLine();
        }catch(NullPointerException error){
            System.err.println("Null");
            sc.nextLine();
        }catch (InputMismatchException error){
            System.err.println("ID inválido, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }catch (IndexOutOfBoundsException error){
            System.err.println("Não há vagas cadastradas para o ID.");
            sc.nextLine();
        }
    }
}
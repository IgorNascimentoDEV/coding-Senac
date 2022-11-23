package controller;

import model.Candidato;
import model.StatusEnum;
import model.Vaga;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VagaController {

    private Vaga vaga;
    private static final ArrayList<Vaga> vagasList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public void cadastraVaga() {

        vaga = new Vaga();

        Scanner leitor = new Scanner(System.in);

        /**
         * Bloco responsável pela geração do id
         */
        int idTmp;

        if (vaga.getGenerator() == 0) {
            vaga.setGenerator(1);
        } else {
            idTmp = vaga.getGenerator();
            vaga.setGenerator(idTmp + 1);
        }

        vaga.setIdVaga(vaga.getGenerator());
        vaga.setCodigoVaga(vaga.getGenerator() + 1000);

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

        System.out.println("Cadastro realizado com sucesso!\n");
    }

    public void listarVagas() {
        try {
            System.out.println("============= LISTA DE VAGAS ============");
            for (Vaga vaga : vaga.getVagasList()) {
                System.out.println(vaga.toString());
            }
        } catch (NullPointerException error) {
            System.err.println("Não há vagas cadastradas, clique em qualquer tecla para continuar.");
            sc.nextLine();
        }
    }

    public void deletarVaga() {
        try {
            System.out.println("Digite o ID da vaga:");
            int escolha = sc.nextInt();
            vagasList.remove((escolha - 1));
            System.out.println("Vaga deletada com sucesso!\n");
        } catch (InputMismatchException error) {
            System.err.println("ID inválido. Repita a operação!\n");
            sc.nextLine();
        } catch (IndexOutOfBoundsException error) {
            System.err.println("Não há vaga cadastrada para o ID informado. Repita a operação!\n");
            sc.nextLine();
        }
    }
}
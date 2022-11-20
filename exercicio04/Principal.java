import java.util.ArrayList;
import java.util.Scanner;
 import java.util.InputMismatchException;

import javax.xml.transform.Source;

class Principal{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

          //Cadastrando Candidatos na Lista:
          ArrayList<Candidato> listaDeCandidatos = new ArrayList<>();

          //Cadastra Vagas na Lista:
          ArrayList<Vaga> listaDeVaga = new ArrayList<>();
        
        do{
            switch(escolha()){
                case 1:
                    Candidato Candidato = new Candidato();
                    System.out.println("Digite o nome do Candidato: ");
                    Candidato.setNome(leitor.nextLine()); 
                    System.out.println("Digite o cidade do "+ Candidato.getNome()+":");
                    Candidato.setCidade(leitor.nextLine());
                    System.out.println("Digite a idade do "+ Candidato.getNome()+":");
                    Candidato.setIdade(leitor.nextInt());   
                    System.out.println("Quais são as habilidades tecnicas do "+ Candidato.getNome()+"?");
                    Candidato.setHalibidadesTecnicas(leitor.nextLine());
                    Candidato.setHalibidadesTecnicas(leitor.nextLine());
                    System.out.println("Quais são as habilidades Interpessoais do "+ Candidato.getNome()+"?");
                    Candidato.setHalibiladesInterpessoais(leitor.nextLine());
                    System.out.println("Qual é o salario proposto para o "+ Candidato.getNome()+"?");
                    Candidato.setSalarioOferecido(leitor.nextDouble());
                    System.out.println("Qual é o status do "+ Candidato.getNome()+"?" +" \n 1 - Aprovado \n 2 - Inapto \n 3 - Contratado" );
                    Candidato.setStatus(leitor.nextLine());  
                    Candidato.setStatus(leitor.nextLine());  
                    listaDeCandidatos.add(Candidato);
                    System.out.println("Cadastro realizado com sucesso!");
                break;
                
                case 2:
                    Vaga vaga = new Vaga();
                    System.out.println("Digite o nome da Vaga");
                    vaga.setNomeVaga(leitor.nextLine());
                    System.out.println("Digite a localidade");
                    vaga.setLocal(leitor.nextLine());
                    System.out.println("Digite o tempo de alocação da vaga");
                    vaga.setData(leitor.nextLine());
                    System.out.println("Digite a Modalidade da vaga");
                    vaga.setModalidade(leitor.nextLine());
                    listaDeVaga.add(vaga);
                    System.out.println("Cadastro realizado com sucesso!");
                break;

                case 3:
                for (Vaga vagalist : listaDeVaga) {
                    System.out.println(vagalist.toString());
                }

                case 4 :
                for (Candidato candidatolist : listaDeCandidatos) {
                    System.out.println(candidatolist.toString());
                }

            }
        }while(escolha() != 5);
         

     
     
      

       
    }

    private static int escolha() {
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;
        System.out.println("1 - Cadastra um novo Candidato");
        System.out.println("2 - Cadastra uma nova Vaga");
        System.out.println("3 - Para Lista vagas");
        System.out.println("4 - Para Lista os Candidatos Cadastrados");
        System.out.println("5 - Para Sair do sistema");
        escolha = leitor.nextInt();
        return escolha;
    }



    public void criarCandidato(){
        
    }
}
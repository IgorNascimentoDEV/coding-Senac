import java.util.ArrayList;
import java.util.Scanner;

class Principal{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        //Cadastrando Candidatos na Lista:
        ArrayList<Candidato> listaDeCandidatos = new ArrayList<>();

        ArrayList<Vaga> listaDeVaga = new ArrayList<>();
        /*
          //Cadastrando alunos na Lista:
        ArrayList<Aluno> listaDinamicaDeAlunos = new ArrayList<>();

        int escolha = 0;
        do {
            
            Aluno alunoDinamico = new Aluno();
            System.out.println("Digite o nome do Aluno: ");
            alunoDinamico.setNome(leitor.nextLine()); 
            System.out.println("Digite o e-mail do Aluno: ");
            alunoDinamico.setEmail(leitor.nextLine());
            System.out.println("Digite a idade do Aluno: ");
            alunoDinamico.setIdade(leitor.nextInt());     
            listaDinamicaDeAlunos.add(alunoDinamico);
            System.out.println("Deseja continuar? 1 p/ sim ...");
            escolha = leitor.nextInt();
            
        }while (escolha == 1);

         */
        do{
            switch(escolha()){
                case 1:
                Candidato Candidato = new Candidato();
                System.out.println("Digite o nome do Candidato: ");
                Candidato.setNome(leitor.nextLine()); 
                System.out.println("Digite o cidade do Candidato: ");
                Candidato.setCidade(leitor.nextLine());
                System.out.println("Digite a idade do Candidato: ");
                Candidato.setIdade(leitor.nextInt());     
                listaDeCandidatos.add(Candidato);
                System.out.println("Cadastro realizado com sucesso!");

                case 2:
                Vaga vaga = new Vaga();
                System.out.println("Digite o nome da Vaga");
                vaga.setNomeVaga(leitor.nextLine());
                System.out.println("Digite a localidade");
                vaga.setLocal(leitor.nextLine());
                System.out.println("Digite o tempo de alocação da vaga");
                vaga.setData(leitor.nextLine());
                System.out.println("Digite a Modalidade da vaga");

            }
        }while(escolha() != 3);
         

        for (Candidato candidato : listaDeCandidatos) {
            System.out.println(candidato.toString());
        }
      

       
    }

    private static int escolha() {
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;
        System.out.println("1 - Cadastra um novo Candidato");
        System.out.println("2 - Cadastra uma nova Entrevista");
        System.out.println("3 - Para Sair do sistema");
        escolha = leitor.nextInt();
        return escolha;
    }



    public void criarCandidato(){
        
    }
}
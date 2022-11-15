import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ietf.jgss.Oid;


public class Principal{


    public static void main(String[] args) {
        //Instacia do Leitor
        Scanner leitor = new Scanner(System.in);
        //Declarando Array de Alunos
        Aluno[] alunos = new Aluno[50];

        //Declarando Array de Alunos ja populado
        Aluno[] listaDeAlunos = {new Aluno("igor", "igor@gmail.com", 21), new Aluno("fulanigo", "igor@gmail.com", 21), new Aluno("xukixuki", "igor@gmail.com", 21)};

       
        //Percorrendo itens do array com o for
        for(int i = 0; i < listaDeAlunos.length; i++){
            System.out.println(listaDeAlunos[i].getNome());
        }

        //Percorrendo itens do array com o foreach
        for (Aluno aluno : listaDeAlunos) {
            System.out.println(aluno.getNome());
        }

        //ArrayList
        ArrayList lista = new ArrayList();
        lista.add(new Aluno("igor", "igor@gmail.com", 21));

        //Lista é igual ao o arrayList so que só tipado
        ArrayList<Aluno> alunosListas = new ArrayList<Aluno>();
        alunosListas.add(new Aluno("Aline", "aline@gmail.com", 59));
        alunosListas.add(new Aluno("Prof","Prof@gmail.com",56));
        

        for(Aluno alunolist : alunosListas){
            System.out.println(alunolist.getNome());
        }

        alunosListas.get(0).setNome("alterado");


        for(Aluno alunolist : alunosListas){
            System.out.println(alunolist.getNome());
        }

        //Cadastrando alunos na Lista:
        ArrayList<Aluno> listaDinamicaDeAlunos = new ArrayList<>();

 
        do {
            Aluno alunoDinamico = new Aluno();
            System.out.println("Digite o nome do Aluno: ");
            alunoDinamico.setNome(leitor.nextLine()); 
            System.out.println("Digite o e-mail do Aluno: ");
            alunoDinamico.setEmail(leitor.nextLine());
            System.out.println("Digite a idade do Aluno: ");
            alunoDinamico.setIdade(leitor.nextInt());     
            listaDinamicaDeAlunos.add(alunoDinamico);
            
        }while ( Aluno.escolha() == "ns");


    }
}
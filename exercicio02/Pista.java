//importes para a utilização do Scanner
import java.util.Scanner;
import java.lang.System;

public class Pista{
  public String nome;
  public float tamanho;
  public int qtdLombada;

  
  //Metodo responsavel pela verificação da velocidade
  public static float detran(float velocidade, float multa){
    if(velocidade > 60 && velocidade < 90){
      System.out.println("Levou uma multa leve");
      multa = 200;
    }else if(velocidade > 90){
      System.out.println("Levou uma multa grave");
      multa = 600;
    }else{
      System.out.println("Voce não levou multa");
    }
    if(multa > 0){
      System.out.println(multa);
    }
    return multa;
  }

  //Metodo menu
  public static int menu(){
    Scanner leitor = new Scanner(System.in);
    int escolha = 0;
    System.out.println("Digite 01 para corre na Avenida Recife");
    System.out.println("Digite 02 para corre na Avenida Boa Viagem");
    System.out.println("Digite 03 para corre na Avenida Caxangá");
    escolha = leitor.nextInt();
      return escolha;
  }

  //Metodo para perguntar se o usuario deseja continuar 
  public static int desejaContinuar(){
     Scanner leitor = new Scanner(System.in);
    int escolha = 0;
    System.out.println("Digite 1 para Continuar e 0 para sair do sistema ");
     escolha = leitor.nextInt();
      if(escolha != 0 && escolha >3){
        System.out.println("Digite uma opção valida");
      }else if(escolha == 0){
        System.out.println("Obrigado por usar meu sistema");
      }
    return escolha;
  }
}
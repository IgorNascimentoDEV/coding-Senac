//importes para a utilização do Scanner
import java.util.Scanner;
 import java.lang.System;

public class Pista{
  public String nome;
  public float tamanho;
  public int qtdLombada;

  
  //Metodo responsavel pela verificação da velocidadehn
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

}
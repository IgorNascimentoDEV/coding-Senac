 import java.util.Random;
 import java.util.Scanner;
 import java.lang.System;
class Main {
 
  public static void main (String[] args){

    
    //Instâncias da classe Moto   
    Moto start = new Moto();
      start.nome = "Start";
      start.marca = "Honda";
      start.cilindradas = 160f;
      start.multa = 0f;
      start.velocidade = new Random().nextFloat(0, start.cilindradas);

    Moto lander = new Moto();
      lander.nome = "Lander";
      lander.marca = "Yamaha";
      lander.cilindradas = 250f;
      lander.multa = 0f;
      lander.velocidade = new Random().nextFloat(0, lander.cilindradas);

    Moto shineray = new Moto();
      shineray.nome = "Jef 150";
      shineray.marca = "Shineray";
      shineray.cilindradas = 150f;
      shineray.multa = 0f;
      shineray.velocidade = new Random().nextFloat(0, shineray.cilindradas);

    //Instâncias da classe Pista 
    Pista avRecife = new Pista();
      avRecife.nome = "Avenida Recife";
      avRecife.tamanho = 7000f;
      avRecife.qtdLombada = 7;
    
    Pista avBoaViagem = new Pista();
      avBoaViagem.nome = "Avenida Boa Viagem";
      avBoaViagem.tamanho = 6800f;
      avBoaViagem.qtdLombada = 5;

    Pista avCaxanga = new Pista();
      avCaxanga.nome = "Avenida Caxangá";
      avCaxanga.tamanho = 6200f;
      avCaxanga.qtdLombada = 6;


    do{
      switch(Pista.menu()){
        //caso a escolha seja a Avenida Recife
        case 1:
          Moto.chegada(start.velocidade, lander.velocidade, shineray.velocidade);
          System.out.println("--------------------------------------------------");
          //informações sobre as motos
          
          start.velocidade = Moto.Desacelera(start.velocidade, avRecife.qtdLombada);
          System.out.println(start.nome);
          System.out.println("Estava em " + start.velocidade + "km");
          start.multa = Pista.detran(start.velocidade, start.multa);

          System.out.println("--------------------------------------------------");
          
          lander.velocidade = Moto.Desacelera(lander.velocidade, avRecife.qtdLombada);
          System.out.println(lander.nome);
          System.out.println("Estava em " + lander.velocidade + "km");
          lander.multa = Pista.detran(lander.velocidade, lander.multa);

          System.out.println("--------------------------------------------------");
          
          shineray.velocidade = Moto.Desacelera(shineray.velocidade, avRecife.qtdLombada);
          System.out.println(shineray.nome);
          System.out.println("Estava em " + shineray.velocidade + "km");
          shineray.multa = Pista.detran(shineray.velocidade, shineray.multa);

           System.out.println("--------------------------------------------------");
          break;

         //caso a escolha seja a Avenida Boa Viagem
        case 2:
           Moto.chegada(start.velocidade, lander.velocidade, shineray.velocidade);
          System.out.println("--------------------------------------------------");
          //informações sobre as motos
          
          start.velocidade = Moto.Desacelera(start.velocidade, avBoaViagem.qtdLombada);
          System.out.println(start.nome);
          System.out.println("Estava em " + start.velocidade + "km");
          start.multa = Pista.detran(start.velocidade, start.multa);

          System.out.println("--------------------------------------------------");
          
          lander.velocidade = Moto.Desacelera(lander.velocidade, avBoaViagem.qtdLombada);
          System.out.println(lander.nome);
          System.out.println("Estava em " + lander.velocidade + "km");
          lander.multa = Pista.detran(lander.velocidade, lander.multa);

          System.out.println("--------------------------------------------------");
          
          shineray.velocidade = Moto.Desacelera(shineray.velocidade, avBoaViagem.qtdLombada);
          System.out.println(shineray.nome);
          System.out.println("Estava em " + shineray.velocidade + "km");
          shineray.multa = Pista.detran(shineray.velocidade, shineray.multa);

           System.out.println("--------------------------------------------------");
          break;

         //caso a escolha seja a Avenida Caxangá
        case 3:
           Moto.chegada(start.velocidade, lander.velocidade, shineray.velocidade);
          System.out.println("--------------------------------------------------");
          //informações sobre as motos
          
          start.velocidade = Moto.Desacelera(start.velocidade, avCaxanga.qtdLombada);
          System.out.println(start.nome);
          System.out.println("Estava em " + start.velocidade + "km");
          start.multa = Pista.detran(start.velocidade, start.multa);

          System.out.println("--------------------------------------------------");
          
          lander.velocidade = Moto.Desacelera(lander.velocidade, avCaxanga.qtdLombada);
          System.out.println(lander.nome);
          System.out.println("Estava em " + lander.velocidade + "km");
          lander.multa = Pista.detran(lander.velocidade, lander.multa);

          System.out.println("--------------------------------------------------");
          
          shineray.velocidade = Moto.Desacelera(shineray.velocidade, avCaxanga.qtdLombada);
          System.out.println(shineray.nome);
          System.out.println("Estava em " + shineray.velocidade + "km");
          shineray.multa = Pista.detran(shineray.velocidade, shineray.multa);

           System.out.println("--------------------------------------------------");
          break;

        default:System.out.println("Digite uma opção valida");
      }
    }while(Pista.desejaContinuar() != 0);
    
  }
}                                                                                                          
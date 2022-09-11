public class Moto{
  public String nome;
  public String marca;
  public float cilindradas;
  public float velocidade;
  public float multa;

  //Metodo responsavel por indentificar o vencedor da corrida
 public static void chegada(float velocidade1, float velocidade2, float velocidade3){
   if(velocidade1 > velocidade2 && velocidade1 > velocidade3){
     System.out.println("O vencedor é a Start!!");
   }else if(velocidade2 > velocidade3){
     System.out.println("O vencedor é a Lander!!");
   }else{
     System.out.println("O vencedor é a Jef 150!!");
   }
 }

  //Metodo responsavel por desacelera a moto ao chegar na lombada
  public static float Desacelera(float velocidade, int lombadas){
    while (lombadas > 0){
      if(velocidade > 60){
          velocidade-- ;
      }
      lombadas--;
    }
    return velocidade;
  }
} 
public class Moto{
  public String nome;
  public String marca;
  public float cilindradas;
  public float velocidade;
  public float multa;

  //Metodo responsavel por indentificar o vencedor da corrida
 public static void chegada(float velocidade1, float velocidade2, float velocidade3){
   if(velocidade1 > velocidade2 && velocidade1 > velocidade3){
     System.out.println("velocidade01 e o vencedor");
   }else if(velocidade2 > velocidade3){
     System.out.println("velocidade02 e o vencedor");
   }else{
     System.out.println("velocidade03 e o vencedor");
   }
 }
} 
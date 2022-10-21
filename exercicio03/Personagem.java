import java.util.Random;

public abstract class Personagem{
    private int forca;
    private String raca;
    private float vida;
    public  String nome;
    private int level;


    public Magia magico;
    public Arma arma;
    

  


    //Construtor 
    public Personagem(String nome, Magia magico) {
        this.nome = nome;
        this.magico = magico;
    }
       public Personagem( String nome, Arma arma) {
        this.nome = nome;
        this.arma = arma;
    }



    //Metodos de personagem Lutar
    public void Lutar(Personagem p1, Personagem p2){

        System.out.println("O personagens estão lutando");

        //primeiro atack
        p1.setForca(new Random().nextInt(0, getForca()));
        p2.setVida(p2.getVida()- p1.getForca());

        //segundo atack
        p2.setForca(new Random().nextInt(0, getForca()));
        p1.setVida(p1.getVida()-p2.getForca());

        if(p1.getVida()> p2.getVida()){
            System.out.println("Igor ganhou");
        }else{
            System.out.println("Julia ganhou");
        } 
    }


/*----------Métodos Acessores----------*/

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

   
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getVida() {
        return vida;
    }
    public void setVida(float vida) {
        this.vida = vida;
    }

}



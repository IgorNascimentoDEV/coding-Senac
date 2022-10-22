import java.util.Random;

public abstract class Personagem{
    private int forca;
    private String raca;
    private float vida;
    public  String nome;
    private int level;
    private int poderTotal;
    private boolean vencedor = false;


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

        System.out.println("O personagens estão lutando " + p1.nome + " VS " + p2.nome);

        //primeiro atack
        p1.setPoderTotal(new Random().nextInt(0, getPoderTotal()));
        p2.setVida(p2.getVida()- p1.getPoderTotal());

        //segundo atack
        p2.setPoderTotal(new Random().nextInt(0, getPoderTotal()));
        p1.setVida(p1.getVida()-p2.getPoderTotal());

        if(p1.getVida()> p2.getVida()){
            System.out.println(p1.nome + " da raca " + p1.raca + " Ganhou a Batalha");
            System.out.println(p1.nome + " com " + p1.vida + " de vida contra " + p2.getVida() + " de " + p2.nome);
            p1.vencedor = true;
            System.out.println(" ");
        }else{
            System.out.println(p2.nome + " da raca " + p2.raca +" Ganhou a Batalha");
            System.out.println();
            System.out.println(p2.nome + " com " + p2.vida + " de vida contra " + p1.getVida() + " de " + p1.nome);
            p2.vencedor = true;
            System.out.println(" ");
        } 
    }

    //metodo de tornei entre os personagens
    public void Torneio(Personagem p1, Personagem p2, Personagem p3, Personagem p4){

        System.out.println("Inicio da batalha das batalhas de todos os personagens do Game");
        System.out.println("");
        p1.Lutar(p1, p2);
        p3.Lutar(p3, p4);
        System.out.println(" ");
        System.out.println("");
        System.out.println("Batalha final do torneio");
        if(p1.vencedor == true && p3.vencedor == true){
            p1.Lutar(p1, p3);
        }else if(p1.vencedor == true && p4.vencedor == true){
            p1.Lutar(p1, p4);
        }else if(p2.vencedor == true && p3.vencedor== true){
            p2.Lutar(p2, p3);
        }else{
            p2.Lutar(p2, p4);
        }
        System.out.println("Fim da batalha");

    }


/*----------Métodos Acessores----------*/

    public boolean getVencedor(){
        return vencedor;
    }

    public int getPoderTotal(){
        return poderTotal;
    }

    public void setPoderTotal(int poderTotal){
        this.poderTotal = poderTotal;
    }


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



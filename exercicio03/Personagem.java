public abstract class Personagem{
    private String forca;
    private String raca;
    private float vida;
    private int level;
    public Magia magico;
    public Arma arma;

  

    //Construtor
    public Personagem(String raca, Magia magico) {
        this.raca = raca;
        this.magico = magico;
    }

       //Construtor
       public Personagem( Arma arma) {
        this.arma = arma;
    }


/*----------Métodos Acessores----------*/

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

   
    public String getForca() {
        return forca;
    }
    public void setForca(String forca) {
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



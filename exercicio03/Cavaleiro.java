public class Cavaleiro extends Personagem{

    private int velocidadeAtack;
    private int poderCavaleiro;
    public boolean escudo;


    public Cavaleiro(String nome, Arma arma) {
        super(nome, arma);
    }

 
    //metodos acessores
    public void setPoderCavalheiro(int poderCavalheiro, boolean escudo) {
        if(escudo == true){
            this.poderCavaleiro = poderCavalheiro + 100;
        }else{
            this.poderCavaleiro = poderCavalheiro;
        }
    }

    public void setPoderCavalheiro(int poderCavalheiro) {
            this.poderCavaleiro = poderCavalheiro;
      
    }

    public int getPoderCavalheiro() {
        return poderCavaleiro;
    }

    public int getVelocidadeAtack() {
        return velocidadeAtack;
    }

    public void setVelocidadeAtack(int velocidadeAtack) {
        this.velocidadeAtack = velocidadeAtack;
    }
  
}

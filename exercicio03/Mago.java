public class Mago extends Personagem {

    private int poderMago;

    
    public Mago(String nome, Magia magico) {
        super(nome, magico);
    }


    public int getPoderMago() {
        return poderMago;
    }


    public void setPoderMago(int poderMago) {
        this.poderMago = poderMago;
    }
}

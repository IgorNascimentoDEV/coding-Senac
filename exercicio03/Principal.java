import javax.sound.midi.Soundbank;

class Principal{
    public static void main(String[] args) {
        Magia fogo = new Magia();
        Arma varinha = new Arma();
        Mago igor = new Mago("magic", fogo);

        igor.arma = varinha;




        igor.arma.setTipoArma("varinha");
        igor.magico.setNomeMagia("fogo");

        System.out.println(igor.magico.getNomeMagia());
        System.out.println(igor.arma.getTipoArma());
        

    }

  
    
}

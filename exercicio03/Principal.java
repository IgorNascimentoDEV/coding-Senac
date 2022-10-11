class Principal{

   
    public static void main(String[] args) {
      
        Mago mario = new Mago("","");

        mario.setRaca("Mago");
        mario.setForca("100");
        mario.setVida(1000);

        mario.setNomeMagia("fogo");
        mario.setNomeArtefato("cajado de fogo");


        System.out.println(mario.getRaca() + " " + mario.getForca() + " " + mario.getNomeArtefato());

    }
}

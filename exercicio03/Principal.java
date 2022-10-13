class Principal{

   
   
    public static void main(String[] args) {
        Margia margia= new Margia();
        Mago mario = new Mago("mago", margia);

        mario.setRaca("Mago");
        mario.setForca("100");
        mario.setVida(1000);

        ((Margia) mario.tipo).setNomeMagia("fogo");

        System.out.println(((Margia) mario.tipo).getNomeMagia());
        
        ((Margia) mario.tipo).setPoder("do fogo");

        System.out.println(((Margia) mario.tipo).getPoder());
       
    


      
    }
}

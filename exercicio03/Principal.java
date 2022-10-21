
class Principal{
    public static void main(String[] args) {

        //Instancias refentes ao Mago 
        Magia fogo = new Magia();
        fogo.setNomeMagia("Magia das chamas");
        fogo.setPoderMagia(50);
        fogo.setNomeArtefato("Cajado das Chamas negras");
        
        Mago igor = new Mago("Igor", fogo);
        igor.setForca(200);
        igor.setLevel(15);
        igor.setRaca("Mago");
        igor.setVida(300);
        igor.setQtdMagia("Amaterasu");

        //Instacias ferentes ao tipo Valkiria

        Arma machado = new Arma();
        machado.setNomeArma("Machado de Aço");
        machado.setNomeArtefato("Machado");
        machado.setPoderArma(30);

        Valquiria julia = new Valquiria("Julia", machado);
        julia.setForca(300);
        julia.setLevel(11);
        julia.setRaca("Valquiria");
        julia.setVida(400);


        /*
         *   igor.Lutar(igor, julia);

        

        

        System.out.println(julia.getVida());
        System.out.println(igor.getVida());
         */
      
        

        

        Magia agua = new Magia();
        agua.setNomeArtefato("varinha");
        agua.setNomeMagia("poder da agua");
        agua.setPoderMagia(350);

        Bruxa jujulis = new Bruxa("jujupresao", agua);

     

        System.out.println(jujulis.magico.getNomeMagia());
        


        
    }

  
    
}

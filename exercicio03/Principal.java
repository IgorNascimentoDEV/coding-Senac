
class Principal{
    public static void main(String[] args) {

      /*-------------------------------MAGO------------------------------------ */

        //Instancias refentes a Magias 
        Magia fogo = new Magia();
        fogo.setNomeMagia("Magia das chamas");
        fogo.setPoderMagia(450);
        fogo.setNomeArtefato("Cajado das Chamas negras");

        Magia terra = new Magia();
        terra.setNomeMagia("Magia da terra");
        terra.setPoderMagia(410);
        terra.setNomeArtefato("Anel do gigantes Ancestrais");

        
        //Instancia do Mago da magia tipo fogo
        Mago merlin = new Mago("Merlin", fogo);
        merlin.setForca(200);
        merlin.setLevel(15);
        merlin.setRaca("Mago");  
        merlin.setVida(410);
        merlin.setPoderMago(fogo.getPoderMagia() + merlin.getForca() +  merlin.getLevel());

        //Instancia do Mago da magia tipo terra
        Mago radagast = new Mago("Radagast", terra); 
        radagast.setForca(250);
        radagast.setLevel(20);
        radagast.setRaca("Mago");
        radagast.setVida(430);
        radagast.setPoderMago(terra.getPoderMagia() + radagast.getForca() + radagast.getLevel());

        /*-------------------------------CAVALEIRO ---------------------------------------- */

        //Instancias das Armas
        Arma machado = new Arma();
        machado.setNomeArma("Machado de Aço");
        machado.setNomeArtefato("Machado");
        machado.setPoderArma(200);

        Arma espada = new Arma();
        espada.setNomeArma("Excalibur");
        espada.setNomeArtefato("espada");
        espada.setPoderArma(250);


        //Instancias ferentes ao tipo Cavalheiro
        Cavaleiro julia = new Cavaleiro("Julia", machado);
        julia.setForca(300);
        julia.setLevel(11);
        julia.setRaca("Valquiria");
        julia.setVida(430);
        julia.setVelocidadeAtack(60);
        julia.escudo = true;
        julia.setPoderCavalheiro(100, julia.escudo);
        

        System.out.println(julia.getPoderCavalheiro());

        Cavaleiro meliodas = new Cavaleiro("San Meliodas", espada);
        meliodas.setForca(355);
        meliodas.setLevel(20);
        meliodas.setRaca("Cavaleiro");
        meliodas.setVida(450);


        
          

        


         
      
        

        


     
        


        
    }

  
    
}

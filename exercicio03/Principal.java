class Principal{
    public static void main(String[] args) {

      /*-------------------------------MAGO------------------------------------ */

        //Instancias referentes a Magias 
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
        merlin.setPoderTotal(merlin.getPoderMago());

        //Instancia do Mago da magia tipo terra
        Mago radagast = new Mago("Radagast", terra); 
        radagast.setForca(250);
        radagast.setLevel(20);
        radagast.setRaca("Mago");
        radagast.setVida(430);
        radagast.setPoderMago(terra.getPoderMagia() + radagast.getForca() + radagast.getLevel());
        radagast.setPoderTotal(radagast.getPoderMago());

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


        //Instancias referentes ao tipo Cavalheiro do machado
        Cavaleiro julia = new Cavaleiro("Julia", machado);
        julia.setForca(300);
        julia.setLevel(11);
        julia.setRaca("Valquiria");
        julia.setVida(430);
        julia.setVelocidadeAtack(60);
        julia.escudo = true;
        julia.setPoderCavalheiro(100, julia.escudo);
        julia.setPoderCavalheiro(machado.getPoderArma() + julia.getForca() + julia.getLevel());
        julia.setPoderTotal(julia.getPoderCavalheiro());
        
        
        //Instancias referentes ao tipo Cavalheiro da espada
        Cavaleiro meliodas = new Cavaleiro("San Meliodas", espada);
        meliodas.setForca(490);
        meliodas.setLevel(20);
        meliodas.setRaca("Cavaleiro");
        meliodas.setVida(350);
        meliodas.setVelocidadeAtack(200);
        meliodas.escudo = false;
        meliodas.setPoderCavalheiro(espada.getPoderArma() + meliodas.getForca() + julia.getLevel());
        meliodas.setPoderTotal(meliodas.getPoderCavalheiro());


        
        

        

/*==========================================================BATALHAS============================================================== */


//chamada de Metodos de personagem
/* 
  meliodas.Lutar(meliodas, merlin);
  julia.Lutar(julia, meliodas);
  radagast.Lutar(radagast, meliodas);
  merlin.Lutar(merlin, julia);
 */
 
         
  //metodo de torneio entre todos os personagens instanciados
 /*  meliodas.Torneio(merlin, radagast, julia, meliodas);*/
  

  meliodas.gritoGuerra();
    } 
}

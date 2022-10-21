
class Principal{
    public static void main(String[] args) {

        //Instancias refentes a Magias 
        Magia fogo = new Magia();
        fogo.setNomeMagia("Magia das chamas");
        fogo.setPoderMagia(350);
        fogo.setNomeArtefato("Cajado das Chamas negras");

        Magia terra = new Magia();
        terra.setNomeMagia("Magia da terra");
        terra.setPoderMagia(290);
        terra.setNomeArtefato("Anel do gigantes Ancestrais");

        /*------------------------------------------------------------------- */
        
        //Instancia do Mago da magia tipo fogo
        Mago merlin = new Mago("Merlin", fogo);
        merlin.setForca(200);
        merlin.setLevel(15);
        merlin.setRaca("Mago");  
        merlin.setVida(300);
        merlin.setPoderMago(fogo.getPoderMagia() + merlin.getForca() +  merlin.getLevel());

        //Instacia do Mago da magia tipo terra
        Mago radagast = new Mago("Radagast", terra); 






        //Instacias ferentes ao tipo Valkiria111


        Arma machado = new Arma();
        machado.setNomeArma("Machado de Aço");
        machado.setNomeArtefato("Machado");
        machado.setPoderArma(30);

        Valquiria julia = new Valquiria("Julia", machado);
        julia.setForca(300);
        julia.setLevel(11);
        julia.setRaca("Valquiria");
        julia.setVida(400);


        
          merlin.Lutar(merlin, julia);

        

        

        System.out.println(julia.getVida());
        System.out.println(merlin.getVida());
         
      
        

        


     
        


        
    }

  
    
}

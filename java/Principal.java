

class main {
    public static void main (String[] args){
        Jogo mine = new Jogo();
   
          mine.nome = "Minecraft";
          mine.fabricante = "Mojang";
          mine.nota = 4.7f;
          System.out.println("O Game " + mine.nome + " Da Fabricante " + mine.fabricante + " tem a nota: " + mine.nota);
   
        System.out.println("-------------------------------------------------------");
      
          Livro harry = new  Livro();
         
          harry.nome = "Harry Potter e a Pedra Filosofal";
          harry.autor = "J.K Rollings";
          harry.qtdpaginas = 325;
   
          System.out.println("O Livro " + harry.nome + " Da autora " + harry.autor + " tem " + harry.qtdpaginas + " páginas");
  
        System.out.println("-------------------------------------------------------");
      
        Filme pirata = new Filme();
  
        pirata.nome = "Piratas do Caribe: A Maldição do Pérola Negra";
        pirata.categoria = "Aventura/Ação";
        pirata.tempoDuracao = "2h 23m";
  
        System.out.println("O filme " + pirata.nome + " da categoria " + pirata.categoria + " Tem o Tempo de deração de " +  pirata.tempoDuracao);
  
      System.out.println("-------------------------------------------------------");
  
        Serie vikings = new Serie();
  
          vikings.nome = "Vikings";
          vikings.classificacaoEtaria = 16;
          vikings.qtdTemporada = 6;
  
        System.out.println("A série " + vikings.nome + " Tem " + vikings.qtdTemporada + " Temporadas " + " com a classificação etaria de " + vikings.classificacaoEtaria + " anos");
    }
  }
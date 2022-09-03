package classesjava;

class main{
    public static void main(String[] args) {
    
        Jogo mine = new Jogo();
 
        mine.nome = "Minecraft";
        mine.fabricante = "Mojang";
        mine.nota = 4.7f;
        System.out.println("O Game " + mine.nome + " Da Fabricante " + mine.fabricante + " Nota: " + mine.nota);
 
 
        Livro harry = new  Livro();
       
        harry.nome = "Harry Potter e a Pedra Filosofal";
        harry.autor = "J.K Rollings";
        harry.qtdpaginas = 325;
 
        System.out.println("O Livro " + harry.nome + " Da autora " + harry.autor + " tem " + harry.qtdpaginas + "páginas");


        Filme piratas = new Filme();

        piratas.nome = "Piratas do Caribe: A Maldição do Pérola Negra";
        piratas.categoria = "Aventura/Ação";
        piratas.tempoDuracao = "2h 23m"

        System.out.println("O Filme " + piratas.nome + " que tem a Categoria " + piratas.categoria + " Tem como Duração " + piratas.tempoDuracao);


        Serie vikings = new Serie();

        vikings.nome = "Vikings";
        vikings.classificacaoEtaria = 16;
        vikings.qtdTemporada = 6;
    }
}


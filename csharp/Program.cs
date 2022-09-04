class Progam{
    public static void Main(String[] args) {
    
        Jogo mine = new Jogo();
 
        mine.nome = "Minecraft";
        mine.fabricante = "Mojang";
        mine.nota = 4.7f;
        Console.WriteLine($"O Game  {mine.nome}  Da Fabricante {mine.fabricante}  Nota:  {mine.nota}");
 
        Console.WriteLine("-----------------------------------------");

        Livro harry = new  Livro();
       
        harry.nome = "Harry Potter e a Pedra Filosofal";
        harry.autor = "J.K Rollings";
        harry.qtdpaginas = 325;
 
        Console.WriteLine($"O Livro {harry.nome}  Da autora {harry.autor} tem  {harry.qtdpaginas} páginas");

        Console.WriteLine("-----------------------------------------");

        Filme pirata = new Filme();

        pirata.nome = "Piratas do Caribe: A Maldição do Pérola Negra";
        pirata.categoria = "Aventura/Ação";
        pirata.tempoDuracao = "2h 23m";

        Console.WriteLine($"O Filme {pirata.nome}  que tem a Categoria  {pirata.categoria}  Tem como Duração  {pirata.tempoDuracao}");

        Console.WriteLine("-----------------------------------------");


        Serie vikings = new Serie();

        vikings.nome = "Vikings";
        vikings.classificacaoEtaria = 16;
        vikings.qtdTemporada = 6;

       Console.WriteLine($"A série {vikings.nome} tem a classificação Etaria de {vikings.classificacaoEtaria} Anos e contém {vikings.qtdTemporada} temporadas.");
    }


}


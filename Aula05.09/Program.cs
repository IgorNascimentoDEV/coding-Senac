using System;

namespace Aula05._09
{
    class Program
    {
        static void Main(string[] args)
        {
           Personagem gerald = new Personagem();
            gerald.nome = "Gerald";
            gerald.classe = "Bruxo";
            gerald.vida = 10;

            gerald.armadura = new Armadura();
            gerald.armadura.nome = "Armadura da escola do lobo";
            gerald.armadura.pontuacao = 10;
            gerald.armadura.descricao = "Armadura do cachorrão";

           Personagem patolino = new Personagem();
            patolino.nome = "Patolino";
            patolino.classe = "Mago";
            patolino.vida = 10;

            for (int i = 0; i < 5; i++)
            {
                gerald.Lutar(patolino);
                patolino.Lutar(gerald);
            }
        }
                    
    }          
}

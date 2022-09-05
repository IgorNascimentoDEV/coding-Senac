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
           gerald.vida = 100;

           gerald.armadura = new Armadura();
           gerald.armadura.nome = "Armadura escola do lobo";
           gerald.armadura.pontuacao = 10;
           gerald.armadura.descricao = "Armadura do cachorrão";

           gerald.Lutar();
        }
    }
}

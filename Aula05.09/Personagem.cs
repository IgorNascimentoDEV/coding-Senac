using System;
public class Personagem
{
    public string nome;
    public string classe;
    public int vida;
    public int ataque;
    public Armadura armadura;
    public void Lutar(Personagem p)
    {
        if (this.armadura == null){ 
            Console.WriteLine($"{this.nome} não possui armadura ...");
        }
        this.ataque = new Random().Next(0, 10);
        p.ataque = new Random().Next(0, 10);
        if (this.ataque < p.ataque)
        {
            this.vida--;
        }
        else if (this.ataque > p.ataque)
        {
            p.vida--;
        }
        Console.WriteLine($"A vida de de {this.nome} é {this.vida}");
        Console.WriteLine($"A vida de de {p.nome} é {p.vida}");
    }}
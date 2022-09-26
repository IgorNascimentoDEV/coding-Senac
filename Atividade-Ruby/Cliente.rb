class Cliente
    attr_accessor :nome
    attr_accessor :sexo
    attr_accessor :idade
    attr_accessor :profissao
  
    def initialize(nome, sexo, idade, profissao)
      @nome = nome 
      @sexo = sexo 
      @idade = idade
      @profissao = profissao
    end
  end
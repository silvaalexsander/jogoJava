Jogo de combate em Java.
Combates realizados apenas via terminal.

# Os combates acontecem entre duas classes de personagens, os Orcs e os Humanos. Cada classe conta com três subclasses de personagens. Cada classe possuem atributos 
  próporios para combate.
  
- Humanos (Inteligência, Velocidade, Equipamento)
  - Soldado
  - Arqueiro
  - Robô

- Orcs (Força, Habilidade, Agilidade)
  - Demônio
  - Mago 
  - Ogro

A partir daí são gerados dois Array List de tamanho 100 onde serão inseridos personagens do tipo Orcs e Humanos aleatoriamente. Ao final teremos dois arrays de 
tamanho 100 preenchidos, um deles com Soldados, Arqueiros e Robôs e o outro com Ogros, Demônios e Magos.

Após os Arrays estarem preenchidos, é dado inicio ao combate, onde primeiro é sorteado o estilo de combate conforme os atributos.
Os combates são:

Agilidade x Equipamento
Habilidade x Velocidade
Inteligencia x Força

Sorteado o combate, é então comparado os arrays de Humanos com o de Orcs indice a indice. 
O que tiver atributo maior que o adversário conforme o estilo de combate, vence.
Ao final vence a classe que tiver mais vitórias.


Para esse projeto utilizei os paradigmas de POO, como abstração, encapsulamento, polimorfismo e herança.

Utilizei classes abstratas para que pudesse herdar dela atributos e funções. 
Os danos de vida são captados e setados através de funções Getters e Setters.

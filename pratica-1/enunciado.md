#Exercício 1
A companhia Choque Ltda fornece energia elétrica para a cidade de
Lavras. Para emitir a fatura de cobrança de um cliente residencial a
empresa verifica o consumo mensal (quantidade de energia consumida
em quilowatts, kWh) e calcula o preço de acordo com a equação e
regras estabelecidas a seguir:
Preço = Valor referente à quantidade consumida + Taxa fixa
Regras:
I
Até 10 kWh o valor referente à quantidade consumida é de R$
5,00. Nesse caso, a taxa fixa é igual a R$ 0,00.
I
Acima de 10 kWh até 100 kWh, o valor referente à quantidade
consumida é dado pelo consumo (kWh) multiplicado pela taxa de
R$ 0,60. Nesse caso, a taxa fixa é igual a R$ 2,00.
I
Acima de 100 kWh a taxa fixa é igual a R$ 3,00. Além disso, o
valor referente à quantidade consumida é calculado da seguinte
maneira:
I
R$ 0,60 por kWh para os primeiros 100 kWh,
I
R$ 0,85 por kWh para os próximos 50 kWh,
I
R$ 1,20 por kWh para a quantidade restante, ou seja, para
aquilo que ultrapassa 150 kWh.
Escreva um programa que receba como entrada a quantidade de
energia elétrica consumida por um cliente residencial e calcule o valor
da fatura desse cliente.
Entrada:
Consumo mensal em kWh (número
inteiro).
Saída:
Valor da fatura do cliente.
Exemplo de Entrada:
9
Exemplo de Saída:
5.0
Exemplo de Entrada:
200
Exemplo
de Saída:
165.5
Prof. Luiz Merschmann
Exercício 1 (continuação)
Escreva um programa que receba como entrada a quantidade de
energia elétrica consumida por um cliente residencial e calcule o valor
da fatura desse cliente.
Entrada:
Consumo mensal em kWh (número inteiro).
Saída:
Valor da fatura do cliente.
Exemplo de Entrada:
9
Exemplo de Saída:
5.0
Exemplo de Entrada:
200
Exemplo de Saída:
165.5
Prof. Luiz Merschmann

#Exercício 2
Airton e Rubens são dois amigos que resolveram disputar uma corrida
de automóvel num autódromo que possui uma pista em circuito
fechado com 1500 metros de extensão, ou seja, a cada volta dada na
pista percorre-se 1500 metros. Ao completar a décima volta nesse
circuito, Rubens está 120 metros à frente do Airton. No entanto, os
pneus do carro do Airton estão bem menos desgastados do que os do
carro do Rubens, fazendo com que nesse momento da corrida o Airton
consiga conduzir o seu carro numa velocidade constante maior do que
a velocidade do carro do Rubens (que também é constante).
Faça um programa que receba como entrada as velocidades dos carros
do Rubens e do Airton (nessa ordem) no momento em que o Rubens
completa a décima volta e utilize a estrutura de repetição WHILE
para calcular em qual volta da corrida o carro do Airton irá
ultrapassar o carro do Rubens. Vale observar que o carro que está
ganhando a corrida é utilizado como referência para se obter o
número da volta da corrida.
Prof. Luiz Merschmann
Exercício 2 (continuação)
Sabemos que quando um objeto se desloca com uma velocidade constante,
diz-se que esse objeto está em um movimento uniforme. Nesse caso, a
equação horária do espaço é dada por: S = So + v * t, onde S é a posição
final do objeto, So é a posição inicial, t é o tempo e v é a velocidade.
Entradas:
Velocidade (m/s) do carro do Rubens (inteiro positivo).
Velocidade (m/s) do carro do Airton (inteiro positivo maior do que a
velocidade do carro do Rubens).
Saída:
Número da volta da corrida em que o carro do Airton irá ultrapassar o
carro do Rubens.
Exemplo de Entrada:
52
55
Exemplo de Saída:
12
Exemplo de Entrada:
60
61
Exemplo de Saída:
15


#Exercício 3
O professor de GCC110 precisa gerar estatísticas sobre o desempenho
dos 9 alunos que cursam essa disciplina. Para isso, implemente um
programa que leia um vetor contendo as notas dos alunos em uma
prova e retorne o valor da sua moda. É chamado de moda o valor
mais frequente de um conjunto de valores. As notas dos alunos são
valores inteiros que variam entre 0 e 10 (incluindo esses valores).
OBS: Desconsidere o caso em que o conjunto de valores tenha mais de
uma moda (haverá sempre apenas uma moda).
Entrada:
Sequência de notas dos alunos (inteiros no intervalo [0,10]).
Saída:
O valor da moda.
Exemplo de Entrada:
10 5 2 7 4 5 9 5 7 (um valor em cada linha)
Exemplo de Saída:
5


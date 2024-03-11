// Exercício A
//Implemente um programa em java que seja capaz de gerar e retornar no console o
//seguinte modelo de mensagem:
//Cássio Ramos é um futebolista brasileiro de 32 anos que atua como goleiro. Atualmente defende o Corinthians.
//A mensagem de texto deverá conter os seguintes requisitos:
//Nome e sobrenome aleatórios
//Idade (entre 17 e 40 anos)
//Posição (aleatória)
//Clube (aleatório)

import java.util.Random;

public class montadorDeFrase {
    public static void main(String[] args) {
        String[] nomes = {"Roberto", "Tiago", "Paulo", "Fabio", "João"};

        String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Souza", "Pereira"};

        String[] clubes = {"Flamengo", "Corinthians", "Vasco", "Palmeiras", "Grêmio"};

        Random sorteio = new Random();
        String nome = nomes[sorteio.nextInt(nomes.length)];
        String sobrenome = sobrenomes[sorteio.nextInt(sobrenomes.length)];

        int idade = sorteio.nextInt(24) + 17;

        String[] posicoes = {"goleiro", "atacante", "zagueiro", "líbero", "lateral"};
        String posicao = posicoes[sorteio.nextInt(posicoes.length)];

        String clube = clubes[sorteio.nextInt(clubes.length)];

        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube);
    }
}
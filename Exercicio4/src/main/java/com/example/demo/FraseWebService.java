package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class FraseWebService {

    public static void main(String[] args) {
        SpringApplication.run(FraseWebService.class, args);
    }
}

@Component
class DadosIniciaisLoader {
    private final List<String> nomes = List.of("Roberto", "Tiago", "Paulo", "Fabio", "João");
    private final List<String> sobrenomes = List.of("Silva", "Santos", "Oliveira", "Souza", "Pereira");
    private final List<String> posicoes = List.of("goleiro", "atacante", "zagueiro", "líbero", "lateral");
    private final List<String> clubes = List.of("Flamengo", "Corinthians", "Vasco", "Palmeiras", "Grêmio");
    private final Random sorteio = new Random();

    private List<String> dadosIniciais = new ArrayList<>();

    @PostConstruct
    public void carregarDadosIniciais() {
        dadosIniciais.addAll(nomes);
        dadosIniciais.addAll(sobrenomes);
        dadosIniciais.addAll(posicoes);
        dadosIniciais.addAll(clubes);
    }

    public List<String> getNomes() {
        return nomes;
    }

    public List<String> getSobrenomes() {
        return sobrenomes;
    }

    public List<String> getPosicoes() {
        return posicoes;
    }

    public List<String> getClubes() {
        return clubes;
    }

    public Random getSorteio() {
        return sorteio;
    }

    public List<String> getDadosIniciais() {
        return dadosIniciais;
    }

    public String getRandomItem(List<String> lista) {
        return lista.get(sorteio.nextInt(lista.size()));
    }
}

@RestController
class FraseController {
    private final DadosIniciaisLoader dadosLoader;

    public FraseController(DadosIniciaisLoader dadosLoader) {
        this.dadosLoader = dadosLoader;
    }

    @GetMapping("/gerar-frase")
    public String gerarFrase() {
        String nome = dadosLoader.getRandomItem(dadosLoader.getNomes());
        String sobrenome = dadosLoader.getRandomItem(dadosLoader.getSobrenomes());
        String posicao = dadosLoader.getRandomItem(dadosLoader.getPosicoes());
        String clube = dadosLoader.getRandomItem(dadosLoader.getClubes());
        int idade = dadosLoader.getSorteio().nextInt(24) + 17;

        return nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube;
    }
}

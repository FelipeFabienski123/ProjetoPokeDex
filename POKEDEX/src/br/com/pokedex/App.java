package br.com.pokedex;

import br.com.pokedex.network.HTTPRequest;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        new HTTPRequest().requestGetMethod("http://pokeapi.co/api/v2/pokemon/mewtwo/");
    }
}

package br.upe.entities;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ObterResultados {

    public static Elements obterResultados(){
        try {
            Document doc = Jsoup.connect("https://noticias.uol.com.br/loterias/mega-sena/").get();

            return doc.select(".lt-number");
        } catch (IOException e){
            System.out.println("Ocorreu um erro IO ao realizar a requisição: " + e);
        } catch (Exception e){
            System.out.println("Ocorreu um erro: " + e);
        }
        return null;
    }
}
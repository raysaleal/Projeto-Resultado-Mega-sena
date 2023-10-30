package br.upe.entities;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ImprimirResultado {
    public ImprimirResultado() {
    }

    Elements resultadoMegasena = ObterResultados.obterResultados();

    public void imprimeResultado(){
        if (resultadoMegasena != null){
            System.out.println("Resultados da mega-sena: ");

            for (Element resultado : resultadoMegasena) {
                System.out.println(resultado.wholeText());
            }
        } else {
            System.out.println("Ocorreu um erro. O resultado está vazio!");
        }
    }
}
package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaAreas = 0.0;

        for (Figura figura : figuras) {
            somaAreas += figura.calcularArea();
        }

        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {

        List<Figura> areasMaiorVinte = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                areasMaiorVinte.add(figura);
            }
        }

        return areasMaiorVinte;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> listaFiguras = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                listaFiguras.add(figura);
            }
        }

        return listaFiguras;
    }

}

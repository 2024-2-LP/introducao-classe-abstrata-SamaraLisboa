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


}

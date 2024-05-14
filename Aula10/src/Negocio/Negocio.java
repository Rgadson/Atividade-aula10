package Negocio;

import Modelo.publica;
import View.View;

public class Negocio {
    private publica modelo;
    private View visualizacao;

    public Negocio(publica modelo, View visualizacao) {
        this.modelo = modelo;
        this.visualizacao = visualizacao;
    }

    public void adicionarNumeros(int[] numeros) {
        for (int i = 0; i < modelo.getNumeroElementos(); i++) {
            int numero = numeros[i];
            modelo.adicionarNumero(i, numero);
        }
    }

    public void ordenarNumeros() {
        modelo.ordenar();
        for (int i = 0; i < modelo.getNumeroElementos(); i++) {
            visualizacao.mostrarNumero(modelo.getNumero(i), i);
        }
    }
}

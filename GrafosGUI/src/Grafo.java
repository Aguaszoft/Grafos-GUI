import java.util.ArrayList;

public class Grafo {private ArrayList<Vertice> vertices;

    private boolean[][] matrizAdyacencia;
    private int contarVertice;

    public Grafo(int maxVertices) {
        vertices = new ArrayList<>();
        matrizAdyacencia = new boolean[maxVertices][maxVertices];
        contarVertice = 0;
    }

    public void anadirVertice(Vertice v) {
        vertices.add(v);
    }

    public void anadirLado(int v1, int v2) {
        if (v1 < contarVertice && v2 < contarVertice) {
            matrizAdyacencia[v1][v2] = true;
            matrizAdyacencia[v2][v1] = true;  // Para grafos no dirigidos
        }
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public boolean[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public int getContarVertice() {
        return contarVertice;
    }

    public String getEtiquetaVerticeSiguiente() {
        return String.valueOf((char) ('A' + contarVertice++));
    }


}

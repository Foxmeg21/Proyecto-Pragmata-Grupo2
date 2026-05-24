package models;

public class matriz {

    private celda[][] tabla;

    public matriz(int filas, int columnas) {
        this.tabla = new celda[filas][columnas];
        inicializarmatriz();
    }

    private void inicializarmatriz() {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = new celda();
            }
        }

        tabla[0][0].setContenido('S');
        tabla[1][2].setContenido('O');
        tabla[2][0].setContenido('P');
        tabla[3][1].setContenido('P');
        tabla[3][3].setContenido('M');
    }

    public void mostrar(int jugFila, int jugCol) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
           if (i == jugFila && j == jugCol) {
                    System.out.print("[X] ");
            } else {

                System.out.print("[" + tabla[i][j].getContenido() + "] ");
                }
            }
            System.out.println();
        }
    }

    public char getCelda(int f, int c) {
        return tabla[f][c].getContenido();
    }

    public void limpiarCelda(int f, int c) {
        tabla[f][c].limpiar();
    }

    public int getFilas() {
        return tabla.length;
    }

    public int getColumnas() {
        return tabla[0].length;
    }
}
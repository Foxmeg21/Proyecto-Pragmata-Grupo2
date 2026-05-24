package models;

public class celda {
    private char contenido;

    public celda() {

        this.contenido = ' ';
    }

    public char getContenido() {
        return contenido;
    }

    public void setContenido(char contenido) {
        this.contenido = contenido;
    }

    public void limpiar() {

        this.contenido = ' ';
    }
}
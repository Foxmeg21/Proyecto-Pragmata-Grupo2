package models;

public class secuencia {

    int jugadorFila = 0;
    int jugadorCol = 0;
    int puntaje = 100;
    boolean jugando = true;

public secuencia() {
    this.puntaje = 100;
    this.jugando = true;
    this.jugadorFila = 0;
    this.jugadorCol = 0;
}
public boolean aplicarCelda(char contenido, matriz tablero, int fila, int col) {
    switch (contenido) {
    case 'O' -> {
        tablero.mostrar(fila, col);
        System.out.println("\n¡Secuencia terminada con éxito! Llegaste al objetivo.");
        System.out.println("Puntaje Final: " + puntaje + " puntos.");
        jugando = false;
        return false;
    }
    case 'P' -> {
        puntaje *= 2;
        System.out.println("¡Potenciador activado! Tu puntaje se duplicó.");
        return true;
    }
    case 'M' -> {
        puntaje += 50;
        System.out.println("¡Modificador activado! Sumaste 50 puntos.");
        return true;
    }
    default -> { return false; }
}
}

public boolean mover(String direccion){
    switch (direccion) {


    case "W" -> jugadorFila--;
    case "S" -> jugadorFila++;
    case "A" -> jugadorCol--;
    case "D" -> jugadorCol++;
        default ->{ return false; }
    }
    return true;
}
    public int getPuntaje()     { return puntaje; }
    public boolean isJugando()  { return jugando; }
    public int getJugadorFila() { return jugadorFila; }
    public int getJugadorCol()  { return jugadorCol; }


    public void setJugadorFila(int f) { jugadorFila = f; }
    public void setJugadorCol(int c)  { jugadorCol = c; }
}

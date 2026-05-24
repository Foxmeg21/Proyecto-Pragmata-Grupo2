package models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 matriz tablero = new matriz(4, 4);
        secuencia secuencia = new secuencia();



 System.out.println("=== RECREACIÓN SISTEMA DE HACKEO ===");


        while (secuencia.isJugando()) {



            tablero.mostrar(secuencia.getJugadorFila(), secuencia.getJugadorCol());
            System.out.print("Mover (W: Arriba, S: Abajo, A: Izquierda, D: Derecha): ");
            String entrada = scanner.nextLine().toUpperCase();
            int filaAnterior = secuencia.getJugadorFila();
            int colAnterior  = secuencia.getJugadorCol();

            if (!secuencia.mover(entrada)) {
                System.out.println("Tecla inválida. Usa W, A, S o D.");
                continue;
            }

            if (secuencia.getJugadorFila() < 0 || secuencia.getJugadorFila() >= tablero.getFilas() ||
                    secuencia.getJugadorCol() < 0  || secuencia.getJugadorCol() >= tablero.getColumnas()) {
                System.out.println("Movimiento inválido. Límite del tablero alcanzado.");
                secuencia.setJugadorFila(filaAnterior);
                secuencia.setJugadorCol(colAnterior);
                continue;
            }

            char contenido = tablero.getCelda(secuencia.getJugadorFila(), secuencia.getJugadorCol());
            boolean limpiar = secuencia.aplicarCelda(contenido, tablero, secuencia.getJugadorFila(), secuencia.getJugadorCol());

            if (limpiar) {
                tablero.limpiarCelda(secuencia.getJugadorFila(), secuencia.getJugadorCol());


        }

    }}}


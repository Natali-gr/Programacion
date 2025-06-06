import java.util.Scanner;
import java.util.Random;
public class practicaEvaluable {
        private static final int SIZE = 6; // Tamaño del tablero (6x6)
        private static int[][] board = new int[SIZE][SIZE];
        private static int level = 5; // Nivel inicial
        private static int maxMoves;
        private static int moves;
        private static int[][] previousBoard = new int[SIZE][SIZE];
        private static boolean undoAvailable = false;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            boolean playing = true;

            System.out.println("Bienvenido a Buttonmania!");
            while (playing) {
                initializeBoard(random);
                printBoard();

                System.out.println("Nivel actual: " + level);
                System.out.println("Resuelve en " + maxMoves + " golpes para ser perfecto!");

                moves = 0;
                while (true) {
                    System.out.println("\nSeleccione una opción:");
                    System.out.println("1-36: Golpear casilla (fila * 6 + columna + 1)");
                    System.out.println("U: Deshacer último golpe");
                    System.out.println("R: Reiniciar juego actual");
                    System.out.println("N: Nuevo juego (mismo nivel)");
                    System.out.println("L: Cambiar nivel (1-9)");
                    System.out.println("S: Salir del juego");

                    String input = scanner.nextLine().toUpperCase();

                    if (input.equals("S")) {
                        System.out.println("Gracias por jugar a Buttonmania!");
                        playing = false;
                        break;
                    } else if (input.equals("U")) {
                        if (undoAvailable) {
                            undoLastMove();
                            System.out.println("Último golpe deshecho.");
                        } else {
                            System.out.println("No hay movimientos para deshacer.");
                        }
                    } else if (input.equals("R")) {
                        initializeBoard(random);
                        System.out.println("Juego reiniciado.");
                    } else if (input.equals("N")) {
                        initializeBoard(random);
                        System.out.println("Nuevo juego iniciado.");
                    } else if (input.equals("L")) {
                        System.out.println("Seleccione un nivel (1-9):");
                        int newLevel = scanner.nextInt();
                        scanner.nextLine(); // Consumir salto de línea
                        if (newLevel >= 1 && newLevel <= 9) {
                            if (newLevel != level) {
                                level = newLevel;
                                initializeBoard(random);
                            }
                            System.out.println("Nivel cambiado a " + level);
                        } else {
                            System.out.println("Nivel inválido. Debe estar entre 1 y 9.");
                        }
                    } else {
                        try {
                            int position = Integer.parseInt(input);
                            if (position >= 1 && position <= SIZE * SIZE) {
                                int row = (position - 1) / SIZE;
                                int col = (position - 1) % SIZE;
                                saveBoardState();
                                makeMove(row, col);
                                moves++;
                                printBoard();

                                if (isBoardCleared()) {
                                    if (moves == maxMoves) {
                                        System.out.println("Perfecto. Hecho en " + moves + " golpes.");
                                    } else if (moves < maxMoves) {
                                        System.out.println("Extraordinariamente bien: Hecho en " + moves + " golpes.");
                                    } else {
                                        System.out.println("Hecho en " + moves + " golpes.");
                                    }
                                    break;
                                }
                            } else {
                                System.out.println("Posición inválida. Debe estar entre 1 y 36.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida.");
                        }
                    }
                }
            }
            scanner.close();
        }

        private static void initializeBoard(Random random) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    board[i][j] = random.nextInt(4); // Números entre 0 y 3
                }
            }
            maxMoves = level * 3;
            undoAvailable = false;
        }

        private static void printBoard() {
            System.out.println("\nTablero actual:");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }

        private static void saveBoardState() {
            for (int i = 0; i < SIZE; i++) {
                System.arraycopy(board[i], 0, previousBoard[i], 0, SIZE);
            }
            undoAvailable = true;
        }

        private static void undoLastMove() {
            for (int i = 0; i < SIZE; i++) {
                System.arraycopy(previousBoard[i], 0, board[i], 0, SIZE);
            }
            moves--;
            undoAvailable = false;
            printBoard();
        }

        private static void makeMove(int row, int col) {
            decrementCell(row, col);
            if (row > 0) decrementCell(row - 1, col); // Arriba
            if (row < SIZE - 1) decrementCell(row + 1, col); // Abajo
            if (col > 0) decrementCell(row, col - 1); // Izquierda
            if (col < SIZE - 1) decrementCell(row, col + 1); // Derecha
        }

        private static void decrementCell(int row, int col) {
            board[row][col] = (board[row][col] - 1 + 4) % 4;
        }

        private static boolean isBoardCleared() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (board[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
}

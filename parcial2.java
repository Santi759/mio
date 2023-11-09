import java.util.Scanner;
import java.util.regex.Pattern;

public class DNAAnalyzer {
    public static void main(String[] args) {
        char[][] dna = new char[6][6];
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------------------");
        System.out.println("     <<<ADN MUTANTES>>>     ");
        System.out.println("-----------------------------");

        matrixMutants(dna, scanner);

        boolean isMutant = isMutant(dna);

        // Mostramos la matriz ingresada
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(dna[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        if (isMutant) {
            System.out.println("Se encontró ADN mutante");
        } else {
            System.out.println("No hay ADN mutante");
        }
    }

    public static void matrixMutants(char[][] dna, Scanner scanner) {
        // Usamos una expresión regular para verificar que la fila contenga solo caracteres A, C, G o T.
        String pattern = "^[ACGTacgt]{6}$";
        Pattern regex = Pattern.compile(pattern);

        for (int i = 0; i < 6; i++) {
            String row;
            do {
                System.out.print("Ingrese la fila " + (i + 1) + ". Debe contener 6 caracteres (ACGT): ");
                row = scanner.next().toUpperCase();
            } while (!regex.matcher(row).matches());

            dna[i] = row.toCharArray();
        }
    }

    public static boolean isMutant(char[][] dna) {
        int[][] directions = {{1, 0}, {0, 1}, {1, 1}, {-1, 1}};

        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length; j++) {
                for (int[] direction : directions) {
                    int count = 0;
                    int x = i;
                    int y = j;

                    while (0 <= x && x < dna.length && 0 <= y && y < dna[x].length && dna[x][y] == dna[i][j]) {
                        count++;
                        x += direction[0];
                        y += direction[1];
                    }

                    if (count >= 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

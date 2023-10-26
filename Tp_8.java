public class SumaMatrices {
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] matrizTranspuesa(int[][] matriz1) {
        int rows = matriz1.length;
        int columns = matriz1[0].length;

        int[][] matrizTranspuesta = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrizTranspuesta[j][i] = matriz1[i][j];
            }
        }
        return matrizTranspuesta;
    }

    public static boolean esSimetrica(int[][] matriz1) {
        int rows = matriz1.length;
        int columns = matriz1[0].length;

        if (rows != columns) {
            return false;
        }
        int[][] transpuesta = matrizTranspuesa(matriz1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matriz1[i][j] != transpuesta[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatriz(int[][] matriz1) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static int[] productoEscalar(int[] vector, int numero) {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * numero;
        }
        return resultado;
    }
    public static int[][] sumarMatriz(int[][]sumaMatriz){
        int filas = sumaMatriz.length;
        int columnas = sumaMatriz[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = sumaMatriz[i][j] + sumaMatriz[i][j];
            }
        }
        return resultado;
    }


    public static void main(String[] args) {
        //Ejercicio_1
        System.out.println("Suma de matrices");
        int[][] matriz1 = {{1, 2, 3}, {3, 2, 1}, {5, 4, 6}};
        int[][] matriz2 = {{9, 8, 7}, {1, 3, 4}, {3, 4, 1}};
        int[][] resultado = sumarMatrices(matriz1, matriz2);
        mostrarMatriz(resultado);

        //Ejercicio_2
        System.out.println("Matriz multiplicada");

        int[][] resultadoMult = multiplicarMatrices(matriz1,matriz2);
        mostrarMatriz(resultadoMult);

        //Ejercicio_3
        int[][] transpuesta = matrizTranspuesa(matriz1);
        System.out.println("Matriz Original: ");
        printMatriz(matriz1);
        System.out.println("Matriz Transpuesta: ");
        printMatriz(transpuesta);

        //Ejercicio_4
        boolean esMatrizSimetrica=esSimetrica(matriz1);
        if (esMatrizSimetrica){
            System.out.println("La matriz es simétrica.");
        }else {
            System.out.println("La matriz no es simétrica.");
        }
        //Ejercicio_5
        int[] vector={1,2,3,4,5};
        int numero=2;
        int []producto=productoEscalar(vector,numero);
        System.out.println("Producto del vecto: ");
        for (int i=0; i<producto.length;i++){
            System.out.print(producto[i]+" ");
        }
        System.out.println("");
        //Ejercicio_6
        int[][] sumaMatriz ={{1,2,3},{50,20,30},{12,22,32}};
        int [][] resultadoSuma = sumarMatriz(sumaMatriz);
        System.out.println("Matriz original: ");
        printMatriz(sumaMatriz);
        System.out.println("Suma de la matriz: ");
        printMatriz(resultadoSuma);


    }

}

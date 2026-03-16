//menu
// import java.util.Scanner;

// public class SistemaMatriz {

//     static Scanner sc = new Scanner(System.in);
//     static String[][] matriz;

//     public static void main(String[] args) {

//         int opcion;

//         do {
//             System.out.println("\n--- MENU ---");
//             System.out.println("1. Crear matriz");
//             System.out.println("2. Llenar matriz");
//             System.out.println("3. Buscar dato");
//             System.out.println("4. Modificar dato");
//             System.out.println("5. Salir");

//             opcion = validarNumero();

//             switch(opcion) {
//                 case 1:
//                     crearMatriz();
//                     break;
//                 case 2:
//                     llenarMatriz();
//                     break;
//                 case 3:
//                     buscarDato();
//                     break;
//                 case 4:
//                     modificarDato();
//                     break;
//                 case 5:
//                     System.out.println("Saliendo...");
//                     break;
//                 default:
//                     System.out.println("Opcion invalida");
//             }

//         } while(opcion != 5);
//     }

// //crear matriz
// public static void crearMatriz() {
//     System.out.println("Ingrese filas:");
//     int filas = validarNumero();

//     System.out.println("Ingrese columnas:");
//     int columnas = validarNumero();

//     matriz = new String[filas][columnas];

//     System.out.println("Matriz creada correctamente");
// }
// //matriz transpuesta
// int[][] transpuesta = new int[columnas][filas];

// for(int i = 0; i < filas; i++){
//     for(int j = 0; j < columnas; j++){
//         transpuesta[j][i] = matriz[i][j];
//     }
// }
// //llenarmatriz
// public static void llenarMatriz() {

//     if(matriz == null) {
//         System.out.println("Primero cree la matriz");
//         return;
//     }

//     for(int i = 0; i < matriz.length; i++) {
//         for(int j = 0; j < matriz[i].length; j++) {

//             System.out.println("Ingrese dato en [" + i + "][" + j + "]:");
//             matriz[i][j] = sc.nextLine();
//         }
//     }
// }
// //buscar en la matriz
// public static void buscarDato() {

//     if(matriz == null) {
//         System.out.println("Primero cree la matriz");
//         return;
//     }

//     System.out.println("Ingrese dato a buscar:");
//     String buscar = sc.nextLine();

//     boolean encontrado = false;

//     for(int i = 0; i < matriz.length; i++) {
//         for(int j = 0; j < matriz[i].length; j++) {

//             if(matriz[i][j].equalsIgnoreCase(buscar)) {
//                 System.out.println("Encontrado en [" + i + "][" + j + "]");
//                 encontrado = true;
//             }
//         }
//     }

//     if(!encontrado) {
//         System.out.println("No se encontro el dato");
//     }
// }
// //modificar matriz
// public static void modificarDato() {

//     if(matriz == null) {
//         System.out.println("Primero cree la matriz");
//         return;
//     }

//     System.out.println("Fila:");
//     int fila = validarNumero();

//     System.out.println("Columna:");
//     int columna = validarNumero();

//     if(fila >= 0 && fila < matriz.length &&
//        columna >= 0 && columna < matriz[0].length) {

//         System.out.println("Nuevo valor:");
//         matriz[fila][columna] = sc.nextLine();

//         System.out.println("Dato modificado correctamente");
//     } else {
//         System.out.println("Posicion invalida");
//     }
// }
// //sumar matrices
// public static int[][] sumarMatrices(int[][] A, int[][] B) {

//     int filas = A.length;
//     int columnas = A[0].length;

//     int[][] resultado = new int[filas][columnas];

//     for(int i = 0; i < filas; i++) {
//         for(int j = 0; j < columnas; j++) {

//             resultado[i][j] = A[i][j] + B[i][j];
//         }
//     }

//     return resultado;
// }
// //comparar matrices
// public static boolean compararMatrices(int[][] A, int[][] B) {

//     if(A.length != B.length || A[0].length != B[0].length) {
//         return false;
//     }

//     for(int i = 0; i < A.length; i++) {
//         for(int j = 0; j < A[0].length; j++) {

//             if(A[i][j] != B[i][j]) {
//                 return false;
//             }
//         }
//     }

//     return true;
// }
// //crear matrizx resultando
// public static int[][] matrizComparacion(int[][] A, int[][] B) {

//     int filas = A.length;
//     int columnas = A[0].length;

//     int[][] resultado = new int[filas][columnas];

//     for(int i = 0; i < filas; i++) {
//         for(int j = 0; j < columnas; j++) {

//             if(A[i][j] == B[i][j]) {
//                 resultado[i][j] = 1;
//             } else {
//                 resultado[i][j] = 0;
//             }
//         }
//     }

//     return resultado;
// }
// //imprimir matriz
// public static void imprimirMatriz(int[][] M) {

//     for(int i = 0; i < M.length; i++) {
//         for(int j = 0; j < M[0].length; j++) {

//             System.out.print(M[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
// //soloo fila
// int fila = 1;

// for(int j = 0; j < matriz[0].length; j++){
//     System.out.print(matriz[fila][j] + " ");
// }
// //solo columna
// int columna = 0;

// for(int i = 0; i < matriz.length; i++){
//     System.out.println(matriz[i][columna]);
// }
// //contar que cumpla una condicion matriz
// int contador = 0;

// for(int i = 0; i < matriz.length; i++){
//     for(int j = 0; j < matriz[0].length; j++){

//         if(matriz[i][j] > 10){
//             contador++;
//         }
//     }
// }
// //encotrar el menor y mayor
// int mayor = matriz[0][0];
// int menor = matriz[0][0];

// for(int i = 0; i < matriz.length; i++){
//     for(int j = 0; j < matriz[0].length; j++){

//         if(matriz[i][j] > mayor){
//             mayor = matriz[i][j];
//         }

//         if(matriz[i][j] < menor){
//             menor = matriz[i][j];
//         }
//     }
// }
// //valiodar valores
// public static double leerDouble(Scanner sc) {

//     while (true) {
//         try {
//             double numero = Double.parseDouble(sc.nextLine());
//             return numero;
//         } catch (NumberFormatException e) {
//             System.out.println(" Error. Ingrese un numero decimal valido:");
//         }
//     }
// }

// public static String leerTexto(Scanner sc) {

//     while (true) {
//         String texto = sc.nextLine();

//         if (texto.matches("[a-zA-Z ]+")) {
//             return texto;
//         } else {
//             System.out.println(" Solo se permiten letras. Intente otra vez:");
//         }
//     }
// }

// public static int leerOpcion(Scanner sc) {

//     while (true) {
//         try {
//             int opcion = Integer.parseInt(sc.nextLine());

//             if (opcion >= 1 && opcion <= 5) {
//                 return opcion;
//             } else {
//                 System.out.println(" Opcion fuera de rango (1-5):");
//             }

//         } catch (NumberFormatException e) {
//             System.out.println(" Debe ingresar un numero:");
//         }
//     }
// }

// for (int i = 0; i < matriz.length; i++) {
//     for (int j = 0; j < matriz[0].length; j++) {

//         System.out.println("Ingrese numero en [" + i + "][" + j + "]");
//         matriz[i][j] = leerEntero(sc);

//     }
// }
// //multilicar matriz
// public static int[][] multiplicarMatrices(int[][] A, int[][] B) {

//     int filasA = A.length;
//     int columnasA = A[0].length;
//     int filasB = B.length;
//     int columnasB = B[0].length;

//     // Verificar si se puede multiplicar
//     if(columnasA != filasB) {
//         System.out.println("No se pueden multiplicar estas matrices.");
//         return null;
//     }

//     int[][] resultado = new int[filasA][columnasB];

//     for(int i = 0; i < filasA; i++) {
//         for(int j = 0; j < columnasB; j++) {

//             for(int k = 0; k < columnasA; k++) {
//                 resultado[i][j] += A[i][k] * B[k][j];
//             }

//         }
//     }

//     return resultado;
// }

// public static void imprimir(int[][] M){

//     if(M == null) return;

//     for(int i = 0; i < M.length; i++){
//         for(int j = 0; j < M[0].length; j++){
//             System.out.print(M[i][j] + " ");
//         }
//         System.out.println();
//     }
// }

// public static void main(String[] args) {

//     int[][] A = {
//         {1,2,3},
//         {4,5,6}
//     };

//     int[][] B = {
//         {7,8},
//         {9,10},
//         {11,12}
//     };

//     int[][] resultado = multiplicarMatrices(A,B);

//     System.out.println("Resultado:");
//     imprimir(resultado);
// }
// //contador 
// for(int i = 1; i <= 10; i++){
//     System.out.println(i);
// }
// //contador manual
// int contador = 0;

// for(int i = 0; i < 5; i++){
//     contador++;
// }

// System.out.println("El contador vale: " + contador);
// //contador en maticez
// int contador = 0;

// for(int i = 0; i < matriz.length; i++){
//     for(int j = 0; j < matriz[0].length; j++){

//         if(matriz[i][j] > 10){
//             contador++;
//         }
//     }
// }

// System.out.println("Cantidad mayores que 10: " + contador);
// //con whilwe
// int intentos = 0;

// while(true){
//     System.out.println("Ingrese numero positivo:");
//     int numero = leerEntero(sc);

//     intentos++;

//     if(numero > 0){
//         break;
//     } else {
//         System.out.println("Numero invalido");
//     }
// }

// System.out.println("Intentos realizados: " + intentos);
import java.util.Scanner;
import java.util.Stack;
public class mainpilas {
    public static void main(String[] args) {
        boolean seguir = true;
        pilasnuevas m = new pilasnuevas();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        int numero = 0;
        while(seguir){
            System.out.println("Bienvenido miremos un CRUD");
            System.out.println("Escoja una opcion");
            System.out.println("1. Lennar pila");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar de la existencia");
            System.out.println("5. Salir");
            int opt = m.ValidarEntero(sc);
            System.out.println(opt);
            switch (opt) {
                case 1:
                    pila = m.LlenarPila(pila);
                    break;
                case 2:
                    m.MostrarPila(pila);
                    break;
                case 3:
                    numero = m.Pedirdato(1);
                    pila = m.ModificarPila(pila, numero);
                    break;
                case 4:
                    int choise = 0;
                    numero = m.Pedirdato(4);
                    System.out
                            .println("que metodo desea implementar 1) el depilas, 2) el listas , 3) funcion anonima ");
                    choise = sc.nextInt();
                    switch (choise) {
                        case 1:
                            pila = m.EliminarPila(pila, numero);
                            break;
                        case 2:
                            pila = m.Eliminar1(pila, numero);
                            break;

                        default:
                            pila = m.Eliminar2(pila, numero);
                            break;
                    }

                    break;
                case 5:
                    System.out.println("Gracias por venir ");
                    seguir = false;
                    break;

                default:
                    System.out.println("home de 1 a 5 no joda");
                    break;
            }
        }
        
    }
    
}

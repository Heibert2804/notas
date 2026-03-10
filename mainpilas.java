import java.util.Scanner;
import java.util.Stack;
public class mainpilas {
    public static void main(String[] args) {
        boolean seguir = true;
        pilasnuevas u = new pilasnuevas();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        while(seguir){
            System.out.println("Bienvenido miremos un CRUD");
            System.out.println("Escoja una opcion");
            System.out.println("1. Lennar pila");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar de la existencia");
            System.out.println("5. Salir");
            int opt = u.ValidarEntero(sc);
            System.out.println(opt);
            switch (opt) {
                case 1:
                    pila = u.LlenarPila(pila);
                    break;
                case 2:
                    u.MostrarPila(pila);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            
                default:
                    break;
            }
        }
        
    }
    
}

import java.util.Scanner;
import java.util.Stack;
public class pilasnuevas {
    Scanner sc = new Scanner(System.in);

    public int ValidarEntero(Scanner sc){

        while(!sc.hasNextInt()){
            System.out.println("Tan bobo, ponga un valor numerico valido");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc){

        while(!sc.hasNextDouble()){
            System.out.println("Tan bobo, ponga un valor numerico valido");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public int ValidarRango(int n1, int n2, int numero){
        pilasnuevas u = new pilasnuevas(); 
        while (numero < n1 || numero > n2) {
            System.out.println("Ingrse una opcion entre: " + n1 + " y " + n2);
            numero = u.ValidarEntero(sc);
        }
        return numero;
    }

    public Stack<Integer> LlenarPila(Stack<Integer> p){
        pilasnuevas u = new pilasnuevas();
        boolean continuar = true;
        int numero = 0, opt = 0;
        while(continuar){
            System.out.println("Ingrese");
            numero = u.ValidarEntero(sc);
            p.push(numero);
            System.out.println("Desea añadir mas registros? 1 = si 2 = no");
            opt = u.ValidarEntero(sc);
            opt = u.ValidarRango(1, 2, opt);
            if(opt == 2){
                continuar = false;
            }
        }
        return p;
    }

    public void MostrarPila(Stack<Integer> p){
        System.out.println(p);
        
    }

    public int Pedirdato(int opt) {
        pilasnuevas m = new pilasnuevas();
        switch (opt) {
            case 1:
                System.out.println("Ingrese El numero a Modificar");
                opt = m.ValidarEntero(sc);
                break;
            case 2:
                System.out.println("Ingrese El nuevo numero Modificado");
                opt = m.ValidarEntero(sc);
                break;

            default:
                System.out.println("Ingrese el numero a eliminar");
                opt = m.ValidarEntero(sc);
                break;
        }
        return opt;

    }

    public Stack<Integer> ModificarPila(Stack<Integer> pila, int numero) {
        Stack<Integer> Auxp = new Stack<>();
        pilasnuevas m = new pilasnuevas();
        int n = pila.size();
        for (int i = 0; i < n; i++) {
            if (pila.peek().equals(numero)) {
                pila.pop();
                Auxp.push(m.Pedirdato(2));
            } else {
                Auxp.push(pila.pop());
            }
        }
        for (int i = 0; i < n; i++) {
            pila.push(Auxp.pop());
        }
        return pila;
    }
    
    public Stack<Integer> EliminarPila(Stack<Integer> p, int numero) {
        Stack<Integer> Auxp = new Stack<>();
        int n = p.size();
        for (int i = 0; i < n; i++) {
            if (p.peek().equals(numero)) {
                p.pop();
            } else {
                Auxp.push(p.pop());
            }
        }
        for (int i = 0; i < n; i++) {
            p.push(Auxp.pop());
        }
        return p;
    }
}

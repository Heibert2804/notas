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
    
}

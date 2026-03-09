
import java.util.Stack;
import java.util.Scanner;

public class pila{
    public static void main(String[] args) {
        boolean seguir = true;
        Stack<Integer> p = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while(seguir){
            p.push((int)(Math.random()*50+1));
            System.out.println("Desea continuar 1 = s1, 2 = no");
            if (sc.nextInt() == 2){
            seguir = false;
            }
        } 
       
        System.out .println(p); 
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //System.out.println("Introduce el número que quieres añadir a la cola");
        //int numero=input.nextInt();

        Fifo cola=new Fifo();

        cola.push(0);
        cola.push(1);
        cola.push(2);
        cola.push(7);
        cola.push(6);
        cola.push(9);

        int result=0;

        System.out.println(result=cola.pop());
        System.out.println(result=cola.pop());
        System.out.println(result=cola.pop());
        System.out.println(result=cola.pop());
        System.out.println(result=cola.pop());
        System.out.println(result=cola.pop());

        Lifo pila=new Lifo();

        pila.push(2);
        pila.push(5);
        pila.push(7);
        pila.push(8);
        pila.push(3);

        System.out.println(result=pila.pop());
        System.out.println(result=pila.pop());
        System.out.println(result=pila.pop());









    }
}

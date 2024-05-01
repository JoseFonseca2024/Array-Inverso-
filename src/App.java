import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        System.out.println("Mostrar invertido");

        Mostrar(invertido(array));

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        try {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("ingrese el valor [" + i + "]");
                arreglo[i] = leer.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
        }
       

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

    }
    

    public static int [] invertido (int [] a) {
        int [] invertido = new int [a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            invertido[j] = a[i]; // j equivale al recorrido indice que se da en el arreglo invertido
                                // esto para que mientras se ejecuta el for donde de va disminuyendo del ultimo valor al primero
                                // se vayann almacenando en j
        }
        
        return invertido;

    }

}  

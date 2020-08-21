package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Ejecutable {

    public static void main(String[] args) {

        int n, valordado1, valordado2, suma, valordados, resto, guarda;
        float porc;

        suma = guarda = 0;
        porc = 0;

        Scanner entrada = new Scanner(System.in);

        //Ingresamos por teclado la cantidad de códigos.
        do {
            System.out.println("Ingrese la cantidad total de lanzamientos de los dados");
            n = entrada.nextInt();
        } while (n < 0);

        //Declaramos vectores.
        int dado1[] = new int[n];
        int dado2[] = new int[n];

        //Carga de los datos en los dos vectores.
        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el lanzamiento del dado 1 ");
            dado1[i] = entrada.nextInt();

            System.out.println("Ingrese el lanzamiento del dado 2 ");
            dado2[i] = entrada.nextInt();
        }
        //Muestra valores lanzamiento primer dado. Y luego siguiente dado.
        System.out.println("Lista de lanzamientos dado 1  ");
        for (int i = 0; i < dado1.length; i++) {

            System.out.println(dado1[i]);
        }
        System.out.println("Lista de lanzamientos dado 2  ");
        for (int i = 0; i < dado2.length; i++) {
            System.out.println(dado2[i]);

        }

        for (int i = 0; i < dado1.length; i++) {

            for (int j = 0; j < dado2.length; j++) {

                valordado1 = dado1[i];

                valordado2 = dado2[j];

                if (dado1[i] == dado2[j]) {

                    suma = suma + 1;
                }
                valordados = valordado1 + valordado2;
                resto = valordados % 2;
                if (resto != 0) {
                    guarda = j;
                }
                porc = (suma * 100) / n;
            }
        }
        System.out.println("En el lanzamiento " + guarda + " la suma de ambos dados fue impar");
        System.out.println("La cantidad de veces que se repite el valor de los dados es de  " + suma);
        System.out.println("El porcentaje sobre el total es de  " + porc);
    }
}

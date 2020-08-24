package ejemplo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ejecutable {

    public static void main(String[] args) {

        int n, aux, sumaactas;
        float monto;
        monto = sumaactas = 0;
        aux = 0;

        Scanner entrada = new Scanner(System.in);

        //Ingresamos por teclado la cantidad de códigos.
        do {
            System.out.println("Ingrese la cantidad total de códigos");
            n = entrada.nextInt();
        } while (n < 0);

        //Declaramos vectores.
        int vec[] = new int[n];
        float vec2[] = new float[n];

        //Carga de los datos en los dos vectores.
        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el código" + (i + 1));
            vec[i] = entrada.nextInt();

            System.out.println("Ingrese el monto");
            vec2[i] = entrada.nextFloat();
        }

        for (int i = 0; i < vec2.length; i++) {

            monto = monto + vec2[i];//Acumula todos los montos.
        }
        Arrays.sort(vec);//ordenamiento de menor a mayor.

        for (int i = 0; i < vec.length; i++) {
            for (int j = i + 1; j < vec.length; j++) {

                if (vec[i] == vec[j]) {

                    aux = vec[i];

                }

            }
        }

        for (int i = 0; i < vec.length; i++) {

            if (vec[i] != 0) {

                sumaactas = sumaactas + 1;//Suma la cantidad de actas labradas.

            }

        }
        System.out.println("El monto total recaudado fue de " + monto);
        System.out.println("La cantidad de actas labradas es de " + sumaactas);
        System.out.println("El código de infracción que más se repitió fue  " + aux);

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la numero de estudiantes que deseas : ");
        int numeroEstudiantes = sc.nextInt();

        int[] edades = new int[numeroEstudiantes];

        int mayoresCinco = 0,  smMayoresCinco = 0, menoresCinco = 0, smMenoresCinco = 0, igualACinco = 0;

        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            edades[i] = sc.nextInt();

            if (edades[i] > 5) {
                mayoresCinco++;
                smMayoresCinco += edades[i];
            } else if (edades[i] < 5) {
                menoresCinco++;
                smMenoresCinco += edades[i];
            } else {
                igualACinco++;
            }
        }
        if (mayoresCinco == 0) {
            System.out.println("no se puede sacar la media de los estudiantes mayores de 5");
        }
        else {
            igualACinco = smMayoresCinco / mayoresCinco;
            System.out.println("La media de los mayores 5 es: "+mayoresCinco);
        }
        if (menoresCinco == 0) {
            System.out.println("no se puede sacar la media de los estudiantes menores de 5");
        }
        else {
            igualACinco = menoresCinco / smMenoresCinco;
            System.out.println("La media de los estudiantes menores 5 es: "+menoresCinco);
        }
        System.out.println("La cantidad de estudiantes que tiene exactamente 5 años es: "+igualACinco);
    }
}
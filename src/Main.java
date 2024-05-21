

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("ingrese la cantidad de estudiantes:");
      int cantidad_estudiantes = scanner.nextInt();
      
      String[] estudiantes =new String[cantidad_estudiantes];
        {
            int i=0;
            while (i<cantidad_estudiantes) {
                i++;
            }
        }
        int i = 0;
        System.out.println(" ingrese el nombre del estudiante:"+(i+1)+":");
      estudiantes[i] = scanner.next();

      System.out.println("los nombres de los estudiantes son:");
      for(String ignored : estudiantes){
          System.out.println(Arrays.toString(estudiantes));

      }
        }

    }
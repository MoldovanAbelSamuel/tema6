import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class tema6 {
    public static int[] numere = new int[]{1, 54, 34, 2, 98, 64, 33, 71, 25};

    public static void main(String[] args) {
        System.out.println("\nExercise 1: ");
        System.out.println(ex1(numere));
        System.out.println("\nExercises 2: ");
        System.out.println(ex2(numere));
        System.out.println("\n\nExercises 3: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number to see higher numers from the numbers row: ");
        int input = sc.nextInt();
        int[] rezultat_ex3 = ex3(numere, input);
        for(int i = 0; i < rezultat_ex3.length; i++)
            System.out.print(rezultat_ex3[i] + " ");
        System.out.println("\n\nExercises 4: ");
        int sumaNecesara = 10000;
        System.out.println(ex4(sumaNecesara));
        System.out.println("\n\nExercises 5: ");
        int sumaNecesaraTwo = 10000;
        int numarMaximDonatii = 3;
        System.out.println(ex5(sumaNecesaraTwo, numarMaximDonatii));
        System.out.println("\n\nExercises 6: ");
        String frazaOferita = "In Java, a string is an object that represents a number of character values. Each letter in the string is a separate character value that makes up the Java string object. Characters in Java are represented by the char class. Users can write an array of char values that will mean the same thing as a string.";
        System.out.println(ex6(frazaOferita));


    }

    public static int ex1(int[]a) {
        int suma = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    public static int ex2(int[]b) {
        int i;
        int j = 0;
        for (i = 0; i < b.length; i++) {
            if (b[i] % 2 == 1) {
                j += 1;
            }
        }
        return j;
    }

   public static int countNumbersGreaterThanAGivenNumber(int[] c, int d){
        int contor = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] > d)
                contor++;
        }
        return contor;
    }

    public static int[] ex3(int[] c, int d){
        int[] help_array = new int[countNumbersGreaterThanAGivenNumber(c,d)];
        int j = 0;
        for(int i = 0; i < c.length; i++)
            if(c[i] > d)
                help_array[j++] = c[i];
        return help_array;
    }

    public static String ex4(int total){
        Random rn = new Random();
        int donatii = rn.nextInt(0, 999);
        int contor = 0;
        String initial = "Your current balance from donation are: ";
        String ulterior = "Congratulation, your total donation are: ";
        int sumaStransa = 0;
        int sumaFinala = 0;
        while (contor < total){
            contor += donatii;
            sumaStransa = contor;
            System.out.println(initial + sumaStransa);
            if  (contor >= total){
                sumaFinala = contor;
            }
        }
        return ulterior+sumaFinala;

    }
    public static String ex5(int total, int numarRepetari){
        Random rn = new Random();
        int contor = 0;
        String totalStrans = "Congratulation, your total donation are: ";
        for (int i=0; i<numarRepetari; i++){
            int donatii = rn.nextInt(0, 999);
            contor += donatii;
            System.out.println("Your current balance from donation are: " + contor);
        }
        return totalStrans+contor;
    }

    public static String ex6(String fraza){
        String[] propozitii = fraza.split("\\.");
        String propozitiiSplit = "";
        for(int i=0; i< propozitii.length; i++){
            propozitiiSplit += propozitii[i] + ".\n";
        }
        return propozitiiSplit;
    }
}

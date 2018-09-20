import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number,factorial=1;
          Scanner input = new Scanner(System.in);
          System.out.println("Inserisci un numero : ");
          number= input.nextInt();
          for(int i=2;i<=number;i++) {
              factorial = factorial * i;
          }
        System.out.println("Il fattoriale di "+number+" é: "+factorial);
    }
}

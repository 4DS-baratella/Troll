import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = 0;
        boolean checkScelta = false;

        Troll troll = null;
        try{
            troll = new Troll(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        while(troll.ancoraVivo()){
            do{
                System.out.println("\nInserire l'attacco che si vuole eseguire: " +
                        "\n1. Attacco normale;" +
                        "\n2. Attacco pesante;");
                try{
                    input = new Scanner(System.in);
                    scelta = input.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("\nLa scelta deve essere un numero intero.");
                }
            }while (checkScelta);

        }
    }
}
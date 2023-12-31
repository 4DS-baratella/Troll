import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = 0;
        boolean checkScelta;

        Troll troll = null;
        try{
            troll = new Troll(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        while(troll.ancoraVivo()){
            do{
                checkScelta = false;
                System.out.println("\nInserire l'attacco che si vuole eseguire: " +
                        "\n1. Attacco normale;" +
                        "\n2. Attacco pesante;");
                try{
                    input = new Scanner(System.in);
                    scelta = input.nextInt();
                    checkScelta = true;
                }catch (InputMismatchException e){
                    System.out.println("\nLa scelta deve essere un numero intero.");
                }
            }while (!checkScelta || scelta < 1 || scelta > 2);

            switch (scelta) {
                case 1:
                    troll.attaccoSubito(10);
                    System.out.println("\nLa vita rimasta del troll è: " + troll.getVita());
                    break;
                case 2:
                    troll.attaccoSubito(25);
                    System.out.println("\nLa vita rimasta del troll è: " + troll.getVita());
                    break;
            }
        }

        System.out.println("\nComplimenti! Hai sconfitto il troll!");
    }
}
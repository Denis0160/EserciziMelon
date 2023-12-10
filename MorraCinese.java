import java.util.Scanner;

public class MorraCinese {
    public static void main(String[] args) {
        System.out.println("Benvenuti nel gioco!");
        System.out.println("REGOLE: ");
        System.out.println("la carta vince sul sasso\n" +
                "il sasso vince sulle forbici\n" +
                "le forbici vincono sulla carta");
        System.out.println("Il giocatore 1 utilizza questi comandi: A = carta\n" +
                "S = sasso\n" +
                "D = forbici,");
        System.out.println("Il giocatore 2 utilizza questi comandi: J = carta\n" +
                "K = sasso\n" +
                "L = forbici.");
        System.out.println("Premi S per iniziare!");

        Scanner tastiera=new Scanner(System.in);

        char start='s';
         start = tastiera.next().charAt(0);

        if (start == 'S' || start == 's') {
            ClrScr();

        }



       /* String cartaA="", cartaJ="";
        String sassoS="", sassoK="";
        String forbiciD="", forbiciL="";*/
        String comando1="",comando2="";

       do {
           System.out.println("Inizia il giocatore 1");

           comando1 = tastiera.nextLine();
           ClrScr();
           tastiera.nextLine();
           System.out.println("tocca al giocatore 2");
           comando2 = tastiera.nextLine();
           ClrScr();
       }while(!(comando1.equals("A") || comando1.equals("a") || comando1.equals("s") || comando1.equals("s") ||
       comando1.equals("d") || comando1.equals("D") || comando2.equals("j") || comando2.equals("J")
       || comando2.equals("k") || comando2.equals("K")|| comando2.equals("l") || comando2.equals("L")));

        if (comando1.equalsIgnoreCase("a") && comando2.equalsIgnoreCase("j")) {
            System.out.println("Pareggio");
        } else if (comando1.equalsIgnoreCase("a") && comando2.equalsIgnoreCase("k")) {
            System.out.println("Giocatore 2 ha perso");
        } else if (comando1.equalsIgnoreCase("a") && comando2.equalsIgnoreCase("l")) {
            System.out.println("Giocatore 1 ha perso");
        } else if (comando1.equalsIgnoreCase("s") && comando2.equalsIgnoreCase("k")) {
            System.out.println("Pareggio");
        } else if (comando1.equalsIgnoreCase("s") && comando2.equalsIgnoreCase("l")) {
            System.out.println("Ha vinto il giocatore 1");
        } else if (comando1.equalsIgnoreCase("s") && comando2.equalsIgnoreCase("j")) {
            System.out.println("Ha vinto il giocatore 2");
        } else if (comando1.equalsIgnoreCase("d") && comando2.equalsIgnoreCase("l")) {
            System.out.println("Pareggio");
        } else if (comando1.equalsIgnoreCase("d") && comando2.equalsIgnoreCase("j")) {
            System.out.println("Ha vinto il giocatore 1");
        } else if (comando1.equalsIgnoreCase("d") && comando2.equalsIgnoreCase("k")) {
            System.out.println("Ha vinto il giocatore 2");
        } else if (comando2.equalsIgnoreCase("j") && comando1.equalsIgnoreCase("s")) {
            System.out.println("Ha vinto il giocatore 2");
        }


    }

    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

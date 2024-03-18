import java.util.Scanner;
import Tools.Tools;

public class Main {
    public static void main(String[] Args){
        Scanner scanner= new Scanner(System.in);
        int scelta=0;
        int numero = 0;
        boolean continua = true;
        Boolean dataValida;
        boolean bisestile;
        boolean dataNonValida = false;

        String [] opzioni = {"=== Gestione Data === ", "[1]-leggi data "
                , "[2]Controllo data",
                "[3] Visualizza ggmmaaaa ",
        "[4] Visualizza gg<mese>aaaa","[5] errore",
        "[6] quit"};

        switch(Tools.Menu(opzioni,scanner)){
            case 1: {
                System.out.println("Inserisci un numero intero nel formato ggmmaaaa per determinare la data: ");
                //Check for non valid user input
                try {
                    //insertion of the date
                    numero = scanner.nextInt();
                    int[] dataSeparata = separazioneData(numero);
                    if (!dataOk(dataSeparata[0], dataSeparata[1], dataSeparata[2])) {
                        dataValida = true;
                        System.out.println("DATA ERRATA");
                    } else {
                        System.out.println("DATA CORRETTA");
                    }
                } catch (Exception x) {
                    System.out.println("DATA ERRATA");
                    dataValida = true;
                    scanner.nextLine();
                }
            }
            case 2: {

            }

        }

        }


    private static boolean dataOk(int giorno, int mese, int anno) {
        boolean valida = false;
        /*switch (mese) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                valida = (giorno > 0 && giorno < 32);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                valida = (giorno > 0 && giorno < 31);
                break;
            case 2:
                if (Bisestile(anno) && giorno > 0 && giorno < 30) {
                    valida = true;
                } else if (giorno > 0 && giorno < 29) {
                    valida = true;
                }
                break;
        }
         */
        /*if (mese==2) {
            if(Bisestile(anno) && giorno > 0 && giorno < 30) {
                valida = true;
            } else if (giorno > 0 && giorno < 29) {
                valida = true;
            }
        }else*/ {


            valida = switch (mese) {
                case 1, 3, 5, 7, 8, 10, 12 -> (giorno > 0 && giorno < 32);
                case 4, 6, 9, 11 -> (giorno > 0 && giorno < 31);
                case 2-> (Bisestile(anno) && giorno > 0 && giorno < 30) || (giorno > 0 && giorno < 29);
                default -> false;
            };
        }
        return valida;
    }
    private static boolean validadata(int numero){
        return (numero>31129999 || numero<01010001);
    }
    private static boolean Bisestile(int anno) {
        return ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0);
    }
    private static String dataToString3(int[] data) {
        Integer boxing = data[0];
        String output = boxing.toString() + "/";

        boxing = data[1];
        output += boxing.toString() + "/";

        boxing = data[2];
        output += boxing.toString();

        return output;
    }
    private static int[] separazioneData(int data) {
        //Contiene il valore d'uscita
        int[] output = new int[3];

        //Anno
        output[2] = data % 10000;
        //Rimuovere l'anno dalla data
        data /= 10000;
        //Mese
        output[1] = data % 100;
        //Rimuovere il mese dalla data
        data /= 100;
        //Giorno
        output[0] = data;

        //Ritornare i valori separati
        return output;
    }


}

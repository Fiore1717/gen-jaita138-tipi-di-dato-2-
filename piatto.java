import java.util.Scanner;
public class piatto {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.println("inseire il nome del piatto");
    String nomePiatto = sc.nextLine();
    System.out.println("inserire la descrizione del piatto");
    String descrizione = sc.nextLine();
    System.out.println("inserire prezzo");
    Double prezzo = sc.nextDouble();
    sc.nextLine();
    System.out.println("inserire disponibilità (true/false)");
    boolean disponibilita = sc.nextBoolean();
    System.out.println("inserire tipologia \n 1) carne \n 2) pesce");
    byte tipologia = sc.nextByte();
    sc.nextLine();
    System.out.println("inserire allergeni");
    String allergeni = sc.nextLine();
    System.out.println("inserire foto");
    String foto= sc.nextLine();
    System.out.println("inserire calorie");
    String calorie = sc.nextShort();
    System.out.println("inserire variazioni");
    String variazioni = sc.nextLine();

    System.out.println(nomePiatto + " " +  descrizione + " " +  prezzo +" "+ disponibilita +" " + tipologia + " " + allergeni + "" + foto + "" + calorie + "" + variazioni);


    

    sc.close();
    }
}

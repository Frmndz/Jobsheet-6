import java.util.Scanner;

public class Suhu13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suhu;
        String hujan;

        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan suhu dalam celcius : ");
        suhu = sc.nextInt();
        if(suhu > 27 ) {
            System.out.println("Silahkan memakai memakai dress");
        } else { 
            System.out.println("Silahkan memakai celana panjang");
        }
        System.out.println("Apakah cuaca hujan ? y/t");
        hujan = sc.next();
        if(hujan.equalsIgnoreCase("y")){
            System.out.println("Silahkan membawa payung.");
        } else {
            System.out.println("Silahkan memakai sunscreen");
        }

    }
}    
import java.util.Scanner;

public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan sudut 1 : ");
        float sudut1 = input13.nextFloat();
        System.out.println("Masukkan sudut 2 : ");
        float sudut2 = input13.nextFloat();
        System.out.println("Masukkan sudut 3 : ");
        float sudut3 = input13.nextFloat();
        
        float totalSudut = sudut1 + sudut2 + sudut3;

        System.out.println("Total sudut =" +totalSudut);

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 9))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else 
        System.out.println("Bukan segitiga");
    }
}
import java.util.Scanner;

public class Pemilihan2Percobaan213_1 {
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
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 9)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku.");
            } else if ((sudut1 == 60 ) || (sudut2 == 60 ) || (sudut3 == 60 )){
                System.out.println("Segitiga tersebut adalah segitiga sama sisi.");
            } else if ((sudut1 == 70 ) || (sudut2 == 70 ) || (sudut3 == 40 )){
                System.out.println("Segitiga tersebut adalah segitiga sama kaki.");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
            
        } else 
        System.out.println("Bukan segitiga.");
    }
}
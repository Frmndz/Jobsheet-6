import  java.util.Scanner;

public class Pemilihan2Percobaan313 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0.0;

        System.out.println("Masukkan kategori : ");
        kategori = input13.nextLine();
        System.out.println("Masukkan penghasilan : ");
        penghasilan = input13.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if(penghasilan <= 0){
                System.out.println("Penghasilan yang anda masukkan tidak valid");   
        }   else if(penghasilan <= 20000000){
            pajak = 0.1;
        }   else if(penghasilan <= 30000000){
            pajak = 0.15;
        }   else
            pajak = 0.2;
            
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        
        } else if (kategori.equalsIgnoreCase("pebisnis")){
            if(penghasilan <= 25000000)
            pajak = 0.15;
            else if (penghasilan <= 35000000)
            pajak = 0.2;
            else
            pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih); 
        } else
        System.out.println("Input Kategori Salah");
}
}

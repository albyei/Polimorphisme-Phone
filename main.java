package phone;    
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);

        // kita coba nyalakan HP-nya
        dian.turnOnThePhone();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        int aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();
            
            if(aksi==1){
                dian.turnOffThePhone();
            } else if (aksi==2){
                dian.makePhoneLouder();
            } else if (aksi==3){
                dian.makePhoneSilent();
            } else if (aksi==4){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}
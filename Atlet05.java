import java.util.Scanner;

public class Atlet05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();  

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("\nMasukkan nama Politeknik ke-" + i + ": ");
            String namaPoliteknik = sc.nextLine();

            for (int j = 1; j <= 4; j++) {
                String cabangOlahraga = "";
                if (j == 1) {
                    cabangOlahraga = "Badminton";
                } else if (j == 2) {
                    cabangOlahraga = "Tenis Meja";
                } else if (j == 3) {
                    cabangOlahraga = "Basket";
                } else if (j == 4) {
                    cabangOlahraga = "Bola Voly";
                }

                System.out.println("Masukkan 5 atlet untuk cabang olahraga " + cabangOlahraga + " di " + namaPoliteknik + ":");

                for (int k = 1; k <= 5; k++) {
                    System.out.print("  Atlet " + k + ": ");
                    String namaAtlet = sc.nextLine();
                }
            }
        }
        System.out.println("\n--- Data Atlet Porseni 2024 telah disimpan ---");
    }
}

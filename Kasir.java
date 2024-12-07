import java.util.Scanner;

public class Kasir {

    // Method notifikasi
    static void notifikasi(){
        System.out.println("\nThanks...");
    }

    // Method hitung biaya
    static int HitungBiaya(int h, int j){
        return h * j;
    }

    // Method tampilkan daftar barang dan mengurutkan barang
    static void urutkan(String data[]){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++){
                if(data[j].compareTo(data[j+1]) > 0){
                    String temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("\nDaftar barang");
        for (int i = 0; i < data.length; i++){
            System.out.println((i + 1) + ". " + data[i] + " ");
        }
    }

    // Urutkan nama barang
    static void urutkan(String barang[], int data[]){
        for (int i = 0; i < barang.length; i++) {
            for (int j = 0; j < barang.length - 1; j++){
                if(barang[j].compareTo(barang[j+1]) > 0){
                    String temp = barang[j];
                    barang[j] = barang[j+1];
                    barang[j+1] = temp;
                }

                // Urutkan harga barang
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
            }
        }
        System.out.println("\nDaftar barang");
        for (int i = 0; i < data.length; i++){
            System.out.println((i + 1) + ". " + barang[i] + " " + data[i]);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Inisialisasi
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        String brg [] = {"Tas","Sepatu", "Jaket", "Topi", "Sandal"};
        String plg[] = {"Fufufafa", "Ganesha", "David", "Agus", "Putu"};
        int hrg [] = {200000, 150000, 250000, 15000, 50000};

        do{
            System.out.println("\nAplikasi Kasir");
            System.out.println("1. Hitung Biaya");
            System.out.println("2. Urutkan Nama Barang");
            System.out.println("3. Urutkan Nama Pelanggan");
            System.out.println("4. Urutkan Harga Barang");
            System.out.println("5. Exit");
            System.out.print("Pilihan : "); pilih = sc.nextInt();

            switch (pilih){
                case 1:
                    int harga, jumlah;
                    System.out.print("\nHarga : "); harga = sc.nextInt();
                    System.out.print("Jumlah : "); jumlah = sc.nextInt();
                    int biaya = HitungBiaya(harga, jumlah);
                    System.out.println("Biaya : " + biaya);
                    break;

                case 2 :
                    System.out.println("\nUrutkan nama barang");
                    urutkan(brg);
                    break;

                case 3 :
                    System.out.println("\nUrutkan nama pelanggan");
                    urutkan(plg);
                    break;

                case 4 :
                    System.out.println("\nUrutkan harga barang");
                    urutkan(brg, hrg);
                    break;

                case 5 :
                    notifikasi();
                    break;

                default :
                    break;
            }
        }while (pilih != 5);
    }
}

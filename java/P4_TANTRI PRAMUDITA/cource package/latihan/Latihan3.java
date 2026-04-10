import java.util.Scanner;

public class Latihan3 {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total, diskon;
        float b_total;

        System.out.print("makan: ");
        makan = input.nextFloat();
        System.out.print("transport: ");
        transport = input.nextFloat();
        System.out.print("belanja: ");
        belanja = input.nextFloat();

        //total
        total = makan+transport+belanja;

        //diskon
        diskon = total * 10 / 100;

        //pembayaran setelah diskon
        b_total = total-diskon;

        System.out.println("pengeluaran sebelum diskon: "+ total);
        System.out.println("Diskon yang di dapatkan: "+diskon );
        System.out.println("pembayaran setelah diskon: "+ b_total);

    }
}
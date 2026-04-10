import java.util.Scanner;

public class Latihan2 {
    public static void main (String arg[]){
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float b_makan, b_transport, b_belanja;

        System.out.print("Makan :");
        makan = input.nextFloat();
        System.out.print("Transport : ");
        transport = input.nextFloat();
        System.out.print("Belanja : ");
        belanja = input.nextFloat();

        total = makan+transport+belanja;

        b_makan = (makan/total) *100;
        b_transport = (transport/total) *100;
        b_belanja = (belanja/total)*100;
        
        System.out.print("Total Belanja : " + total);
        System.out.print("Makan: "+ b_makan + "%");
        System.out.print("Transport: "+ b_transport + "%");
        System.out.print("Belanja: "+ b_belanja + "%");
    }
}

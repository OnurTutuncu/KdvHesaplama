import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {

        double fiyat, kdvOran=0.18 , kdvTutar , kdvliFiyat;


        Scanner input = new Scanner(System.in);
        System.out.print("Ekrana Fiyat Giriniz:");
        fiyat = input.nextInt();
        
        if (fiyat >= 1000){
            kdvOran=0.08;
        }

kdvTutar = fiyat * kdvOran;
kdvliFiyat= fiyat + kdvTutar;


        System.out.println("KDV'siz Fiyat:" + fiyat );
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("KDV Oranı:" + kdvOran );
        System.out.println("KDV'li Fiyat:" + kdvliFiyat);
    }
}

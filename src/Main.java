import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran,kdvliTutar,kdvTutar;
        Scanner input= new Scanner(System.in);


        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.


        System.out.println("Girilecek tutarı yazınız: ");
        tutar=input.nextDouble();

        if (tutar<=1000){
            kdvliTutar=(tutar*(0.18))+tutar;
            kdvTutar=(tutar*(0.18));

            System.out.println("KDV'siz fiyatı : " + tutar+"dır");
            System.out.println("KDV'li fiyatı : " + kdvliTutar+"dır");
            System.out.println("KDV tutarı : " + kdvTutar+"dır");

        }
        else{
            kdvliTutar=(tutar*(0.08))+tutar;
            kdvTutar=(tutar*(0.08));

            System.out.println("KDV'siz fiyatı : " + tutar+"dır");
            System.out.println("KDV'li fiyatı : " + kdvliTutar+"dır");
            System.out.println("KDV tutarı : " + kdvTutar+"dır");
        }
    }
}

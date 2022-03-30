import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("sıcaklık giriniz:");
        heat = input.nextInt();
        System.out.println("Sıcaklık:"+heat);

        if (heat<5) {
            System.out.println("kayak yapabilirsiniz");
        } else if ( heat>=5 && heat<=10) {
            System.out.println("soğuk ! Sinamaya gitmelisiniz.");
        } else if (heat > 10 && heat< 15){
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz. ");
        } else if (heat>= 15 && heat<=25) {
            System.out.println("sahilde kahvaltı için mükemmel bir hava :)");
        } else {
            System.out.println("yüzme için harika bir hava.");
        }
    }
}

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	double a,b;
    Scanner input = new Scanner(System.in);
        System.out.println(" kısa kenarı giriniz:");
        a= input.nextDouble();
        System.out.println("uzun kenarı giriniz:");
        b= input.nextDouble();
        double c =  Math.sqrt((a*a)+(b*b));
        System.out.println(c);
    }
}

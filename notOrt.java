package deneme;
import java.util.Scanner;
public class notOrt {
	public static void main(String[] args) {
		int matNot,fizNot,kimNot,turkNot,tarNot,muzNot;
		Scanner in= new Scanner(System.in);
		System.out.println("Matematik notunu giriniz");
		matNot=in.nextInt();
		System.out.println("Fizik notunu giriniz");
		fizNot= in.nextInt();
		System.out.println("Kimya notunu giriniz");
		kimNot=in.nextInt();
		System.out.println("T�rk�e notunu giriniz");
		turkNot=in.nextInt();
		System.out.println("Tarih notunu giriniz");
		tarNot=in.nextInt();
		System.out.println("M�zik notunu giriniz");
		muzNot=in.nextInt();
		double ortalama= (matNot+fizNot+kimNot+turkNot+tarNot+muzNot)/6;
		 
		System.out.println(ortalama > 60.0 ? "S�n�f� ge�ti": "S�n�fta kald�");
		
	}
	
}
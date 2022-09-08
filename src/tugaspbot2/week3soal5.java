package tugaspbot2;
/**
 * @author Afif Lutfianto
 */
import java.util.Scanner;

public class week3soal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
		
		String[] Plat = input.split(" ");
		String nilai = "";
		
		for(int i=0; i<Plat.length; i++) {
			nilai += Plat[i];
		}

		System.out.println(nilai);
		Long respon = Long.valueOf(nilai);
		
		if(((respon-999999)%5) != 0) {
			System.out.println("Berhenti");
		}
		else {
			System.out.println("Jalan");
		}
	}

}

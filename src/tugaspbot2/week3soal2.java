package tugaspbot2;
/**
 * @author Afif Lutfianto
 */
import java.util.Scanner;

public class week3soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String [][] Obj = new String[3][];
		for (int i=0; i<3; i++) {
			String input = myObj.nextLine();
			Obj[i] = input.split(" ");
		}
		
		for(String[] hitung:Obj) {
			if((hitung[0].length() <= 10) && (Integer.parseInt(hitung[1]) >=0 && Integer.parseInt(hitung[1])<=999)) {
				System.out.printf("%-15s", hitung[0]);
				System.out.printf("%30d\n",Integer.parseInt(hitung[1]));
			}
		}
	}

}

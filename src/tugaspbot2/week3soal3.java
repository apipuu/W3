package tugaspbot2;
/**
 * @author Afif Lutfianto
 */
import java.util.Scanner;

public class week3soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
		String[] operator = input.split(" ");
		int A = Integer.parseInt(operator[0]);
		int B = Integer.parseInt(operator[2]);
		int hasil=0;
				
		
//		int nilaiA = (A >= 1 && A <= 1000);
//		int nilaiB = (B >= 1 && B <= 1000);
		
		if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
			if (operator[1].equals("+")) {
				hasil = A+B;
				
			}else if (operator[1].equals("*")) {
				hasil = A*B;
				
			}else if (operator[1].equals("-")) {
				hasil = A - B;
				
			}else if (operator[1].equals("/")) {
				if(A % B != 0) {
					System.out.println("error");
				}else {
					hasil = A/B;
				}
			}else if (operator[1].equals("%")) {
				hasil = A%B;
				
			}
		} else {
			System.out.println("Gunakan * / + - % ");
		}
		System.out.println(hasil);
	}

}

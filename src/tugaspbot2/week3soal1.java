package tugaspbot2;
/**
 * @author Afif Lutfianto
 */
import java.util.Scanner;

public class week3soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.print("Masukan text   : ");
		String nama = myObj.nextLine();
		String[] arrOfStr = nama.split("[\\s,!?._'@]");
		int pjg = arrOfStr.length;
		System.out.println(pjg);
		for (String a : arrOfStr)
            System.out.println(a);
	}

}

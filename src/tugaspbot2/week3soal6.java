package tugaspbot2;
/**
 * @author Afif Lutfianto
 */
import java.util.Scanner;

import java.math.BigInteger;

public class week3soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		BigInteger pertama= new BigInteger(myObj.next());
		BigInteger kedua= new BigInteger(myObj.next());
		System.out.println(pertama.add(kedua));
		System.out.println(pertama.multiply(kedua));
	}

}

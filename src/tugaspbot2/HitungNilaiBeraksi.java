package tugaspbot2;

import java.util.Scanner;

public class HitungNilaiBeraksi {

	public static void main(String[] args) {
		float nilai;
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Masukan Nama Siswa   : ");
		String nama = myObj.nextLine();
		System.out.print("Masukan NIM Siswa    : ");
		int nim = myObj.nextInt();
		System.out.print("Masukan Nilai Tugas  : ");
		float nilaiT= myObj.nextFloat();
		System.out.print("Masukan Nilai UTS    : ");
		float nilaiUTS= myObj.nextFloat();
		System.out.print("Masukan Nilai UAS    : ");
		float nilaiUAS= myObj.nextFloat();
		
		
		nilai = (((nilaiT)*20/100) + ((nilaiUTS)*35/100) + ((nilaiUAS)*45/100));
		System.out.println("");
		System.out.println("=================================================");
		System.out.println("");
		System.out.println("Nama            :"+nama);
		System.out.println("NIM             :"+nim);
		System.out.println("Nilai Tugas     :"+nilaiT);
		System.out.println("Nilai UTS       :"+nilaiUTS);
		System.out.println("Nilai UAS       :"+nilaiUAS);
		System.out.println("Nilai rata-rata : "+nilai);
		
		if (nilai >= 85) {
			System.out.println("Grade Nilai     : A");
		}else if (nilai >= 75 && nilai < 85) {
			System.out.println("Grade Nilai     : B");
		}else if (nilai >= 65 && nilai < 75) {
			System.out.println("Grade Nilai     : C");
		}else if (nilai >= 50 && nilai < 65) {
			System.out.println("Grade Nilai     : D");
		}else {
			System.out.println("Grade Nilai     : E");
		}
	}

}

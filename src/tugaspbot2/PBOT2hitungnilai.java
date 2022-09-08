package tugaspbot2;

public class PBOT2hitungnilai {
		String nama;
		int nim;
		float nilai;
		
		void setNilai(float nilaiT, float nilaiUTS, float nilaiUAS) {
			System.out.println("Nama            :"+nama);
			System.out.println("NIM             :"+nim);
			System.out.println("Nilai Tugas     :"+nilaiT);
			System.out.println("Nilai UTS       :"+nilaiUTS);
			System.out.println("Nilai UAS       :"+nilaiUAS);
			
			nilai = (((nilaiT)*20/100) + ((nilaiUTS)*35/100) + ((nilaiUAS)*45/100));
		}
		
		float getNilai() {
			return nilai;
		}

	

}

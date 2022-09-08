package tugaspbot2;
/**
 * @author Afif Lutfianto
 */
import java.util.Scanner;

public class week3soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int jumlah_penjualan = myObj.nextInt();
		int harga_barang= 50000;
		int gaji = 500000;
		double bonus_barang = (jumlah_penjualan >= 15)?0.1 * harga_barang*jumlah_penjualan:0;
		double bonus_penjualan = (jumlah_penjualan > 80)?0.35*(jumlah_penjualan * harga_barang):
		(jumlah_penjualan>=40)?0.25*(jumlah_penjualan*harga_barang):0;
		double potongan = (jumlah_penjualan < 15)?0.15 * (harga_barang * (15-jumlah_penjualan)):0;
		int gaji_total = (int)(gaji + bonus_penjualan + bonus_barang - potongan);
		System.out.println(gaji_total);
	}

}

package perhitungan_lingkaran_oop;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan38 {

    public static void main(String[] args) {
	    double diameter, jarijari, luas, keliling;
        System.out.println ("=====Perhitungan Lingkaran=====");
        RumusLingkaran hitung_lingkaran = new RumusLingkaran();

        diameter = hitung_lingkaran.getDiameter();
        jarijari = hitung_lingkaran.getJarijari();
        luas = hitung_lingkaran.getLuas();
        keliling = hitung_lingkaran.getKeliling();
        hitung_lingkaran.hasilHitung();
    }
}

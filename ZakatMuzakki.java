public class ZakatMuzakki {
    public static void main(String[] args) {
        long totalPenghasilan = 3000000;
        long totalPengeluaran = 500000; // Pengeluaran kecil
        long hargaEmas = 2500000;

        long surplus = totalPenghasilan - totalPengeluaran;
        long nisab = (long) (hargaEmas * 0.025);

        String kategori;
        long zakat = 0;

        if (surplus >= nisab) {
            kategori = "MUZAKKI (KAYA)";
            zakat = (long) (surplus * 0.025);
        } else {
            kategori = "MUSTAHIK (MISKIN)";
            zakat = 0;
        }

        System.out.println("Total Penghasilan : " + totalPenghasilan);
        System.out.println("Total Pengeluaran : " + totalPengeluaran);
        System.out.println("Surplus           : " + surplus);
        System.out.println("Nisab             : " + nisab);
        System.out.println("Kategori          : " + kategori);
        System.out.println("Zakat             : " + zakat);
    }
}
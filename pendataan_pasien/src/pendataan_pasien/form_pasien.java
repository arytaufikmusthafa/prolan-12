package pendataan_pasien;


public class form_pasien implements Pendataanps {

    @Override
    public void id_pasien() {
        System.out.print("Masukkan id pasien = ");
       
    }

    @Override
    public void nama_pasien() {
        System.out.print("Masukkan nama pasien = "); }

    @Override
    public void nodrt_pasien() {
        System.out.print("Masukkan nomor darurat pasien = "); }

    @Override
    public void keluhan_pasien() {
        System.out.print("Masukkan keluhan pasien = ");}

    @Override
    public void pemeriksa_pasien() {
        System.out.print("Masukkan nama pemeriksa pasien = ");}

    @Override
    public void penanganan_pasien() {
        System.out.print("Masukkan penanganan yang di lakukan pasien = ");}

    @Override
    public void label_pasien() {
        System.out.print("Masukkan label pasien = ");}
    
}

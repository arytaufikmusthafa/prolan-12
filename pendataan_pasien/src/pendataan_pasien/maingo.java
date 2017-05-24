
package pendataan_pasien;

import java.util.Scanner;

public class maingo{
     Scanner input = new Scanner(System.in);
    double id,nod;
    char nama,keluhan,pemeriksa,penanganan;
    char label;
    
    
     public static void main(String[] args) {
            maingo pasien = new maingo();
            pasien.tampil();
    }

    private void tampil() {
         System.out.print("Masukkan id pasien = ");
         id = input.nextDouble();
         
         System.out.print("Masukkan no darurat pasien = ");
         nod = input.nextDouble();
         
         System.out.print("Masukkan nama pasien = ");
         nama = (char) input.nextDouble();
                         
         System.out.print("Masukkan keluhan pasien = ");
         keluhan = (char) input.nextDouble();
         
         System.out.print("Masukkan nama pemeriksa pasien = ");
         pemeriksa = (char) input.nextDouble();
         
         System.out.print("Masukkan penanganan pasien = ");
         penanganan = (char) input.nextDouble();
         
         System.out.print("Masukkan label pasien = ");
         label = (char) input.nextDouble();
         
         
    }

   
}

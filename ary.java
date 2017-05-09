
import static java.time.Clock.system;
import mahasiswa.Mahasiswa;

public abstract class ary extends Mahasiswa {

   
    @Override
    public void kuliah (){
    System.out.println("hadir pada saat perkuliaham");
    }
    @Override
    public void lulus (){
    System.out.println("nilai cukup");
    }
    @Override
    public void tidaklulus (){
    System.out.println("nilai kurang");
    }
    
}



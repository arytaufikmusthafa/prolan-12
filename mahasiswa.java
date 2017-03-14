
package latihankelas;


public class mahasiswa{
 public String Nama, Alamat, Email;
    private int Nim;
    
    public void ubahdata(String nama,String alamat,String email)
    {
        this.Nama = nama;
        this.Alamat = alamat;
        this.Email = email;
    }
    
    public void ubahnim(int nim) 
    {
        this.Nim = nim;
    }
    
    public String tampilNama()
    {
        return Nama;
    }
     public String tampilAlamat()
    {
        return Alamat;
    }
     public String tampilEmail()
    {
        return Email;
    }
    public int tampilNim()
    {
        return Nim;
    } 
}

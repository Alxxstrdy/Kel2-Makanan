/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makanan;

/**
 *
 * @author user
 */
public class bubur {
    
    String rasa,bumbu,tekstur,toping,warna;
   

    
    public bubur(String jenis,String toping, String bumbu,String tekstur,String warna) {
        this.rasa = rasa;
        this.toping = toping;
        this.bumbu = bumbu;
        this.tekstur = tekstur;
        this.warna =warna ;
        
    }

    public String getrasa() {
        return rasa; // gurih dan manis
    }

    public void setrasa(String jenis) {
        this.rasa = rasa; 
    }

    public String gettoping() {
        return toping;// kerupuk ,bawang dan ayam
    }

    public void settoping(String porsi) {
        this.toping = toping;
    }

    public String getBumbu() {
        return bumbu; // bears
    }

    public void setBumbu(String bumbu) {
        this.bumbu = bumbu;
    }
    
     public String gettekstur() {
        return tekstur; // lembek
    }

    public void settekstur(String jenis) {
        this.tekstur = tekstur; 
        
    }
    
     public String getwarna() {
        return warna; // putih
    }

    public void setwarna(String jenis) {
        this.warna = warna;        
        
    }
}
    


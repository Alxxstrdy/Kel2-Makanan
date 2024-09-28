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

    public void setrasa(String rasa) {
        this.rasa = rasa; 
    }        
    
    public String getrasa() {
        return rasa; // gurih dan manis
    }

    public void settoping(String toping) {
        this.toping = toping;
    }

    public String gettoping() {
        return toping;// kerupuk ,bawang dan ayam
    }

    public void setBumbu(String bumbu) {
        this.bumbu = bumbu;
    }

    public String getBumbu() {
        return bumbu; // bears
    }

    public void settekstur(String tekstur) {
        this.tekstur = tekstur; 
        
    }
    
     public String gettekstur() {
        return tekstur; // lembek
    }

    public void setwarna(String warna) {
        this.warna = warna;        
        
    }
    
     public String getwarna() {
        return warna; // putih
    }

    
}
    


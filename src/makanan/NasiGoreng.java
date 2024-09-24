package makanan;

public class NasiGoreng {
    private String jenis, bumbu, rasa, tekstur, warna, topping;
    private int porsi;

    public NasiGoreng(String jenis, int porsi, String bumbu, String rasa, String tekstur, String warna, String topping) {
        this.jenis = jenis;
        this.porsi = porsi;
        this.bumbu = bumbu;
        this.rasa = rasa;
        this.tekstur = tekstur;
        this.warna = warna;
        this.topping = topping;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getPorsi() {
        return porsi;
    }

    public void setPorsi(int porsi) {
        this.porsi = porsi;
    }

    public String getBumbu() {
        return bumbu;
    }

    public void setBumbu(String bumbu) {
        this.bumbu = bumbu;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getTekstur() {
        return tekstur;
    }

    public void setTekstur(String tekstur) {
        this.tekstur = tekstur;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void tampilkan() {
        System.out.println("=== Menu Nasi Goreng ===");
        System.out.println("Jenis: " + jenis);
        System.out.println("Porsi: " + porsi);
        System.out.println("Bumbu: " + bumbu);
        System.out.println("Rasa: " + rasa);
        System.out.println("Tekstur: " + tekstur);
        System.out.println("Warna: " + warna);
        System.out.println("Topping: " + topping);
        System.out.println("=============================");
    }
}

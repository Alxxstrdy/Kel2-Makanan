package makanan;

public class Makanan_main {
    public static void main(String[] args) {
        
        MieAyamm mie = new MieAyamm();
        mie.setRasa("Gurih");
        mie.setBumbu("Minyak Bawang");
        mie.setTekstur("Berkuah");
        mie.setWarna("Kuning Bening");
        mie.setTopping("Pangsit");
        mie.setBentuk("Panjang");
        
        System.out.println("MIE AYAM");
        System.out.println("RASA\t :" + mie.getRasa());
        System.out.println("BUMBU\t :" + mie.getBumbu());
        System.out.println("TEKSTUR\t :" + mie.getTekstur());
        System.out.println("WARNA\t :" + mie.getWarna());
        System.out.println("TOPPING\t :" + mie.getTopping());
        System.out.println("BENTUK\t :" + mie.getBentuk() );
        
        Bakso bakso = new Bakso();
        bakso.setRasa("Gurih");
        bakso.setBumbu("Merica, Pala");
        bakso.setTekstur("Berkuah");
        bakso.SetWarna("Bening");
        bakso.SetTopping("Daun Bawang, Bawang Goreng");
        
        System.out.println("BAKSO");
        System.out.println("RASA\t :" + bakso.getRasa());
        System.out.println("BUMBU\t :" + bakso.getBumbu());
        System.out.println("TEKSTUR\t :" + bakso.getTekstur());
        System.out.println("WARNA\t :" + bakso.getWarna());
        System.out.println("TOPPING\t :" + bakso.getTopping());
        
        NasiGoreng nasgor = new NasiGoreng();
        nasgor.setRasa("Asin, Pedas");
        nasgor.setBumbu("Bawang");
        nasgor.setTekstur("Kering");
        nasgor.setWarna("Kecoklatan");
        nasgor.setTopping("Sosis");
        
        System.out.println("NASI GORENG");
        System.out.println("RASA\t :" + nasgor.getRasa());
        System.out.println("BUMBU\t :" + nasgor.getBumbu());
        System.out.println("TEKSTUR\t :" + nasgor.getTekstur());
        System.out.println("WARNA\t :" + nasgor.getWarna());
        System.out.println("TOPPING\t :" + nasgor.getTopping());
        
        bubur bubur = new bubur();
        bubur.setrasa("Gurih dan Manis");
        bubur.setBumbu("Beras");
        bubur.settekstur("Lembek");
        bubur.setwarna("Putih");
        bubur.settoping("Kerupuk ,Bawang dan Ayam");
        
        System.out.println("BUBUR");
        System.out.println("RASA\t :" + bubur.getrasa());
        System.out.println("BUMBU\t :" + bubur.getBumbu());
        System.out.println("TEKSTUR\t :" + bubur.gettekstur());
        System.out.println("WARNA\t :" + bubur.getwarna());
        System.out.println("TOPPING\t :" + bubur.gettoping());
        
        jagungbakar1 jagung = new jagungbakar1();
        jagung.setRasa("Asin");
        jagung.setBumbu("Margarin");
        jagung.setTekstur("Lembut");
        jagung.setWarna("Kuning Hitam");
        jagung.setTopping("Keju");
        
        System.out.println("JAGUNG BAKAR");
        System.out.println("RASA\t :" + jagung.getRasa());
        System.out.println("BUMBU\t :" + jagung.getBumbu());
        System.out.println("TEKSTUR\t :" + jagung.getTekstur());
        System.out.println("WARNA\t :" + jagung.getWarna());
        System.out.println("TOPPING\t :" + jagung.getTopping());
        
        nasi_bakar nasbak = new nasi_bakar();
        nasbak.setRasa("Sedap Sangit");
        nasbak.setBumbu("Penyedap");
        nasbak.setTekstur("Kering");
        nasbak.setWarna("kuning");
        nasbak.setToping("Pindang");
        
        System.out.println("NASI BAKAR");
        System.out.println("RASA\t :" + nasbak.getRasa());
        System.out.println("BUMBU\t :" + nasbak.getBumbu());
        System.out.println("TEKSTUR\t :" + nasbak.getTekstur());
        System.out.println("WARNA\t :" + nasbak.getWarna());
        System.out.println("TOPPING\t :" + nasbak.getToping());

        Rawon rawon = new Rawon();
        rawon.setRasa("Gurih");
        rawon.setBumbu("Kluwek");
        rawon.setTekstur("Berkuah");
        rawon.setWarna("Hitam");
        rawon.setTopping("Krupuk Udang");
        
        System.out.println("RAWON");
        System.out.println("RASA\t :" + rawon.getRasa());
        System.out.println("BUMBU\t :" + rawon.getBumbu());
        System.out.println("TEKSTUR\t :" + rawon.getTekstur());
        System.out.println("WARNA\t :" + rawon.getWarna());
        System.out.println("TOPPING\t :" + rawon.getTopping());
    }
}

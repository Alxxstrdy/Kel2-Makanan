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
        
        BAKSOO bakso = new BAKSOO();
        bakso.setRasa("Gurih");
        bakso.setBumbu("Merica, Pala");
        bakso.setTekstur("Berkuah");
        bakso.setWarna("Bening");
        bakso.setTopping("Daun Bawang, Bawang Goreng");
        bakso.setporsi("Besar");
        
        System.out.println("BAKSO");
        System.out.println("RASA\t :" + bakso.getRasa());
        System.out.println("BUMBU\t :" + bakso.getBumbu());
        System.out.println("TEKSTUR\t :" + bakso.getTekstur());
        System.out.println("WARNA\t :" + bakso.getWarna());
        System.out.println("TOPPING\t :" + bakso.getTopping());
        System.out.println("PORSI\t :" + bakso.getporsi());
        
        NasGor nasgor = new NasGor();
        nasgor.setRasa("Asin, Pedas");
        nasgor.setBumbu("Bawang");
        nasgor.setTekstur("Kering");
        nasgor.setWarna("Kecoklatan");
        nasgor.setTopping("Sosis");
        nasgor.setHasil("Nasi Goreng Kecap");
        
        System.out.println("NASI GORENG");
        System.out.println("RASA\t :" + nasgor.getRasa());
        System.out.println("BUMBU\t :" + nasgor.getBumbu());
        System.out.println("TEKSTUR\t :" + nasgor.getTekstur());
        System.out.println("WARNA\t :" + nasgor.getWarna());
        System.out.println("TOPPING\t :" + nasgor.getTopping());
        System.out.println("HASIL\t :" + nasgor.getHasil());
        
        buburr bubur = new buburr();
        bubur.setRasa("Gurih dan Manis");
        bubur.setBumbu("Beras");
        bubur.setTekstur("Lembek");
        bubur.setWarna("Putih");
        bubur.setTopping("Kerupuk ,Bawang dan Ayam");
        bubur.setKuah("Berkaldu");
        
        System.out.println("BUBUR");
        System.out.println("RASA\t :" + bubur.getRasa());
        System.out.println("BUMBU\t :" + bubur.getBumbu());
        System.out.println("TEKSTUR\t :" + bubur.getTekstur());
        System.out.println("WARNA\t :" + bubur.getWarna());
        System.out.println("TOPPING\t :" + bubur.getTopping());
        System.out.println("KUAH\t :" + bubur.getKuah());
        
        rifaulJagungbakar jagung = new rifaulJagungbakar();
        jagung.setRasa("Asin");
        jagung.setBumbu("Margarin");
        jagung.setTekstur("Lembut");
        jagung.setWarna("Kuning Hitam");
        jagung.setTopping("Keju");
        jagung.setjenis("Jagung Manis");
        
        System.out.println("JAGUNG BAKAR");
        System.out.println("RASA\t :" + jagung.getRasa());
        System.out.println("BUMBU\t :" + jagung.getBumbu());
        System.out.println("TEKSTUR\t :" + jagung.getTekstur());
        System.out.println("WARNA\t :" + jagung.getWarna());
        System.out.println("TOPPING\t :" + jagung.getTopping());
        System.out.println("JENIS\t :" + jagung.getjenis());
        
        Nasibakar_subclass nasbak = new Nasibakar_subclass();
        nasbak.setRasa("Sedap Sangit");
        nasbak.setBumbu("Penyedap");
        nasbak.setTekstur("Kering");
        nasbak.setWarna("kuning");
        nasbak.setTopping("Pindang");
        nasbak.setBungkus("Kertas Minyak");
        
        System.out.println("NASI BAKAR");
        System.out.println("RASA\t :" + nasbak.getRasa());
        System.out.println("BUMBU\t :" + nasbak.getBumbu());
        System.out.println("TEKSTUR\t :" + nasbak.getTekstur());
        System.out.println("WARNA\t :" + nasbak.getWarna());
        System.out.println("TOPPING\t :" + nasbak.getTopping());
        System.out.println("BUNGKUS\t :" + nasbak.getBungkus());

        rawongetset rawon = new rawongetset();
        rawon.setRasa("Gurih");
        rawon.setBumbu("Kluwek");
        rawon.setTekstur("Berkuah");
        rawon.setWarna("Hitam");
        rawon.setTopping("Krupuk Udang");
        rawon.setKhas("Ponorogo");
        
        System.out.println("RAWON");
        System.out.println("RASA\t :" + rawon.getRasa());
        System.out.println("BUMBU\t :" + rawon.getBumbu());
        System.out.println("TEKSTUR\t :" + rawon.getTekstur());
        System.out.println("WARNA\t :" + rawon.getWarna());
        System.out.println("TOPPING\t :" + rawon.getTopping());
        
    }
}

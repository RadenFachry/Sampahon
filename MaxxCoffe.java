package Nomor1;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxxCoffe extends MesinKopi {
    private ArrayList<String> daftarKopi;

    public MaxxCoffe(){
        ArrayList <String> daftarKopi2 = new ArrayList<>();
        daftarKopi2.add("Liberica");
        daftarKopi2.add("Magnistipula");
        this.daftarKopi = daftarKopi2;
    }

    @Override
    public void tampilkanKopi(){
        for (int i = 0; i < daftarKopi.size();i++) {
            System.out.println("Berikut daftar kopi = " + daftarKopi.get(i));
        }
    }

    @Override
    public void buatKopi(String kopi) {
        Scanner myObj = new Scanner(System.in);
        String kopipilih;
        System.out.println("Pilih Gula berikut = " +
                "\n Gula Merah" +
                "\n Gula Putih");
        kopipilih = myObj.nextLine();

        System.out.println("Pilihan kopinya adalah " + kopi + " dan dengan toping " + kopipilih);

    }
}

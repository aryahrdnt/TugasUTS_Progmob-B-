package com.example.film;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataFilm {
    private static String[] namafilm = {
            "Money Heist",
            "Fast Furious",
            "Paranormal Activity",
            "Alice in Borderland",
            "Game Of Thrones",

    };

    private static String[] detailfilm = {
            "Money Heist merupakan series Spanyol yang tayang pertama kali pada tahun 2017. Film ini menceritakan tentang sebuah perampokan berencana di badan percetakan uang di Spanyol.",
            "Fast & Furious adalah sebuah seri film aksi, yang berpusat balapan jalanan liar dan perampokan. Didistribusikan oleh Universal Pictures, seri ini dimulai dengan film tahun 2001 berjudul The Fast dan Furious; diikuti oleh tujuh sekuel dan dua film pendek. Hingga Mei 2015, seri ini telah menjadi waralaba Universal terbesar sepanjang masa.",
            "Paranormal Activity adalah film horor independen Amerika Serikat tahun 2007 yang ditulis dan disutradarai oleh Oren Peli.Film ini berkisah mengenai pasangan muda, Katie dan Micah, yang dihantui oleh kekuatan supranatural di rumah mereka.",
            "Alice in Borderland sudah tayang di Netflix pada 10 Desember 2020. Serial Alice in Borderland yang merupakan hasil adaptasi dari manga bergenre thiller karya HARO ASO yang diterbitkan di Weekly Shonen Sunday yang mempunyai delapan episode. Alice in Borderland juga pernah diadaptasi sebagai video animasi pada tahun 2014.",
            "Game of Thrones adalah serial di saluran HBO yang intinya menggambarkan perebutan tahta di sebuah latar fantasi. Ini adalah adaptasi dari A Song of Ice and Fire, seri novel fantasi George R. R. Martin (Anda harus tahu nama orang ini yang dianggap dewa oleh penggemar fanatik GoT).",
    };

    private static int[] gambarfilm = {
            R.drawable.moneyheist,
            R.drawable.fastfurious,
            R.drawable.paranormal,
            R.drawable.aliceinborderland,
            R.drawable.gameofthrones,
    };

    static ArrayList<film> getListdata() {
        ArrayList<film> list = new ArrayList<>();
        for (int position = 0; position < namafilm.length; position++) {
            film film = new film();
            film.setNama(namafilm[position]);
            film.setDetail(detailfilm[position]);
            film.setPhoto(gambarfilm[position]);
            list.add(film);
        }
        return list;
    }


}
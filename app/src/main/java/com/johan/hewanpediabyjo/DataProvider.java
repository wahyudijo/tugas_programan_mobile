package com.johan.hewanpediabyjo;

import android.content.Context;

import com.johan.hewanpediabyjo.model.Hantu;
import com.johan.hewanpediabyjo.model.Hewan;
import com.johan.hewanpediabyjo.model.Kucing;
import com.johan.hewanpediabyjo.model.Ular;
import com.johan.hewanpediabyjo.model.Serangga;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Brithis shorthair", "inggris",
                " Berasal dari inggris dengan ciri khas berbulu pendek keabu abuan  dan lembut", R.drawable.british_shorthair_biru));
        kucings.add(new Kucing("Mine coon ", "Amerika",
                "Mine coon adalah salah satu ras kucing tertua dan alami yang berasal dari maine, amerika", R.drawable.kucing_mine_coon));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing siam adalah salah satu ras kucing pertama diakui jelas sebagai kucing berjeis oriental", R.drawable.kucing_siam));
        return kucings;
    }

    private static List<Hantu> initDataHantu(Context ctx) {
        List<Hantu> hantus = new ArrayList<>();
        hantus.add(new Hantu("Celepuk", "Indonesia",
                "Burung hantu jenis ini mempunyai tubuh yang kescil", R.drawable.harga_burung_hantu_celepuk));
        hantus.add(new Hantu("Snowy owl", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Burung hantu jenis ini mempunyai bulu berwarna putih dan hidup didaerah bersalju hingga dijuluki  snowy olw", R.drawable.snowy_owl_by_cycoze));
        hantus.add(new Hantu("Eruasia eagle owl", "Inggris",
                "Burung hantu jenis ini mempunyai ciri khas unik pada matanya ", R.drawable.eurasian_eagle_owl_pat_eisenberger));
        return hantus;
    }

    private static List<Ular> initDataUlar(Context ctx) {
        List<Ular> ulars = new ArrayList<>();
        ulars.add(new Ular("King kobra", "Banyak dijumpai pada hampir seluruh dunia terutama daerah tropis",
                "Ular jenis ini mengandung cukup racun untuk menyebabkan bahaya atau kematian pada manusia.", R.drawable.kobra));
        ulars.add(new Ular("Piton ", "Banyak dijumpai di daerah tropis",
                "Walaupun ular ini tidak termasuk ular berbisa namun gigitan serta lilitannya dapat membunuh manusia mengunakan  tubuh nya yang besar serta gigitan yag kuat", R.drawable.piton));
        ulars.add(new Ular("Ular hijau ", "Hidup didaerah tropis",
                "Ular ini memiliki karakteristik berwarna hijau hingga dijuluki ular hijau, tapi tidak semua ular hijau itu berbahaya .contohnya ular pucuk dan bajing", R.drawable.ular_hijau));
        return ulars;
    }

    private static List<Serangga> initDataSerangga(Context ctx) {
        List<Serangga> seranggas = new ArrayList<>();
        seranggas.add(new Serangga("Kepik Pembajak", "Nama Hemiptera berasal dari bahasa Yunani hemi",
                "Dikutip dari Iowa State University, serangga ini akan mengonsumsi berbagai jenis telur dari hama pengganggu yang menempel pada daun di tanaman.", R.drawable.serangga1));
        seranggas.add(new Serangga("lebah madu", "dari kawasan Laut Tengah (Afrika Utara, Eropa selatan dan Asia Kecil)",
                "Lebah adalah salah satu serangga yang sangat bermanfaat bagi kehidupan manusia. Lebah merupakan serangga yang membantu bunga dan tanaman lain dalam proses penyerbukan agar tanaman bisa tumbuh dan berkembang dengan mudahnya.", R.drawable.serangga2));
        seranggas.add(new Serangga("laba laba ", "Arachnida.",
                "Laba-laba merupakan salah satu serangga yang ampuh untuk membasmi berbagai serangga yang mengganggu lainnya.", R.drawable.serangga3));
        return seranggas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataHantu(ctx));
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataSerangga(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

package com.example.user.resepmakanan;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.example.user.resepmakanan.R;

import java.util.ArrayList;

public class ResepMakanan extends AppCompatActivity {

    private static final String TAG = "ResepMakanan";

    private ArrayList<String> Names = new ArrayList<>();
    private ArrayList<Integer> image = new ArrayList<>();
    private ArrayList<String> Recipe = new ArrayList<>();
    private ArrayList<String> Desc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_makanan);
        Log.d(TAG, "onCreate: started.");

        showNames();
    }

    private void showNames(){
        Log.d(TAG, "showNames: preparing names.");

        image.add(R.drawable.ayamgeprek);
        image.add(R.drawable.ayambakar);
        image.add(R.drawable.ayamkremes);
        image.add(R.drawable.nasirames);
        image.add(R.drawable.nasipadang);
        image.add(R.drawable.nasiuduk);
        image.add(R.drawable.meebakso);
        image.add(R.drawable.nasigudeg);
        image.add(R.drawable.miedokdok);
        image.add(R.drawable.esteh);
        image.add(R.drawable.esjeruk);
        image.add(R.drawable.jusalpukat);
        image.add(R.drawable.essusu);
        image.add(R.drawable.esnescafe);
        image.add(R.drawable.juslimau);

        Names.add("Ayam Geprek");
        Names.add("Ayam Bakar");
        Names.add("Ayam Kremes");
        Names.add("Nasi Rames");
        Names.add("Nasi Padang");
        Names.add("Nasi Uduk");
        Names.add("Mee Bakso");
        Names.add("Nasi Gudeg");
        Names.add("Mie DokDok");
        Names.add("Es Teh");
        Names.add("Es Jeruk");
        Names.add("Jus Alpukat");
        Names.add("Es susu");
        Names.add("Es Nescafe");
        Names.add("Jus Limau");

        Recipe.add("Bahan-bahan :\n\n" +
                "1 dada filet. Saya iris tipis jadi 5\n" +
                "Bumbu marinasi:\n" +
                "3 siung bawang putih haluskan\n" +
                "1 sdt lada bubuk\n" +
                "1 sdm saus tiram\n" +
                "1 sdt garam\n" +
                "1/2 sdt kaldu bubuk\n" +
                "Larutan cair\n" +
                "1 sdm susu bubuk\n" +
                "500 ml air\n" +
                "Tepung\n" +
                "6 sdm tepung protein tinggi (cakra)\n" +
                "1 sdt kaldu bubuk\n" +
                "1/2 sdt garam\n" +
                "1/2 sdt lada bubuk\n" +
                "1/2 sdt baking soda\n\n" +
                "Bumbu sambal:\n\n" +
                "10 cabai keriting\n" +
                "20 cabai rawit merah\n" +
                "5 siung bawang putih\n" +
                "1 sdt garam\n" +
                "1/4 sdt vetsin\n" +
                "1 sdt gula\n\n " +
                "Langkah-langkah:\n\n" +
                "1.Potong ayam tipis.\n" +
                "\n" +
                "2.Marinasi ayam dengan bumbu marinasi selama 30 menit.\n" +
                "\n" +
                "3.Larutkan susu bubuk dengan 500ml air\n" +
                "\n" +
                "4.Campurkan bahan kering tepung. selesai dimarinasi, balurkan semua ayam ke tepung.\n" +
                "\n" +
                "5.Setelah di balur tepung kering, masukkan ayam kedalam larutan susu. Tiriskan. Balurkan kembali ke tepung kering dan celupkan lagi ke larutan susu dan terakhir balirkan kembali ke tepung. Sisihkan\n" +
                "\n" +
                "6.Panaskan minyak goreng dengan suhu 150 derajat celsius. Jangan terlalu panas agar bagian dalam ayam matang.\n" +
                "\n" +
                "7.Goreng hingga kuning ke coklatan. Angkat\n" +
                "\n" +
                "8.Bumbu sambal: Ulek cabai dan bawang putih bersama garam, vetsin dan gula. Tuangkan minyak goreng panas bekas menggoreng ayam ke dalam sambal.\n" +
                "\n" +
                "9.Letakkan ayam ke dalam cobek dan geprek bersama sambal. Siap disajikan.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 ekor ayam, potong 4 bagian\n" +
                "5 lbr daun jeruk, buang tulang\n" +
                "2 btg sereh\n" +
                "3 cm jahe, memarkan\n\n" +
                "Bumbu halus: \n\n" +
                "8 bh bawang merah\n" +
                "4 siung bawang putih\n" +
                "4 btr kemiri sangrai\n" +
                "5 bh cabe merah keriting\n" +
                "2 sdm kecap manis\n" +
                "2 sdm saos tomat\n" +
                "secukupnya Garam, Merica\n" +
                "Minyak utk menumis\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Haluskan bumbu halus.\n\n" +
                "2.Tumis dg daun jeruk, sereh dan jahe sampai wangi \n\n" +
                "3.Lalu tambahkan air.\n\n" +
                "4.Masukkan ayam, garam dan merica \n\n" +
                "5.Masak sampai bumbu meresap ke dalam ayam \n\n" +
                "6.Bakar ayam sampai agak kering\n\n" +
                "7.Sajikan dg lalapan dan sambel.\n\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 kg ayam\n" +
                "5 siung bawang putih\n" +
                "5 siung bawang merah\n" +
                "5 butir kemiri\n" +
                "sedikit pala\n" +
                "sedikit kapolaga\n" +
                "1 ruas kunyit\n" +
                "sedikit ketumbar\n" +
                "garam\n" +
                "1/2 sdt gula\n" +
                "3 butir telur\n" +
                "12 sdm tepung kanji\n" +
                "minyak untuk menggoreng\n\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Buat ungkepan ayam seperti membuat ayam goreng biasa.\n\n" +
                "kremes :\n\n" +
                "3 btr telur\n\n" +
                "12 sdm tepung kanji\n\n" +
                "Air rebusan ayam\n\n" +
                "Air secukupnya\n\n\n" +
                "Cara buat kremes :\n\n" +
                "1.campur telur n tepung kanji\n\n" +
                "2.tambahkan air rebusan ayam sampai terasa asin nya\n\n" +
                "3.apabila kurang encer tambahkan air.\n\n" +
                "4.Kekentalan saya kira2, tp encer bun.\n\n" +
                "5.Masukan ayam ke adonan kremes.\n\n" +
                "6.goreng di minyak panas sambil dituangkan sdkit2 adonan kremes nya.\n\n" +
                "7.tunggu sbntar,balik,lalu tuangkan/ciprat2 lagi adonan kremes pda ayam.\n\n" +
                "8.Tunggu sampai kecoklatan. Angkat.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "nasi*\n" +
                "3 cup nasi\n" +
                "santan\n" +
                "sereh\n" +
                "selembar Daun salam\n" +
                "oseng sayur*\n" +
                "1 papan tempe\n" +
                "buncis\n" +
                "wortel\n" +
                "Kol\n" +
                "2 SDm Kecap manis\n" +
                "2-3 sdh air asam jawa\n\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Cuci beras.\n\n" +
                "2.Ganti air rebusan dengan santan.\n\n" +
                "3.Masukkan sereh.\n\n" +
                "4.Salam Dan cooking\n\n" +
                "Oseng\n\n" +
                "1.Tumis bawang.\n\n" +
                "2.Masukkan Tempe yg Sudah digoreng terlebih dahulu.\n\n" +
                "3.Masukkan air asam jawa.\n\n" +
                "4.Masukkan sayuran.\n\n" +
                "5.Masukkan Kecap manis penyedap rasa.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "2 porsi nasi putih dingin\n" +
                "5 buah bawang merah\n" +
                "1/2 buah bawang bombay\n" +
                "2 siung bawang putih\n" +
                "1 sdm cabe merah giling\n" +
                "1 batang daun bawang\n" +
                "1 batang selederi\n" +
                "1/2 buah tomat\n" +
                "sawi\n" +
                "ayam suwir, nugget\n" +
                "Garam\n" +
                "Kecap asin\n" +
                "Margarine untuk memasak\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Haluskan :\n\n" +
                "~bawang merah\n" +
                "~bawang putih\n" +
                "~bawang bombay.\n" +
                "\n" +
                "2.Masukkan margarin secukupnya untuk menumis.\n\n" +
                "3.Gunakan api sedang.\n\n" +
                "4.Setelah margarin meleleh, masukkan bumbu yang sudah dihaluskan dan cabe merah gilingnya.\n\n" +
                "5.Beri sedikit garam.\n\n" +
                "6.Lalu tumis sampai matang dan harum.\n\n" +
                "7.Setelah bumbu nya matang, tambahkan tomat.\n\n" +
                "8.aduk sampai tomatnya hancur.\n\n" +
                "9.Lalu langsung masukkan nasi putihnya.\n\n" +
                "10.Aduk rata sampai semua tercampur tambahkan daun bawang dan selederi.\n\n" +
                "11.Bisa dirasa dulu nasi gorengnya, kalau asin nya belom terasa bisa gunakan kecap asin atau garam juga boleh.\n\n" +
                "12.Beri topping ayam suwir atau nugget.\n\n" +
                "13.Nasi Goreng Padang siap disajikan.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "3 liter beras\n" +
                "2 butir kelapa parut (ambil santan kental nya)\n" +
                "Secukupnya garam\n" +
                "7 lembar daun pandan\n" +
                "10 lembar daun salam\n" +
                "3 lembar daun jeruk\n" +
                "10 ruas jahe (Kira2 masing2 3cm)\n" +
                "10 batang sereh\n\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Cuci bersih beras.\n\n" +
                "2.Lalu tambahkan santan Kira2 1 ruas jari telunjuk.\n\n" +
                "3.Lalu tambahkan daun pandan, salam, daun jeruk, sereh dan jahe.\n\n" +
                "4.Setelah jadi aron nasi.\n\n" +
                "5.Matikan api lalu pindahkan ke langseng yang sudah di beri air.\n\n" +
                "6.Kukus Kira2 30 menit.\n\n" +
                "7.Setelah tanak dan matang.\n\n" +
                "8.Matikan api.\n\n" +
                "9.Lalu sajikan bersama pelengkapnya.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 bungkus Mee Ayam Telur (Cap kuda menjangan)\n" +
                "2-4 Butir Telur Ayam / Telur bebek\n" +
                "200 Gram Bakso Ikan\n" +
                "4 Bwg Merah\n" +
                "4 Bwg Putih\n" +
                "4 Kemiri\n" +
                "5-10 Cabe Rawit Merah\n" +
                "3 Sdm Kecap Manis\n" +
                "2 Sdm Kecap Asin\n" +
                "1 Sdm Kecap Ikan\n" +
                "1 Sdm Angciu\n" +
                "1 Ikat Sayur Caisim\n" +
                "200 Gram Kol, potong tipis\n" +
                "Minyak untuk menumis\n" +
                "secukupnya Lada, garam,Micin Jamur\n\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Rebus 1 bungkus Mee Telur (Cap Menjangan yang saya pakai) tiriskan mee\n\n" +
                "2.Haluskan Bw merah, Bw putih, Kemiri, potong cabe rawit, sayuran, sisihkan\n\n" +
                "3.Siapkan wajan, lalu tambahkan minyak goreng secukupnya, masukan bw merah dan bw putih, kemiri yang sudah dihaluskan, tumis sampai wangi, tambahkan Telur ayam, aduk merata dan tunggu sampai matang, Tambahkan sayur hijau dan Kol, Bakso ikan, tunggu semua bahan matang 5-7 min\n\n" +
                "4.Masukan Mee yang sudah direbus kedalam wajan, tambahkan kecap manis, kecap asin, Angciu, kecap ikan, lada, garam, micin jamur, dan koreksi rasanya, kalau suka mee goreng yang lebih basah boleh ditambahkan air secukupnya, masak sampai merata, siap dihidangkan\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 kg nangka muda\n" +
                "1 butir kelapa parut ambil santan encer dan kental\n" +
                "1/2 kg telur rebus kupas kulitnya\n" +
                "250 tulang iga / tetelan\n" +
                "20 tahu putih (tambahan)\n\n" +
                "Bumbu :\n\n" +
                "1 sdm ketumbar sangrai\n" +
                "5 siung bawang putih\n" +
                "5 butir bawang merah\n" +
                "5 butir kemiri\n" +
                "1/4 butir pala\n" +
                "1 potong langkuas\n" +
                "1 potong jahe / 2 cm\n" +
                "3 batang sere\n" +
                "5 lembar daun salam\n" +
                "secukupnya Garam\n" +
                "secukupnya Gula merah\n" +
                "2 lembar daun jati (opsional)\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Nangka dipotong kecil kecil cuci sisihkan\n\n" +
                "2.Tahu putih dan tulang iga cuci sisihkan\n\n" +
                "3.Tulang iga cuci sisihkan\n\n" +
                "4.Telur rebus kupas kulitnya sisihkan\n\n" +
                "5.Haluskan semua bumbu kecuali langkuas, sere, jahe geprek saja beri garam dan daun salam\n\n" +
                "6.Kemudian siapkan panci ditata dari paling bawah kalau ada daun jati kemudian nangka tulang iga tahu putih (tambahan) telur rebus paling atas bumbu halus baru siram dengan santan encer beri gula merah\n\n" +
                "7.Baru direbus sampai santan berkurang tanpa diaduk baru masuk santan kental sampai nyemek nyemek tidak lupa eksekusi rasa\n\n" +
                "8.Sampai betul betul agak kering Gudeg siap disajikan dengan menu pendamping Sambal Goreng krecek resep menyusul biasanya dilengkapi juga dengan menu opor (sudah pernah posting Opor Ayam) Nasi Gudeg siap disajikan Taraa....\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 mi instan\n" +
                "1 siung bawang putih\n" +
                "2 siung bawang merah\n" +
                "4 Cabai rawit\n" +
                "1 Cabai merah (kecil)\n" +
                "secukupnya Garam, gula pasir\n" +
                "Kecap dikit (selera)\n" +
                "sesuai selera Sawi\n" +
                "1 butir telur\n" +
                "secukupnya Air\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Bawang putih, bawang merah, cabai di uleg jadi satu\n\n" +
                "2.Rebus mi instan jangan terlalu matang, lalu tiriskan\n\n" +
                "3.Tumis bumbu yang sudah d uleg kemudian masukkan telur\n\n" +
                "4.Tambahkan sawi dan air secukupnya kemudian masukan mi yang sudah d rebus tambahkan bumbu dari mi instan, gula, garam, dan kecap secukupnya. Cek rasa kemudian hidangkan.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 buah Teh tubruk (waduh lupa ukurannya pokonya hrganya 3500 dh)\n" +
                "1 kg gula pasir (gulaku)\n" +
                "Air mentah... dmasak dulu 1panci ukuran sedang\n" +
                "Garam dikit aja seujung kuku\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Dalam panci masak air smpai matang sampai bergelmbung2 lalu masukkan teh&gula,garam masak smpai teh matang tes rasa manis/ga...\n\n" +
                "2.Aduk2..tunggu dingin baru masukkan kdlm plastik ikat2\n\n" +
                "3.Masukkan ke dlm kulkas tunggu beku/dingin juga ok dh siap dminum dh\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "2 jeruk manis(punya sy agk asem)\n" +
                "2,5 sdm gula pasir\n" +
                "secukupnya air\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Peras jeruk dan saring ke dalam gelas kecil\n\n" +
                "2.Tambahkan gula dan air sampai penuh\n\n" +
                "3.Masukkan kulkas atau jk ingin langsug diminum pake air es atau es batu..klo sy masuk kulkas dulu..selamat mencoba semua orang pasti bisa\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 buah alpukat (selera)\n" +
                "Secukupnya es batu\n" +
                "Secukupnya gula pasir\n" +
                "1 saset skm\n" +
                "Secukupnya air dingin\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Potong bagi dua alpukat\n\n" +
                "2.Dan masukan pada blander ambil menggunakan sendok\n\n" +
                "3.Beri es batu sesuai selera sih\n\n" +
                "4.Dan tambahkan gula pasir dan air dingin\n\n" +
                "5.Blender sampai smooth\n\n" +
                "6.Dan siapkan wadah atau gelas beri toping skm di' pinggir2\n\n" +
                "7.Tuangkan just pada wadah tadi dan sajikan, mantap\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1000 ml susu UHT\n" +
                "1 Kaleng Kental Manis Putih (370 gr)\n" +
                "2 Sdm Maizena\n" +
                "1/2 sdt garam\n" +
                "6 stik choki-choki\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Campurkan susu cair dengan kental manis, rebus dengan api kecil, sambil diaduk2 hingga sedikit berbuih pinggirnya\n\n" +
                "2.Tuangkan Maizena yang sudah dilarutkan dengan sedikit susu cair, dan masukan garam. Aduk lagi hingga rata, lalu matikan api dinginkan.\n\n" +
                "3.Siapkan plastik es lilin, masukan choki-choki, pencet coklatnya, cukup 1/2 stik saja. Lalu ratakan tapi acak supaya mendapatka motif abstrak\n\n" +
                "4.Tuangkan susu yang sudah didinginkan tadi, harus benar benar dingin agar choki-choki tidak meleleh. Lalu, isi plastik es penuh lalu ikat\n\n" +
                "5.Simpan dalam freezer selama beberapa jam hingga beku. Es mambo choki-choki siap dinikmati.\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "10 gram kopi bubuk (bisa pakai kopi sachet nescafe)\n" +
                "100 ml air panas\n" +
                "1 sdm gula merah yg sudah disisir (pakai gula aren lebih enak)\n" +
                "225 ml susu UHT rasa coconut delight\n" +
                "2 sdm krimer (saya pakai omela)\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Campur kopi dan air panas. Buang ampasnya (Saya pakai french press). Bisa juga gunakan kopi sachet non-ampas seperti nescafe.\n\n" +
                "2.Tambahkan krimer dan gula merah ke dalam gelas. Aduk rata. Jika kurang manis, bisa tambahkan gula merahnya ya.\n\n" +
                "3.Masukkan susu rasa coconut delight (ini rasanya yang bikin enak !). Aduk rata. Tambahkan es batu secukupnya\n\n" +
                "4.Es kopi susu ala kafe sudah siap dinikmati\n\n\n\n");
        Recipe.add("Bahan-bahan:\n\n" +
                "1 buah mangga\n" +
                "1/2 wortel\n" +
                "1 jeruk limau\n" +
                "3 iris nanas\n" +
                "secukupnya Air\n\n" +
                "Langkah-langkah:\n\n" +
                "1.Kupas mangga, wortel, nanas lalu cuci bersih. Sisihkan dipiring.\n\n" +
                "2.Masukan kedalam blender, beri perasan jeruk limau.\n\n" +
                "3.Tambahkan secukupnya air\n\n" +
                "4.Lalu blender hingga semua tercampur.\n\n" +
                "5.Sajikan tanpa es\n\n\n\n");

        Desc.add("Ayamnya sedap banget dong");
        Desc.add("Baunya enak sekali ya");
        Desc.add("Kok garing banget");
        Desc.add("dok sedak lalu hok ni");
        Desc.add("Aumm goyang nasi padang ihiks");
        Desc.add("Err nasi ni berwuduk ke");
        Desc.add("Sedap bhaii sampai jilat mangkuk");
        Desc.add("Ya iyalah, emang gudeg banget");
        Desc.add("Nama nya keren banget");
        Desc.add("Ayo kita mengeteh");
        Desc.add("Jeruknya asik gituu");
        Desc.add("Nak cantik, nak lawa, minumlah saya");
        Desc.add("Bukan susu ibu ya");
        Desc.add("Minumlah aku kalau mau overnight");
        Desc.add("Aku adik beradik es jeruk hehe");


        iniResepList();
    }

    private void iniResepList(){
        Log.d(TAG, "iniResepList: initial recyclerView.");
        RecyclerView recyclerView = findViewById(R.id.resepview);
        ResepListAdapter adapter = new ResepListAdapter(this, Names, image, Recipe, Desc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}

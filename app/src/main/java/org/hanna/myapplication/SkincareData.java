package org.hanna.myapplication;

import java.util.ArrayList;

public class SkincareData {
    private static String[] skincareNames ={
            "Himalaya Neem Face Wash",
            "Viva Air Mawar",
            "Wardah Perfect Bright",
            "Wardah Sunscreen",
            "Wardah Eye Cream",
            "Nature Republic Aloe Vera Gel",
            "Cosrx AHA BHA Toner",
            "Himalaya Neem Scrub",
            "Vaseline Lip Therapy",
            "Freeman Mud Mask"
    };

    private static String[] skincareDetails ={
            "Himalaya Neem Face Wash adalah formulasi herbal bebas sabun yang membersihkan kotoran dan membantu membersihkan jerawat. Perpaduan alami dari Neem dan Kunyit menyatukan sifat antibakteri dan antijamurnya untuk mencegah kambuhnya jerawat dari waktu ke waktu.",
            "Viva Air Mawar mengandung sari bunga mawar dan aroma bunga mawar yang menenangkan. Praktis dan higienis untuk digunakan sebagai campuran bubuk masker dan lulur.",
            "Wardah Perfect Bright dengan tekstur krim yang ringan dan tidak lengket, Wardah perfect bright lightening moisturizer cepat meresap ke dalam kulit dengan hasil akhir tampak cerah seperti menggunakan bedak.",
            "Wardah Sunscreen mengandung double action formula untuk melindungi kulit dari paparan sinar matahari, sekaligus melembabkan kulit. Diformulasikan dalam bentuk gel yang ringan dan lembut sehingga nyaman digunakan dan tidak memberikan efek lengket bahkan untuk kulit berminyak.",
            "Wardah White Secret Brightening Eye Cream mengandung White Adenosine Complex Dan Vit B3, membantu Mencerahkan Kulit Sekitar mata akibat lingkaran hitam dan kantong mata, membantu menjaga hidrasi kulit secara optimal sehingga kulit disekitar area mata dapat terjaga elastisitasnya.",
            "Nature Republic Alore Vera Gel mengandung 92% lidah buaya, menenangkan kulit, menyegarkan, menyerap dengan cepat.",
            "Cosrx AHA/BHA Clarifying Treatment Toner merupakan toner dengan kandungan bahan-bahan natural dan air mineral. Produk ini lebih dari sekedar toner biasa, karena memiliki kandungan AHA/BHA organik yang dapat berfungsi sebagai exfoliating toner.",
            "Himalaya Neem Scrub adalah scrub herbal yang mampu menghilangkan kotoran dan sel-sel kulit mati, membersihkan minyak berlebih dari permukaan kulit yang meruapakan akar penyebab jerawat.",
            "Vaseline Lip Therapy dapat menjaga agar bibir tetap lembab, membuat bibir jadi lembut dan halus, mengembalikan warna asal bibir, mencegah kulit bibir pecah dan berdarah, memudarkan warna hitam pad bibir.",
            "Freeman Mud Mask dapat membantu proses detoksifikasi kulit, menjaga kelembapan dan memberikan hidrasi di kulit wajah, membantu menyerap minyak berlebih di wajah, membuat kulit di wajah terasa halus dan lembut."
    };

    private static int[] skincarePhotos ={
            R.drawable.himalaya,
            R.drawable.vivaairmawar,
            R.drawable.wardahperfectbright,
            R.drawable.wardahsunscreen,
            R.drawable.wardaheyecream,
            R.drawable.naturerepublic,
            R.drawable.cosrxahabha,
            R.drawable.himalayascrub,
            R.drawable.vaselineliptherapy,
            R.drawable.freemanmask
    };

    static ArrayList<Skincare> getListData(){
        ArrayList<Skincare> list = new ArrayList<>();
        for (int position = 0; position < skincareNames.length; position++) {
            Skincare skincare = new Skincare();
            skincare.setNama(skincareNames[position]);
            skincare.setDetail(skincareDetails[position]);
            skincare.setFoto(skincarePhotos[position]);
            list.add(skincare);
        }
        return list;
    }
}

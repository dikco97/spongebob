package com.dicoding.spongebob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBbottom: RecyclerView

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBbottom= findViewById(R.id.rv_bottom)




        val bbottomList = listOf<Bbottom>(
            Bbottom(
                R.drawable.spongebob,
                nameBbottom = "Spongebob",
                descBbottom = "Siapa yang tinggal di nanas di bawah laut? Tentu saja itu SpongeBob SquarePants! SpongeBob adalah seorang optimis abadi yang menyukai ubur-ubur, karate, dan pekerjaannya sebagai juru masak goreng di sebuah restoran cepat saji bernama Krusty Krab (yang sangat ia kuasai). SpongeBob bersekolah di Sekolah Berperahu Mrs. Puff dan impian terbesarnya dalam hidup adalah menerima lisensi berperahu. Dia suka bergaul dengan sahabatnya, Patrick dan SUKA bersenang-senang! Dengan kepribadian happy-go-lucky, SpongeBob adalah spons laut yang kekanak-kanakan (tapi bertanggung jawab), ceria, dan canggung."
            ),
            Bbottom(
                R.drawable.patrick,
                nameBbottom = "Patrick",
                descBbottom = " sahabat SpongeBob yang bodoh namun menyenangkan. Patrick tinggal di bawah batu di kota Bikini Bottom yang sedang dibangun dan merupakan tetangga SpongeBob dan Squidward. Patrick dan SpongeBob cenderung mengganggu Squidward; padahal mereka melakukannya tanpa sadar dan mempunyai niat baik. Meskipun kecerdasannya rendah, Patrick setia dan terkadang berwawasan luas. Selain naif dan malas, dia menikmati menghabiskan waktu bersama SpongeBob dan akan selalu berpaling padanya ketika keadaan tampak tidak beres."
            ),
            Bbottom(
                R.drawable.squidward,
                nameBbottom = "Squidward",
                descBbottom = "tetangga dan rekan kerja SpongeBob di Krusty Krab, yang tinggal di Pulau Paskah. Selain lancang dan tertutup, Squidward juga arogan dan pesimis yang melihat dirinya sebagai artis dan musisi berbakat. Hobi favoritnya adalah melukis potret diri dan bermain klarinet."
            ),
            Bbottom(
                R.drawable.sandy,
                nameBbottom = "Sandy",
                descBbottom = "Penjelajah, pencari sensasi, dan ilmuwan. Apa yang tidak bisa dilakukan oleh orang Texas yang suka berpetualang ini?! Sandy Cheeks adalah tupai dari Texas yang tinggal di kubah pohon kaca berisi udara untuk bernapas di bawah air. Berasal dari negara bagian Texas, dia memiliki aksen Selatan dan kecintaan pada rodeo. Sandy bekerja sebagai ilmuwan dan membuat sendiri kubah pohon, pakaian udara, dan helmnya."
            ),
            Bbottom(
                R.drawable.garry,
                nameBbottom = "Garry",
                descBbottom = "siput peliharaan SpongeBob yang tidak berbicara melainkan berkomunikasi melalui mengeong seperti kucing. Gary ternyata sangat cerdas dan sering kali memberikan alasan bagi pemiliknya. Dengan mengeong seperti kucing, Gary memiliki tingkah laku yang mirip dengan kucing di dunia nyata. Dari mengambil hingga melakukan trik, ia juga memiliki beberapa kemampuan seperti anjing."
            ),
            Bbottom(
                R.drawable.crab,
                nameBbottom = "Mr. Crab",
                descBbottom = "bos SpongeBob dan pemilik Krusty Krab yang rakus. Eugene Krabs adalah seorang ayah tunggal yang tinggal di sebuah jangkar bersama putri paus remajanya, Pearl. Oh dan dia juga terobsesi mengumpulkan uang! Eugene Krabs sangat terobsesi dengan uang sehingga dia berusaha keras untuk meningkatkan kekayaannya, sampai pada titik di mana dia terkadang memperlakukan uang lebih baik daripada putri dan karyawannya. Satu-satunya persaingan bisnis Tuan Krabs datang dari Chum Bucket, sebuah restoran gagal yang dijalankan oleh Sheldon Plankton dan istrinya Karen."
            ),
            Bbottom(
                R.drawable.plankton,
                nameBbottom = "Plankton",
                descBbottom = "copepoda hijau kecil yang merupakan penemu terampil dengan kompleks Napoleon. Dia adalah musuh bebuyutan Tuan Krabs dan merupakan pemilik Chum Bucket yang nakal (restoran saingan Krusty Krab yang gagal). Plankton dan istrinya Karen terus-menerus merencanakan untuk mencuri formula rahasia Krabby Patty yang membuat Krusty Krab begitu sukses."
            ),
            Bbottom(
                R.drawable.puff,
                nameBbottom = "Mrs. Puff",
                descBbottom = "guru SpongeBob di sekolah berasrama, tempat siswanya mengemudikan perahu seperti mobil bawah air. Dia adalah seorang pasien, ikan buntal tua yang mengenakan pakaian pelaut dan biasanya jengkel dengan cara mengemudi SpongeBob yang sembrono."
            ),
            Bbottom(
                R.drawable.pearl,
                nameBbottom = "Pearl",
                descBbottom = "paus sperma populer Tuan Krabs yang berusia enam belas tahun dan pewaris restoran dan kekayaannya. Sebagai seorang siswa SMA, Pearl belum memiliki pekerjaan di bisnis keluarga dan malah bekerja di mall."
            ),
            Bbottom(
                R.drawable.karen,
                nameBbottom = "Karen",
                descBbottom = "komputer tahan air Plankton yang tinggal di laboratorium Chum Bucket. Dia memberi Plankton rencana jahatnya untuk membuat Krusty Krab bangkrut. Sistemnya dibangun di sebagian besar penemuan Plankton."
            )

        )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_bottom)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BbottomAdapter(this, bbottomList) {

            val intent = Intent(this, DetailBbottomActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)



        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                rvBbottom.layoutManager= LinearLayoutManager(this)
            }
            R.id.action_grid -> {
                rvBbottom.layoutManager = GridLayoutManager(this,2)

            }
            R.id.action_about -> {
                val moveIntent = Intent(this,About_page::class.java)
                startActivity(moveIntent)
            }
        }

        return super.onOptionsItemSelected(item)

    }


}
package ibrahim.aytimur.degiskenveritipleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // String
        var adi:String = "ibrahim"
        var soyadi = "aytimur"
        var tamAdi = (adi.capitalize()+"  "+soyadi.capitalize())

       // Char
        var deger1:Char = 'A'
        var deger2 = '1'

        // Boolean
        var durum1:Boolean = true
        var durum2 = false

        //Toast.makeText(applicationContext,"$tamAdi",Toast.LENGTH_SHORT).show()

        // Dizi veri tipleri
        // arrayOf
        var sayilar = arrayOf(3,4,7,10,15)
        sayilar.set(2,35)
        var isimler = arrayOf("Furkan","Emir","Hikmet","Yusuf")
        var karma = arrayOf("Furkan",'K',721)
        var karma2:Array<Any> = arrayOf("Furkan",'K',721)

        // arrayListOf
        var sayilarList = arrayListOf(3,5,7,9)
        sayilarList.set(3,35)
        sayilarList.add(45)
        Toast.makeText(applicationContext,"sayilarList" + sayilarList[4],Toast.LENGTH_SHORT).show()
    }
}

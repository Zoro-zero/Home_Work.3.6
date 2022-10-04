package com.example.hw36

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw36.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private var musicList = arrayListOf<Music>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        val adapter = PlaylistAdapter(data = musicList, this::onClick)
        binding.recyclerSecond.adapter = adapter

    }

    private fun loadData() {
        val key: Int
        key = intent.getIntExtra("key",0)

        when(key) {
            1 -> {musicList.add(Music(1,"Let It Sleep","Asking Alexandria","4:00"))
                    musicList.add(Music(2,"The Black","Asking Alexandria","4:41"))
                    musicList.add(Music(3,"I Won't Give In","Asking Alexandria","3:51"))
                    musicList.add(Music(4,"Sometimes It Ends","Asking Alexandria","4:45"))
                    musicList.add(Music(5,"The Lost Souls","Asking Alexandria","4:05"))
                    musicList.add(Music(6,"Just a Slave to Rock 'n Roll","Asking Alexandria","3:25"))
                    musicList.add(Music(7,"Send Me Home","Asking Alexandria","4:18"))
                    musicList.add(Music(8,"We'll Be Ok","Asking Alexandria", "3:57"))
                    musicList.add(Music(9,"Here I Am","Asking Alexandria", "4:19"))
                    musicList.add(Music(10,"Gone","Asking Alexandria", "3:17")) }

            2 -> {musicList.add(Music(1,"I Stole Your Love","Kiss","3:04"))
                    musicList.add(Music(2,"Christine Sixteen","Kiss","3:14"))
                    musicList.add(Music(3,"Got Love for Sale","Kiss","3:29"))
                    musicList.add(Music(4,"Shock Me","Kiss","3:49"))
                    musicList.add(Music(5,"Tomorrow and Tonight","Kiss","3:40"))
                    musicList.add(Music(6,"Love Gun","Kiss","3:18"))
                    musicList.add(Music(7,"Hooligan","Kiss","3:01"))
                    musicList.add(Music(8,"Almost Human","Kiss","2:49"))
                    musicList.add(Music(9,"Plaster Caster","Kiss","3:27"))
                    musicList.add(Music(10,"Then She Kissed Me","Kiss","3:02")) }

            3 -> {musicList.add(Music(1,"My Name Is", "Eminem", "4:28"))
                    musicList.add(Music(2,"Guilty Conscience", "Eminem", "3:19"))
                    musicList.add(Music(3,"Brain Damage", "Eminem", "3:46"))
                    musicList.add(Music(4,"If I Had", "Eminem", "4:05"))
                    musicList.add(Music(5,"’97 Bonnie & Clyde", "Eminem", "5:16"))
                    musicList.add(Music(6,"Role Model", "Eminem", "3:25"))
                    musicList.add(Music(7,"My Fault", "Eminem", "4:01"))
                    musicList.add(Music(8,"Cum on Everybody", "Eminem", "3:39"))
                    musicList.add(Music(9,"Rock Bottom", "Eminem", "3:34"))
                    musicList.add(Music(10,"Just Don’t Give a Fuck", "Eminem", "4:02")) }

            4 -> {musicList.add(Music(1, "Ambitionz az a Ridah", "2Pac", "4:39"))
                    musicList.add(Music(2, "All bout U", "2Pac", "4:37"))
                    musicList.add(Music(3, "Skandalouz", "2Pac", "4:09"))
                    musicList.add(Music(4, "Got My Mind Made Up", "2Pac", "5:13"))
                    musicList.add(Music(5, "How Do U Want It", "2Pac", "4:47"))
                    musicList.add(Music(6, "2 of Amerikaz Most Wanted", "2Pac", "4:07"))
                    musicList.add(Music(7, "No More Pain", "2Pac", "6:14"))
                    musicList.add(Music(8, "Heartz of Men", "2Pac", "4:43"))
                    musicList.add(Music(9, "Life Goes On", "2Pac", "5:02"))
                    musicList.add(Music(10, "Only God Can Judge Me", "2Pac", "4:57")) }

            5 -> {musicList.add(Music(1,"Grenade", "Bruno Mars", "3:42"))
                    musicList.add(Music(2,"Just the Way You Are", "Bruno Mars", "3:40"))
                    musicList.add(Music(3,"Our First Time", "Bruno Mars", "4:03"))
                    musicList.add(Music(4,"Runaway Baby", "Bruno Mars", "2:27"))
                    musicList.add(Music(5,"The Lazy Song", "Bruno Mars", "3:15"))
                    musicList.add(Music(6,"Marry You", "Bruno Mars", "3:50"))
                    musicList.add(Music(7,"Talking to the Moon", "Bruno Mars", "3:37"))
                    musicList.add(Music(8,"Liquor Store Blues", "Bruno Mars", "3:49"))
                    musicList.add(Music(9,"Count on Me", "Bruno Mars", "3:17"))
                    musicList.add(Music(10,"The Other Side", "Bruno Mars", "3:47"))
            }
        }
    }
    private fun onClick(music: Music) {

    }

}
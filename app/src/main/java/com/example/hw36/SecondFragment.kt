package com.example.hw36
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw36.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var musicList = arrayListOf<Music>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val adapter = PlaylistAdapter(musicList,this::onClick)
        binding.recyclerPlaylist.adapter = adapter
    }

    private fun loadData() {
        musicList.add(Music(1,"The Black","Asking Alexandria","47:40"))
        musicList.add(Music(2,"Love Gun","Kiss","32:53"))
        musicList.add(Music(3,"The Slim Shady LP","Eminem","59:39"))
        musicList.add(Music(4,"All Eyez on Me", "2Pac", "132:18"))
        musicList.add(Music(5,"Doo-Wops & Hooligans", "Bruno Mars", "35:20"))
    }
    private fun onClick(music: Music){
        val intent = Intent (activity, SecondActivity::class.java)
        intent.putExtra("key",music.number)
        activity?.startActivity(intent)
    }

}
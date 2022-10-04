package com.example.hw36

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw36.databinding.ItemPlaylistBinding

class PlaylistAdapter(
    val data: ArrayList<Music>,
    val onClick:(music: Music) -> Unit
    ): RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind()

    }

    override fun getItemCount(): Int = data.size



    inner class PlaylistViewHolder(private val binding: ItemPlaylistBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = data[adapterPosition]

            itemView.setOnClickListener {
                onClick(item)

            }

            binding.tvNumberPlaylist.text = item.number.toString()
            binding.tvPlaylist.text = item.name
            binding.tvSinger.text = item.singer
            binding.tvTimePlaylist.text = item.time
        }
    }
}
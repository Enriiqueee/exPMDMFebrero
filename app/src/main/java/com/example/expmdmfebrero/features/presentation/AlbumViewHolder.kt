package com.example.expmdmfebrero.features.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.R
import com.example.expmdmfebrero.app.extension.Glide.loadImage
import com.example.expmdmfebrero.databinding.ItemAlbumBinding
import com.example.expmdmfebrero.features.model.Album
import com.example.expmdmfebrero.features.model.AlbumToggleFavoriteUseCase

class AlbumViewHolder(
    private val binding: ItemAlbumBinding,
    private val albumToggleFavoriteUseCase: AlbumToggleFavoriteUseCase
) : RecyclerView.ViewHolder(binding.root) {

    suspend fun bind(album: Album) {
        binding.albumName.text = album.name
        binding.albumDescription.text = album.creationDate
        binding.albumImage.loadImage(album.imageUrl)

        setFavoriteIcon(album)

        binding.favorite.setOnClickListener {
            toggleFavorite(album)
        }
    }

    private suspend fun setFavoriteIcon(album: Album) {
        val favoriteStatus = albumToggleFavoriteUseCase(album.name)

        if (favoriteStatus.favorite) {
            binding.favorite.setImageResource(R.drawable.ic_bookmark)
        } else {
            binding.favorite.setImageResource(R.drawable.ic_bookmark_mark)
        }
    }

    private suspend fun toggleFavorite(album: Album) {
        val favoriteStatus = albumToggleFavoriteUseCase(album.name)

        val updatedFavoriteStatus = !favoriteStatus.favorite

        if (updatedFavoriteStatus) {
            binding.favorite.setImageResource(R.drawable.ic_bookmark)
        } else {
            binding.favorite.setImageResource(R.drawable.ic_bookmark_mark)
        }
    }
}

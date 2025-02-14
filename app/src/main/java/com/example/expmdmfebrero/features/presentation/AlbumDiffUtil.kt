package com.example.expmdmfebrero.features.presentation

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.example.expmdmfebrero.features.model.Album

class AlbumDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean = oldItem.name == newItem.name

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean = newItem == oldItem
}
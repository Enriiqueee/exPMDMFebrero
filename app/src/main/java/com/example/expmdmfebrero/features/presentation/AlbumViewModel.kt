package com.example.expmdmfebrero.features.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.expmdmfebrero.features.data.AlbumDataRepository
import com.example.expmdmfebrero.features.model.Album
import com.example.expmdmfebrero.features.model.AlbumRepository
import com.example.expmdmfebrero.features.model.AlbumToggleFavoriteUseCase
import com.example.expmdmfebrero.features.model.GetAlbumUseCase

class AlbumViewModel(private val albumToggleFavoriteUseCase: AlbumToggleFavoriteUseCase): ViewModel() {

    private val _albums = MutableLiveData<List<Album>>()
    val albums: LiveData<List<Album>> get() = _albums
//
//    fun loadAlbums() {
//        viewModelScope.launch {
//            _albums.value = AlbumDataRepository().getAlbum()
//        }
//    }
//
//    fun toggleFavorite(album: Album) {
//        viewModelScope.launch {
//            albumToggleFavoriteUseCase.invoke(album)
//            _albums.value = _albums.value
//        }
//    }
}
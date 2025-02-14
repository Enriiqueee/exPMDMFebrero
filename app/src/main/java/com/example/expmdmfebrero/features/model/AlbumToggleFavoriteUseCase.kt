package com.example.expmdmfebrero.features.model

class AlbumToggleFavoriteUseCase(private val albumRepository: AlbumRepository) {

    suspend operator fun invoke(albumName: String): Favorite {
        val isFavorite = albumRepository.getFavoriteAlbum(albumName)
        return Favorite(albumName, isFavorite)
    }

    data class Favorite(val album: String, val favorite: Boolean)
}
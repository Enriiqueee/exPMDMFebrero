package com.example.expmdmfebrero.features.model

interface AlbumRepository {

    suspend fun getAlbum(): List<Album>
    suspend fun getFavoriteAlbum(AlbumName : String): Boolean
    suspend fun toggleFavorite(albumName: String): Boolean

}
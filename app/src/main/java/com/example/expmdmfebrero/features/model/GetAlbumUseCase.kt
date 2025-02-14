package com.example.expmdmfebrero.features.model

class GetAlbumUseCase(private val albumRepository: AlbumRepository) {

    suspend operator fun invoke(){
        albumRepository.getAlbum()
    }
}
package com.example.expmdmfebrero.features.data

import com.example.expmdmfebrero.features.model.Album
import com.example.expmdmfebrero.features.model.AlbumRepository

class AlbumDataRepository: AlbumRepository {

    private val albums = listOf(
        Album("Álbum 1", "Descripción del Álbum 1", "01/01/2025", "https://example.com/album1.jpg"),
        Album("Álbum 2", "Descripción del Álbum 2", "02/01/2025", "https://example.com/album2.jpg"),
        Album("Álbum 3", "Descripción del Álbum 3", "03/01/2025", "https://example.com/album3.jpg"),
        Album("Álbum 4", "Descripción del Álbum 4", "04/01/2025", "https://example.com/album4.jpg"),
        Album("Álbum 5", "Descripción del Álbum 5", "05/01/2025", "https://example.com/album5.jpg"),
        Album("Álbum 6", "Descripción del Álbum 6", "06/01/2025", "https://example.com/album6.jpg"),
        Album("Álbum 7", "Descripción del Álbum 7", "07/01/2025", "https://example.com/album7.jpg"),
        Album("Álbum 8", "Descripción del Álbum 8", "08/01/2025", "https://example.com/album8.jpg"),
        Album("Álbum 9", "Descripción del Álbum 9", "09/01/2025", "https://example.com/album9.jpg"),
        Album("Álbum 10", "Descripción del Álbum 10", "10/01/2025", "https://example.com/album10.jpg")
    )

    private val favoriteAlbums = mutableSetOf<String>()

    override suspend fun getAlbum(): List<Album> {
        return albums
    }

    override suspend fun getFavoriteAlbum(AlbumName: String): Boolean {
        return favoriteAlbums.contains(AlbumName)
    }

    override suspend fun toggleFavorite(albumName: String): Boolean {
        return if (favoriteAlbums.contains(albumName)) {
            favoriteAlbums.remove(albumName)
            false
        } else {
            favoriteAlbums.add(albumName)
            true
        }
    }

}
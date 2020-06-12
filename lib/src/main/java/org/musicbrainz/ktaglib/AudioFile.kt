package org.musicbrainz.ktaglib

data class AudioFile(
    val path: String = "",
    var size: Long = 0,
    var lastModified: Long = 0,
    val title: String? = "",
    val albumArtist: String? = "",
    val artist: String? = "",
    val album: String? = "",
    val track: Int? = 0,
    val trackTotal: Int? = 0,
    val disc: Int? = 0,
    val discTotal: Int? = 0,
    val duration: Int? = 0,
    val year: Int? = 0,
    var genre: String? = ""
)

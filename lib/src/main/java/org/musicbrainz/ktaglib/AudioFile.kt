package org.musicbrainz.ktaglib

//picard analogy commented out for mapping
data class AudioFile(
    val path: String = "",
    var size: Long = 0,
    var lastModified: Long = 0,
    //Title
    val title: String? = "",
    val albumArtist: String? = "",
    //Artist
    val artist: String? = "",
    //Album
    val album: String? = "",
    //Track Number
    val track: Int? = 0,
    //Total Tracks
    val totalTracks: Int? = 0,
    //Disc Number
    val discNumber: Int? = 0,
    //Total Discs
    val discTotal: Int? = 0,
    //Duration
    val length: Int? = 0,
    //Year
    val year: Int? = 0,
    var genre: String? = "",
    //MusicBrainz Artist ID
    var MBartistID: String? = "",
    //MusicBrainz Recording ID
    var MBrecordingID: String? = "",
        //MusicBrainz Release Artist ID
    var MBreleaseArtistID: String? = "",
    // Release ID
    var MBreleaseID: String? = "",
        //Musicbrainz Track ID
    var MBtrackID: String? = "",
    //Original Year
    var origYear: Int? = 0,
    //Release Country
    var relCountry: String? = "",
    // Release Status
    var relStatus:String? = "",
    //Script
    var script:String? = ""
)

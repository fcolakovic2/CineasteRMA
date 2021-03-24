package com.example.cineaste.data

fun favoriteMovies(): List<Movie> {
    return listOf( Movie(1,"Pride and prejudice", "Sparks fly when spirited Elizabeth " +
            "Bennet meets single, rich, and proudMr. Darcy." +
            " But Mr. Darcy reluctantly finds himself falling in love with a womanbeneath his class. " +
            "Can each overcome their own pride and prejudice?",    "16.02.2005.",
        "https://www.imdb.com/title/tt0414387/",             "drama"),
        Movie(2, "LZN", "Testni opis", "10.2.2007", "google.ba", "comedy"),
        Movie(3, "LZN2", "Testni opis", "11.2.2007", "google.hr", "comedy"),
        Movie(4, "LZN3", "Testni opis", "12.2.2007", "google.com", "comedy")



        )
}

fun recentMovies(): List<Movie> {return listOf( Movie(1,"The Courier",
    "Cold War spy Greville Wynne and his Russian source try to put an end tothe Cuban Missile Crisis.",
    "17.05.2021.","https://www.imdb.com/title/tt8368512/",       "thriller"),
    Movie(2, "LZN", "Testni opis", "10.2.2007", "google.ba", "comedy"),
    Movie(3, "LZN2", "Testni opis", "11.2.2007", "google.hr", "comedy"),
    Movie(4, "LZN3", "Testni opis", "12.2.2007", "google.com", "comedy")
  )}
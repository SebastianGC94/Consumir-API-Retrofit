package com.example.retrofitmovieslist.Network;

import com.example.retrofitmovieslist.Model.Movie;
import com.example.retrofitmovieslist.Model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiMovie {

    @GET("movies/list.php")
    Call<List<Movie>> getMovies();
}

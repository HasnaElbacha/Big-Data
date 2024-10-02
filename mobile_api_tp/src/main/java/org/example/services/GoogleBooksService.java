package org.example.services;

import org.example.models.GoogleBooksRespense;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleBooksService {
    @GET("v1/volumes")
    Call<GoogleBooksRespense> searchBooks(@Query("q") String query);
}

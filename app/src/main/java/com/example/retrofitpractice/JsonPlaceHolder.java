package com.example.retrofitpractice;


import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolder {

    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") Integer[] userId,
                              @Query("_sort") String sort,
                              @Query("_order") String order);


    @GET("posts")
    Call<List<Post>> getPosts(//Here string1 in MAP is the Query and String2 is the variables
                              @QueryMap Map<String, String> parameters
    );

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

    @GET
    Call<List<Comment>> getComments(@Url String url);
}
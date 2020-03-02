package com.example.retrofitpractice;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolder {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/2/comments")
    Call<List<Comment>> getComments();
}

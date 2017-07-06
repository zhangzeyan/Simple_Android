package com.simple.android.network.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/6/15
 * @time: 下午6:07
 * @description:
 **/
public interface MovieService {
    @GET("top250")
    Call<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);
}

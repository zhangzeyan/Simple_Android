package com.simple.android.network.retrofit;

import android.view.View;
import android.widget.TextView;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * @fileName: 只使用Retrofit
 * @author: zhangzeyan
 * @date: 2017/6/15
 * @time: 下午5:32
 * @description:
 **/
public class MyOnlyRetrofitActivity extends BaseActivity {


    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_only_retrofit);
    }


    public void clickMyTestClick(View view) {

        String baseUrl = "https://api.douban.com/v2/movie/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MovieService movieService = retrofit.create(MovieService.class);
        Call<MovieEntity> call = movieService.getTopMovie(0, 10);
        call.enqueue(new Callback<MovieEntity>() {
            @Override
            public void onResponse(Call<MovieEntity> call, Response<MovieEntity> response) {
                ((TextView) findViewById(R.id.my_result)).setText(response.body().getTitle());
            }

            @Override
            public void onFailure(Call<MovieEntity> call, Throwable t) {
                ((TextView) findViewById(R.id.my_result)).setText(t.getMessage());
            }
        });
    }
}

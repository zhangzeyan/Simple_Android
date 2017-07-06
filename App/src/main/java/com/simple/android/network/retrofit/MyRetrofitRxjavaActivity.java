package com.simple.android.network.retrofit;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @fileName: Retrofit与Rxjava结合
 * @author: zhangzeyan
 * @date: 2017/6/15
 * @time: 下午5:34
 * @description:
 **/
public  class MyRetrofitRxjavaActivity extends BaseActivity{

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_retrofit_rxjava);
    }

    public void clickMyTestClick(View view) {

        String baseUrl = "https://api.douban.com/v2/movie/";


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        MovieService2 movieService = retrofit.create(MovieService2.class);

        movieService.getTopMovie(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MovieEntity>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(MyRetrofitRxjavaActivity.this, "请求成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        ((TextView) findViewById(R.id.my_result)).setText(e.getMessage());
                    }

                    @Override
                    public void onNext(MovieEntity movieEntity) {
                        ((TextView) findViewById(R.id.my_result)).setText(movieEntity.getTitle());
                    }
                });

    }
}

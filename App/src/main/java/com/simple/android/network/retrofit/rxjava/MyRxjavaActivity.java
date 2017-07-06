package com.simple.android.network.retrofit.rxjava;

import com.simple.android.R;
import com.simple.android.home.BaseActivity;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MyRxjavaActivity extends BaseActivity {

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_my_rxjava);


        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
            }

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
            }

        };

        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello");
                subscriber.onNext("Hi");
                subscriber.onNext("Aloha");
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
                .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在主线程
                .subscribe(subscriber);


    }

}

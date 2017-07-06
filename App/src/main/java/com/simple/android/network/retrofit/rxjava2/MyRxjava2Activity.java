package com.simple.android.network.retrofit.rxjava2;

import com.simple.android.home.BaseActivity;

import rx.Observable;

//import org.reactivestreams.Subscriber;
//import org.reactivestreams.Subscription;
//
//import io.reactivex.Observer;
//import io.reactivex.disposables.Disposable;

/**
 * @fileName:
 * @author: zhangzeyan
 * @date: 2017/6/14
 * @time: 下午4:06
 * @description:
 **/
public class MyRxjava2Activity extends BaseActivity {

    @Override
    protected void setContentView() {

    }


//    Observer<String> observer = new Observer<String>() {
//
//
//        @Override
//        public void onSubscribe(@NonNull Disposable d) {
//
//        }
//
//        @Override
//        public void onNext(String s) {
//
//        }
//
//        @Override
//        public void onError(Throwable e) {
//        }
//
//        @Override
//        public void onComplete() {
//
//        }
//
//    };


//    Subscriber<String> subscriber = new Subscriber<String>() {
//        @Override
//        public void onSubscribe(Subscription s) {
//
//        }
//
//        @Override
//        public void onNext(String s) {
//        }
//
//
//        @Override
//        public void onError(Throwable e) {
//        }
//
//        @Override
//        public void onComplete() {
//
//        }
//    };


    Observable observable = Observable.create(new Observable.OnSubscribe<String>() {

        @Override
        public void call(rx.Subscriber<? super String> subscriber) {
            subscriber.onNext("Hello");
            subscriber.onNext("Hi");
            subscriber.onNext("Aloha");
            subscriber.onCompleted();
        }
    });

   public void setObserver(){
      // observable.ObservableEmitter(subscriber);
   }
}

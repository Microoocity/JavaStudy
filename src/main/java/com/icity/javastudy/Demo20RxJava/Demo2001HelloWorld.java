package com.icity.javastudy.Demo20RxJava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Demo2001HelloWorld {
    public static void main(String[] args) {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
                observableEmitter.onNext(1);
                System.out.println("1");
                observableEmitter.onNext(2);
                System.out.println("2");
                observableEmitter.onNext(3);
                System.out.println("3");
            }
        }).subscribe(new Observer<Integer>() {
            public void onSubscribe(Disposable disposable) {

            }

            public void onNext(Integer integer) {

            }

            public void onError(Throwable throwable) {

            }

            public void onComplete() {

            }
        });

    }
}

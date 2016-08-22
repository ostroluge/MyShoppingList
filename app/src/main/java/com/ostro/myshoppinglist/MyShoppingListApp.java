package com.ostro.myshoppinglist;

import android.app.Application;

import com.firebase.client.Firebase;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import timber.log.Timber;

/**
 * Created by Thomas Ostrowski
 * ostrowski.thomas@gmail.com
 * on 29/07/2016.
 */

public class MyShoppingListApp extends Application {

    private static MyShoppingListApp INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        Timber.plant(new Timber.DebugTree());
        RealmConfiguration realmConfig = new RealmConfiguration.Builder(this).build();
        Realm.setDefaultConfiguration(realmConfig);
    }

    public static MyShoppingListApp get() {
        return INSTANCE;
    }
}

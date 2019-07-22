package com.example.realmdatabase.Base;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import io.realm.Realm;
import io.realm.RealmConfiguration;

import static io.realm.Realm.init;
import static io.realm.Realm.setDefaultConfiguration;

public class App extends Application {

    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().name("test.realm").build();
        setDefaultConfiguration(config);


        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());





       /* init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("Realmtest.db")
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();
        setDefaultConfiguration(config);


        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());*/

      /*  context=this;
        // This is For Display the API Response in Chrome Inspect
        Stetho.initializeWithDefaults(this);*/

    }

    public static Context getContext() {
        return context;
    }
}
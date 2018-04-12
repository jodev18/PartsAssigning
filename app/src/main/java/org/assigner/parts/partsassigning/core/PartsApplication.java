package org.assigner.parts.partsassigning.core;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by MAC on 12/04/2018.
 */

public class PartsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ke7kj29QGuFGbaSaAEWH58rr0ypbNMrSJnl6No1w")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}

package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Registers parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JVu19Q8IwhR1wB9j3MWUywPWiRwO0mu6INcAyYC0")
                .clientKey("uGloTJWVMkfEr22L6Mrqh5haA9StBTLlGdhtiPDF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}


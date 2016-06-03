package com.example.test.myapplication;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import ms.loop.loopsdk.core.ILoopSDKCallback;
import ms.loop.loopsdk.core.LoopSDK;
import ms.loop.loopsdk.signal.Signal;
import ms.loop.loopsdk.util.LoopError;

public class MyApplication extends Application implements ILoopSDKCallback {
    @Override
    public void onCreate() {
        super.onCreate();
        // initialize the Loop SDK: remember to change this to your live appId and appToken in production
        LoopSDK.initialize(this, "looptest2-dev-1ee017d3", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6Imxvb3B0ZXN0Mi1kZXYtMWVlMDE3ZDMiLCJhcHBLZXkiOiIzMDNmNDE4YWUyNTktNGQzMy1iZWJkLTRlZDIyNzNmOTA1MSIsImFsbG93ZWRSb3V0ZXMiOlt7Im1ldGhvZCI6InBvc3QiLCJwYXRoIjoiL3YyLjAvYXBwL2xvb3B0ZXN0Mi1kZXYtMWVlMDE3ZDMvdXNlciJ9LHsibWV0aG9kIjoiZGVsZXRlIiwicGF0aCI6Ii92Mi4wL2FwcC9sb29wdGVzdDItZGV2LTFlZTAxN2QzL3VzZXIifSx7Im1ldGhvZCI6InBvc3QiLCJwYXRoIjoiL3YyLjAvYXBwL2xvb3B0ZXN0Mi1kZXYtMWVlMDE3ZDMvbG9naW4ifSx7Im1ldGhvZCI6ImdldCIsInBhdGgiOiIvdjIuMC9hcHAvbG9vcHRlc3QyLWRldi0xZWUwMTdkMy91c2VyIn1dLCJpYXQiOjE0NjQxMjc3MDQsImlzcyI6Ikxvb3AgQXV0aCB2MiIsInN1YiI6Imxvb3B0ZXN0Mi1kZXYtMWVlMDE3ZDMifQ.27qqQrV4UmH-wW0jjVwdC_ajnvNtYn3IU592mmZK_Fw");
    }

    // called by the Loop SDK on successful initalization
    @Override
    public void onInitialized() {
        Log.d("loop_sdk", "Successfully Initialized");
    }

    // called by the Loop SDK when the provider status changes
    @Override
    public void onServiceStatusChanged(String provider, String status, Bundle bundle) {
        Log.d("loop_sdk", "Provider: " + provider + " status: " + status);
    }

    // called by the Loop SDK when initialization fails
    @Override
    public void onInitializeFailed(LoopError loopError){
        Log.d("loop_sdk", "Loop SDK failed: " + loopError.toString());
    }
}

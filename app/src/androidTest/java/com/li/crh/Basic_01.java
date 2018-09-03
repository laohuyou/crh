package com.li.crh;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Basic_01 {
    Instrumentation instrumentation;
    UiDevice device;

    @Before
    public void device(){
        instrumentation=InstrumentationRegistry.getInstrumentation();
        device= UiDevice.getInstance(instrumentation);
    }
    @Before
    public void sleep(int mint){
        try{
            Thread.sleep(mint);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}

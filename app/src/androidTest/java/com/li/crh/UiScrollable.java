package com.li.crh;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class UiScrollable extends Basic_01 {

    @Before
    public void setUp(){
        device();
    }

    @Test
    public void testDemo1() throws UiObjectNotFoundException {
        android.support.test.uiautomator.UiScrollable scrollable=new android.support.test.uiautomator.UiScrollable(new UiSelector().className("android.widget.ScrollView"));
//        UiScrollable sz=new UiScrollable(new UiSelector().resourceId("com.android.settings:id/dashboard"));
//        scrollable.flingForward();
//        sz.flingForward();
//        scrollable.flingToBeginning(20);
        scrollable.flingToEnd(20);
    }

    @Test/*滚动查找*/
    public void testDemo2() throws UiObjectNotFoundException {
        android.support.test.uiautomator.UiScrollable dingdan=new android.support.test.uiautomator.UiScrollable(new UiSelector().className("android.widget.HorizontalScrollView"));
        UiObject baoxian=dingdan.getChildByText(new UiSelector().className("android.widget.TextView"),"6的飞起",true);
        baoxian.click();
    }


}


package com.baidu.location.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.net.Uri;
import android.os.Vibrator;
import android.util.Log;
import android.widget.ImageView;


import com.baidu.location.app.base.BaseApp;
import com.baidu.location.service.LocationService;
import com.baidu.location.util.UIUtils;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.SDKInitializer;



/**
 * @创建者 Edward
 * @描述 BaseApp的拓展，用于设置其他第三方的初始化
 */
public class MyApp extends BaseApp{
    //全局里面定位的服务只需要一个
    public LocationService locationService;
    //手机振动服务类
    public Vibrator mVibrator;

    @Override
    public void onCreate() {
        super.onCreate();

        locationService = new LocationService(getApplicationContext());
        mVibrator =(Vibrator)getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
        SDKInitializer.initialize(getApplicationContext());

    }

}

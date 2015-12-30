package com.example.root.ourfirstapp.framework.implementation;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.View;

import com.example.root.ourfirstapp.framework.Input;
import com.example.root.ourfirstapp.framework.TouchHandler;

import java.util.List;

/**
 * Created by root on 25/12/15.
 */
public class AndroidInput implements Input {

    TouchHandler touchHandler;

    public AndroidInput(Context context, View view, float scaleX, float scaleY) {
        if(Integer.parseInt(Build.VERSION.SDK) < 5)
            touchHandler = new SingleTouchHandler(view, scaleX, scaleY);
        else
            touchHandler = new MultiTouchHandler(view, scaleX, scaleY);
    }

    @Override
    public boolean isTouchDown(int pointer) {
        return touchHandler.isTouchDown(pointer);
    }

    @Override
    public int getTouchX(int pointer) {
        return touchHandler.getTouchX(pointer);
    }

    @Override
    public int getTouchY(int pointer) {
        return touchHandler.getTouchY(pointer);
    }

    @Override
    public List<TouchEvent> getTouchEvents() {
        return touchHandler.getTouchEvents();
    }
}

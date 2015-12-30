package com.example.root.ourfirstapp.framework;

import android.view.View.OnTouchListener;
import com.example.root.ourfirstapp.framework.Input.TouchEvent;
import java.util.List;

/**
 * Created by root on 25/12/15.
 */
public interface TouchHandler extends OnTouchListener {
    boolean isTouchDown(int pointer);

    int getTouchX(int pointer);

    int getTouchY(int pointer);

    List<TouchEvent> getTouchEvents();
}

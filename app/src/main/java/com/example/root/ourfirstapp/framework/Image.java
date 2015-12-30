package com.example.root.ourfirstapp.framework;

/**
 * Created by root on 25/12/15.
 */
public interface Image {

    int getWidth();
    int getHeight();
    Graphics.ImageFormat getFormat();
    void dispose();
}

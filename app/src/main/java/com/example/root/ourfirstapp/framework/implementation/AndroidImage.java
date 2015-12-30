package com.example.root.ourfirstapp.framework.implementation;

import android.graphics.Bitmap;

import com.example.root.ourfirstapp.framework.Image;
import com.example.root.ourfirstapp.framework.Graphics.ImageFormat;

/**
 * Created by root on 25/12/15.
 */
public class AndroidImage implements Image {

    Bitmap bitmap;
    ImageFormat format;

    public AndroidImage(Bitmap bitmap, ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
package com.example.root.ourfirstapp.framework;

/**
 * Created by root on 25/12/15.
 */
public interface Music {

    void play();

    void stop();

    void pause();

    void setLooping(boolean looping);

    void setVolume(float volume);

    boolean isPlaying();

    boolean isStopped();

    boolean isLooping();

    void dispose();

    void seekBegin();
}

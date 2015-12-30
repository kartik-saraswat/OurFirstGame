package com.example.root.ourfirstapp.framework.implementation;

import android.media.SoundPool;

import com.example.root.ourfirstapp.framework.Sound;

/**
 * Created by root on 25/12/15.
 */
public class AndroidSound implements Sound {

    int soundId;
    SoundPool soundPool;

    public AndroidSound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    @Override
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    @Override
    public void dispose() {
        soundPool.unload(soundId);
    }
}

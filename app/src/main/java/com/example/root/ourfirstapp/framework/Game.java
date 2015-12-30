package com.example.root.ourfirstapp.framework;

/**
 * Created by root on 25/12/15.
 */
public interface Game {

    Audio getAudio();

    Input getInput();

    FileIO getFileIO();

    Graphics getGraphics();

    void setScreen(Screen screen);

    Screen getCurrentScreen();

    Screen getInitScreen();
}

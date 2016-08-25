package br.com.falarsemenrolar.falarsemenrolar;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.provider.MediaStore;

public class AudioPlay {

    private MediaPlayer mediaPlayer;

    private AudioPlay(){
       mediaPlayer = new MediaPlayer();
    }

    public void play(Context context, int id)
    {
        if (mediaPlayer.isPlaying())
            mediaPlayer.stop();

        mediaPlayer = MediaPlayer.create(context,id);

        mediaPlayer.start();
    }

    public static AudioPlay getInstance()
    {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static AudioPlay INSTANCE = new AudioPlay();
    }
}

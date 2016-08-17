package br.com.falarsemenrolar.falarsemenrolar;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlay {

    public static void play(Context context, int id)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, id);

        if (mediaPlayer != null)
            mediaPlayer.start();
    }
}

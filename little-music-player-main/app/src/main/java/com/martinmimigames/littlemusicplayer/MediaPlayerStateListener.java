package com.martinmimigames.littlemusicplayer;

interface MediaPlayerStateListener {

  /**
   * set player playback state
   *
   * @param playing is audio playing
   * @param looping is audio looping
   */
  void setState(boolean playing, boolean looping);

  /**
   * destroy the music player completely
   */
  void onMediaPlayerDestroy();

  /**
   * reset the music player to accept new audio files
   */
  void onMediaPlayerReset();

}

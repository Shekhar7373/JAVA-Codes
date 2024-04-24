package oops.main;

import oops.mediaplayer.MediaPlayer;
import oops.mp3.Mp3Audio;
import oops.waveformaudiofile.WaveformAudioFile;
import oops.windowsmediaaudio.WindowsMediaAudio;

public class MediaplayerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer m1 = new Mp3Audio();
		m1.play();
		m1.pause();
		m1.forward();
		System.out.println(" ");
		m1 = new WindowsMediaAudio();
		m1.rewind();
		m1.pause();
		m1.forward();
		System.out.println(" ");
		m1 = new WaveformAudioFile();
		m1.play();
		m1.forward();
		m1.rewind();
	}

}

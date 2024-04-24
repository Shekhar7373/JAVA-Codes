package oops.waveformaudiofile;
import oops.mediaplayer.*;

public class WaveformAudioFile implements MediaPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("WaveformAudioFile is Playing...!");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("WaveformAudioFile is Paused...!");
	}

	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		System.out.println("WaveformAudioFile is Rewind...!");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("WaveformAudioFile is Forward...!");
	}

}

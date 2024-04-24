package oops.mp3;

import oops.mediaplayer.*;

public class Mp3Audio implements MediaPlayer {
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Mp3 Audio is Playing...!");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Mp3 Audio is Paused...!");
	}

	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		System.out.println("Mp3 Audio is Rewind...!");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("Mp3 Audio is forwarding...!");
	}
}

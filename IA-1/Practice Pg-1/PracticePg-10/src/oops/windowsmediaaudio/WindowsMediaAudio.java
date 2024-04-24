package oops.windowsmediaaudio;
import oops.mediaplayer.*;

public class WindowsMediaAudio implements MediaPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("WindowsMediaAudio is Playing...!");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("WindowsMediaAudio is Paused...!");
	}

	@Override
	public void rewind() {
		// TODO Auto-generated method stub
		System.out.println("WindowsMediaAudio is Rewind...!");
	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println("WindowsMediaAudio is Forward...!");
	}
	
}

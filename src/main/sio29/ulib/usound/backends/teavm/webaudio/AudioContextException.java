package sio29.ulib.usound.backends.teavm.webaudio;

public class AudioContextException extends Exception{
	public AudioContextException(){
		super("Web Audio API is not supported in this browser");
	}
}

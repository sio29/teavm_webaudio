package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface AudioContextBuilder extends JSObject{
	@JSConstructor("AudioContext")
	AudioContext createAudioContext();
	
	@JSConstructor("webkitAudioContext")
	AudioContext createWebkitAudioContext();
	
}

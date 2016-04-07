package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface ConvolverNode extends AudioNode{
	@JSProperty
	void setBuffer(AudioBuffer n);
	
	@JSProperty
	AudioBuffer getBuffer();
	
	@JSProperty
	void setNormalize(boolean n);
	
	@JSProperty
	boolean getNormalize();
}

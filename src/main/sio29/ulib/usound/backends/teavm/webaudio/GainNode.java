package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface GainNode extends AudioNode{
	@JSProperty
	public AudioParam getGain();
}

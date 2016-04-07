package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface DelayNode extends AudioNode{
	@JSProperty
	AudioParam getDelayTime();
}

package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface StereoPannerNode extends AudioNode{
	@JSProperty
	AudioParam getPan();
}

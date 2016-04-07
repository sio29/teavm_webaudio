package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface MediaStreamAudioDestinationNode extends AudioNode{
	@JSProperty
	MediaStream getStream();
}

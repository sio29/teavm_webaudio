package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface AudioDestinationNode extends AudioNode {
	@JSProperty
	/*long*/int getMaxChannelCount();
}

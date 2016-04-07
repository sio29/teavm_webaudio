package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface AudioWorkerNodeCreationEvent extends Event {
	@JSProperty
	AudioWorkerNodeProcessor getNode();
	
	@JSProperty
	JSArray getInputs();
	
	@JSProperty
	JSArray getOutputs();
};

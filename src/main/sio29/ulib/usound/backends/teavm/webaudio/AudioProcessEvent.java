package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;
import org.teavm.dom.typedarrays.*;

public interface AudioProcessEvent extends Event{
	@JSProperty
	double getPlaybackTime();
	
	@JSProperty
	AudioWorkerNodeProcessor getNode();
	
	@JSProperty
	Float32Array[][] getInputs();
	
	@JSProperty
	Float32Array[][] getOutputs();
	
	@JSProperty
	JSObject getParameters();
};
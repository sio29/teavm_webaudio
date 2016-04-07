package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.typedarrays.*;

public interface BiquadFilterNode extends AudioNode{
	@JSProperty
	void setType(/*BiquadFilterType*/String type);

	@JSProperty
	/*BiquadFilterType*/String getType();

	@JSProperty
	AudioParam	   getFrequency();
	
	@JSProperty
	AudioParam	   getDetune();
	
	@JSProperty("Q")
	AudioParam	   getQ();
	
	@JSProperty
	AudioParam	   getGain();
	
	void getFrequencyResponse (Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
}

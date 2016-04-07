package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.typedarrays.*;

public interface AnalyserNode extends AudioNode{
	void getFloatFrequencyData (Float32Array array);
	void getByteFrequencyData (Uint8Array array);
	void getFloatTimeDomainData (Float32Array array);
	void getByteTimeDomainData (Uint8Array array);
	
	@JSProperty
	void setFftSize(/*long*/int size);
	
	@JSProperty
	/*long*/int getFftSize();
	
	@JSProperty
	/*long*/int getFrequencyBinCount();
	
	@JSProperty
	void setMinDecibels(float n);
	
	@JSProperty
	float getMinDecibels();
	
	@JSProperty
	void setMaxDecibels(float n);
	
	@JSProperty
	float getMaxDecibels();
	
	@JSProperty
	void setSmoothingTimeConstant(float n);
	
	@JSProperty
	float getSmoothingTimeConstant();
}

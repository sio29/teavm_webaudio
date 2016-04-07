package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.typedarrays.*;

public interface WaveShaperNode extends AudioNode{
	@JSProperty
	void setCurve(Float32Array n);
	
	@JSProperty
	Float32Array getCurve();
	
	@JSProperty
	void setOversample(/*OverSampleType*/String n);
	
	@JSProperty
	/*OverSampleType*/String getOversample();
}

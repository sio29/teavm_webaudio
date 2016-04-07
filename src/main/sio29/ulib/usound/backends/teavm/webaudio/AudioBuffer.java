package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.typedarrays.*;

public interface AudioBuffer extends JSObject{
	@JSProperty
	float getSampleRate();
	
	@JSProperty
	/*long*/int getLength();
	
	@JSProperty
	double getDuration();
	
	@JSProperty
	/*long*/int getNumberOfChannels();
	
	Float32Array getChannelData(/*long*/int channel);
	
	void copyFromChannel(Float32Array destination, /*long*/int channelNumber, /*long*/int startInChannel);
	void copyFromChannel(Float32Array destination, /*long*/int channelNumber);
	
	void copyToChannel(Float32Array source, /*long*/int channelNumber, /*long*/int startInChannel);
	void copyToChannel(Float32Array source, /*long*/int channelNumber);
};

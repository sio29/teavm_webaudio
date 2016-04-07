package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface AudioWorkerParamDescriptor extends JSObject{
	@JSProperty
	/*DOMString*/String getName();
	
	@JSProperty
	float getDefaultValue();
};
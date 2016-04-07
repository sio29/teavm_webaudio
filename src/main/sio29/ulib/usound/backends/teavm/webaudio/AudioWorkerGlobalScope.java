package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface AudioWorkerGlobalScope extends JSObject{//: DedicatedWorkerGlobalScope {
	@JSProperty
	float getSampleRate();
	
	AudioParam addParameter (/*DOMString*/String name, float defaultValue);
	void	   removeParameter (/*DOMString*/String name);
	
	@JSProperty("onaudioprocess")
	void setOnAudioProcess(EventListener evt);
	
	@JSProperty("onaudioprocess")
	EventListener getOnAudioProcess();
	
	@JSProperty("onnodecreate")
	void setOnNodeCreate(EventListener evt);
	
	@JSProperty("onnodecreate")
	EventListener getOnNodeCreate();
	
	@JSProperty
	AudioWorkerParamDescriptor[] getParameters();
};
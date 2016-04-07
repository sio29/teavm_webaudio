package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface AudioWorker extends JSObject{
	void terminate ();
	//void postMessage (any message, optional sequence<Transferable> transfer);
	void postMessage(Object message,Object... transfer);
	void postMessage(Object message);

	@JSProperty
	AudioWorkerParamDescriptor[] getParameters();
	
	@JSProperty("onmessage")
	void setOnMessage(EventListener evt);
	
	@JSProperty("onmessage")
	EventListener getOnMessage();
	
	@JSProperty("onloaded")
	void setOnLoaded(EventListener evt);
	
	@JSProperty("onloaded")
	EventListener getOnLoaded();
	
	
	AudioWorkerNode createNode (int numberOfInputs, int numberOfOutputs);
	AudioParam addParameter(/*DOMString*/String name, float defaultValue);
	void removeParameter(/*DOMString*/String name);

}

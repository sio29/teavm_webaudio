package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface AudioWorkerNodeProcessor extends JSObject{//: EventTarget {
	//void postMessage (any message, optional sequence<Transferable> transfer);
	void postMessage(Object message,Object... transfer);
	void postMessage(Object message);
	
	@JSProperty("onmessage")
	void setOnMessage(EventListener evt);
	
	@JSProperty("onmessage")
	EventListener getOnMessage();
};
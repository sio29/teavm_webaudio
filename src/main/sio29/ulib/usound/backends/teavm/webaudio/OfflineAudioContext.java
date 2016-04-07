package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface OfflineAudioContext extends AudioContext {
	AudioBuffer startRendering ();
	void resume ();
	void suspend (double suspendTime);
	
	@JSProperty("oncomplete")
	void setOnComplete(EventListener evt);
	
	@JSProperty("oncomplete")
	EventListener getOnComplete();
	
};
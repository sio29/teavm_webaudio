package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface ScriptProcessorNode extends AudioNode{
	@JSProperty("onaudioprocess")
	EventListener getOnAudioProcess();
	
	@JSProperty("onaudioprocess")
	void setOnAudioProcess(EventListener evt);
	
	@JSProperty
	/*long*/int getBufferSize();
	
}

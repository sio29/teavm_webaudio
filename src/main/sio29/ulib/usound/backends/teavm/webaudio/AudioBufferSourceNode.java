package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface AudioBufferSourceNode extends AudioNode{
	@JSProperty
	AudioBuffer getBuffer();
	
	@JSProperty
	void setBuffer(AudioBuffer buffer);
	
	@JSProperty
	AudioParam   getPlaybackRate();
	
	@JSProperty
	AudioParam   getDetune();
	
	@JSProperty
	boolean	  getLoop();
	
	@JSProperty
	void setLoop(boolean loop);
	
	@JSProperty
	double getLoopStart();
	@JSProperty
	void setLoopStart(double start);
	
	@JSProperty
	double getLoopEnd();
	
	@JSProperty
	void setLoopEnd(double end);
	
	void start (double when, double offset, double duration);
	void start (double when, double offset);
	void start (double when);
	void start ();
	void stop (double when);
	void stop ();
	
	@JSProperty("onended")
	void setOnEnded(EventListener ent);
	
	@JSProperty("onended")
	EventListener getOnEnded();
	
}

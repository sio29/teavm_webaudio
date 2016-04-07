package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface OscillatorNode extends AudioNode{
	@JSProperty
	void setType(/*OscillatorType*/String type);
	
	@JSProperty
	/*OscillatorType*/String getType();
	
	@JSProperty
	AudioParam getFrequency();
	
	@JSProperty
	AudioParam getDetune();
	
	void start(double when);
	void start();
	void stop(double when);
	void stop();
	void setPeriodicWave(PeriodicWave periodicWave);
	
	@JSProperty("onended")
	void setOnEnded(EventListener listener);
	
	@JSProperty("onended")
	EventListener getOnEnded();
	
}

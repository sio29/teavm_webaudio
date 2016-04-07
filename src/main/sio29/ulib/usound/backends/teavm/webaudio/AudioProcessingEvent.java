package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface AudioProcessingEvent extends Event{
	@JSProperty
	double getPlaybackTime();
	
	@JSProperty
	AudioBuffer getInputBuffer();
	
	@JSProperty
	AudioBuffer getOutputBuffer();
};
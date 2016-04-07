package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.events.*;

public interface OfflineAudioCompletionEvent extends Event {
	@JSProperty
	AudioBuffer getRenderedBuffer();
};
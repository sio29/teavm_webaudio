package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface AudioNode extends JSObject{
	void connect (AudioNode destination, /*long*/int output  , /*long*/int input );
	void connect (AudioNode destination, /*long*/int output);
	void connect (AudioNode destination);
	void connect (AudioParam destination, /*long*/int output );
	void connect (AudioParam destination);
	void disconnect ();
	void disconnect (/*long*/int output);
	void disconnect (AudioNode destination);
	void disconnect (AudioNode destination, /*long*/int output);
	void disconnect (AudioNode destination, /*long*/int output, /*long*/int input);
	void disconnect (AudioParam destination);
	void disconnect (AudioParam destination, /*long*/int output);

	@JSProperty
	AudioContext getContext();

	@JSProperty
	/*long*/int getNumberOfInputs();

	@JSProperty
	/*long*/int getNumberOfOutputs();

	@JSProperty
	/*long*/int getChannelCount();

	@JSProperty
	/*ChannelCountMode*/String getChannelCountMode();

	@JSProperty
	/*ChannelInterpretation*/String getChannelInterpretation();
};

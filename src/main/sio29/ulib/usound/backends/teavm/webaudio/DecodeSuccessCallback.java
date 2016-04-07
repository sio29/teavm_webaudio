package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

@JSFunctor
public interface DecodeSuccessCallback extends JSObject {
	void onSuccess(AudioBuffer decodedData);
}

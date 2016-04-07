package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

@JSFunctor
public interface DecodeErrorCallback extends JSObject {
	void onError(/*DOMException*/JSObject error);
}

package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public abstract class PeriodicWaveConstraintsBuilder implements JSObject{
	@JSBody(params={},script="var t=new Object();t.disableNormalization=false;return r;")
	public static native PeriodicWaveConstraints createPeriodicWaveConstraints();
}

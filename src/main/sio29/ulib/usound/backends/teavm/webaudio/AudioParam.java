package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.typedarrays.*;

public interface AudioParam extends JSObject{
	@JSProperty
	float getValue();
	
	@JSProperty
	void setValue(float n);

	@JSProperty
	float getDdefaultValue();
	
	void setValueAtTime (float value, double startTime);
	void linearRampToValueAtTime (float value, double endTime);
	void exponentialRampToValueAtTime (float value, double endtime);
	void setTargetAtTime (float target, double startTime, float timeConstant);
	void setValueCurveAtTime (Float32Array values, double startTime, double duration);
	void cancelScheduledValues (double startTime);

}

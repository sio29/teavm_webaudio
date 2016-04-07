package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

/*
dictionary PeriodicWaveConstraints {
*/
public interface PeriodicWaveConstraints extends JSObject{
/*
    boolean disableNormalization = false;
*/
	@JSProperty
    void setDisableNormalization(boolean n);
	
	@JSProperty
    boolean getDisableNormalization();
}




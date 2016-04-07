package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface AudioListener extends JSObject{
	@JSProperty
	void setDopplerFactor(float n);
	
	@JSProperty
	float getDopplerFactor();
	
	@JSProperty
	void setSpeedOfSound(float n);
	
	@JSProperty
	float getSpeedOfSound();
	
	void setPosition (float x, float y, float z);
	void setOrientation (float x, float y, float z, float xUp, float yUp, float zUp);
	void setVelocity (float x, float y, float z);

}

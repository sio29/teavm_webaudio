package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface PannerNode extends AudioNode{
	@JSProperty
	void setPanningModel(/*PanningModelType*/String n);
	
	@JSProperty
	/*PanningModelType*/String getPanningModel();
	
	void setPosition (float x, float y, float z);
	void setOrientation (float x, float y, float z);
	void setVelocity (float x, float y, float z);
	
	@JSProperty
	void setDistanceModel(/*DistanceModelType*/String n);
	
	@JSProperty
	/*DistanceModelType*/String getDistanceModel();
	
	@JSProperty
	void setRefDistance(float n);

	@JSProperty
	float getRefDistance();

	@JSProperty
	void setMaxDistance(float n);

	@JSProperty
	float getMaxDistance();

	@JSProperty
	void setRolloffFactor(float n);

	@JSProperty
	float getRolloffFactor();

	@JSProperty
	void setConeInnerAngle(float n);

	@JSProperty
	float getConeInnerAngle();

	@JSProperty
	void setConeOuterAngle(float n);

	@JSProperty
	float getConeOuterAngle();

	@JSProperty
	void setConeOuterGain(float n);

	@JSProperty
	float getConeOuterGain();
}

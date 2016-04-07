package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;

public interface DynamicsCompressorNode extends AudioNode{
	@JSProperty
	AudioParam getThreshold();
	
	@JSProperty
	AudioParam getKnee();
	
	@JSProperty
	AudioParam getRatio();
	
	@JSProperty
	float getReduction();
	
	@JSProperty
	AudioParam getAttack();
	
	@JSProperty
	AudioParam getRelease();
}

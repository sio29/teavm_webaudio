package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;
import org.teavm.dom.html.*;
import org.teavm.dom.events.*;
import org.teavm.dom.typedarrays.*;

public interface AudioContext extends JSObject{
	@JSProperty
	public AudioDestinationNode getDestination();
	
	@JSProperty
	public float getSampleRate();
	
	@JSProperty
	public double getCurrentTime();
	
	@JSProperty
	public AudioListener getListener();
	
	@JSProperty
	public String getState();
	
	void suspend ();
	void resume ();
	void close ();
	
	@JSProperty("onstatechange")
	void setOnStateChange(EventListener listenerr);
	
	@JSProperty("onstatechange")
	EventListener getOnStateChange();
	
	AudioBuffer createBuffer(/*long*/int numberOfChannels, /*long*/int length, float sampleRate);
	
	AudioBuffer decodeAudioData (ArrayBuffer audioData, DecodeSuccessCallback successCallback, DecodeErrorCallback errorCallback);
	AudioBuffer decodeAudioData (ArrayBuffer audioData, DecodeSuccessCallback successCallback/*, DecodeErrorCallback errorCallback*/);
	AudioBuffer decodeAudioData (ArrayBuffer audioData/*, DecodeSuccessCallback successCallback, DecodeErrorCallback errorCallback*/);
	
	AudioBufferSourceNode createBufferSource ();
	
	MediaElementAudioSourceNode createMediaElementSource (HTMLMediaElement mediaElement);
	
	MediaStreamAudioSourceNode createMediaStreamSource (MediaStream mediaStream);
	
	MediaStreamAudioDestinationNode createMediaStreamDestination ();
	
	AudioWorker createAudioWorker ();
	
	ScriptProcessorNode createScriptProcessor (/*long*/int bufferSize ,/*long*/int numberOfInputChannels, /*long*/int numberOfOutputChannels);
	ScriptProcessorNode createScriptProcessor (/*long*/int bufferSize ,/*long*/int numberOfInputChannels);
	ScriptProcessorNode createScriptProcessor (/*long*/int bufferSize );
	ScriptProcessorNode createScriptProcessor ();
	
	AnalyserNode createAnalyser ();
	
	GainNode createGain ();
	
	DelayNode createDelay (double maxDelayTime);
	DelayNode createDelay ();
	
	BiquadFilterNode createBiquadFilter ();
	
	IIRFilterNode createIIRFilter (Float32Array feedforward, Float32Array feedback);
	
	WaveShaperNode createWaveShaper ();
	
	PannerNode createPanner ();
	
	StereoPannerNode createStereoPanner ();
	
	ConvolverNode createConvolver ();
	
	ChannelSplitterNode createChannelSplitter (/*long*/int numberOfOutputs );
	ChannelSplitterNode createChannelSplitter ();
	
	ChannelMergerNode createChannelMerger (/*long*/int numberOfInputs );
	ChannelMergerNode createChannelMerger ();
	
	DynamicsCompressorNode createDynamicsCompressor ();
	
	OscillatorNode createOscillator ();
	
	PeriodicWave createPeriodicWave (Float32Array real, Float32Array imag, PeriodicWaveConstraints constraints);
	PeriodicWave createPeriodicWave (Float32Array real, Float32Array imag);
}


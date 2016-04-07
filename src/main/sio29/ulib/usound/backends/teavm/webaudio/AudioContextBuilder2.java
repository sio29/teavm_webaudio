package sio29.ulib.usound.backends.teavm.webaudio;

import org.teavm.jso.*;


public class AudioContextBuilder2{
	@JSBody(params={} , script=
		"try{"+
//"return null;"+
			"return new webkitAudioContext();"+
		"}catch(e){"+
			"try{"+
				"return new AudioContext();"+
			"}catch(e){"+
				//"throw \"Web Audio API is not supported in this browser\";"+
				"return null;"+
			"}"+
		"}"
	)
	private static native AudioContext createAudioContextSub();
	//public static AudioContext createAudioContext() throws Exception {
	public static AudioContext createAudioContext() throws AudioContextException {
		AudioContext context=createAudioContextSub();
		if(context!=null){
			return context;
		}else{
			//throw new Exception("Web Audio API is not supported in this browser");
			throw new AudioContextException();
		}
	}
	
}

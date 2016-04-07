package sio29.ulib.usound.backends.teavm.webaudio.test;

import org.teavm.jso.*;
import org.teavm.dom.html.*;
import org.teavm.dom.browser.*;

import sio29.ulib.usound.backends.teavm.webaudio.*;


public class WebAudioTest {
	private static Window window = (Window)JS.getGlobal();
	private static HTMLDocument document = window.getDocument();
	
	public static void main(String[] args) {
System.out.println("TeaVM ---- start");
		AudioContext audioctx=null;
		try{
System.out.println("TeaVM ---- 0111");
			audioctx=AudioContextBuilder2.createAudioContext();
System.out.println("state:"+audioctx.getState());
System.out.println("sampleRate:"+audioctx.getSampleRate());
System.out.println("currentTime:"+audioctx.getCurrentTime());
			GainNode gain=audioctx.createGain();
System.out.println("gain----");
//			int ni=gain.getNumberOfInputs();
System.out.println("numberOfInputs:"+gain.getNumberOfInputs());
System.out.println("numberOfOutputs:"+gain.getNumberOfOutputs());
System.out.println("channelCount:"+gain.getChannelCount());
System.out.println("channelCountMode:"+gain.getChannelCountMode());
System.out.println("channelInterpretation:"+gain.getChannelInterpretation());

		}catch(Exception ex){
			ex.printStackTrace();
		}
System.out.println("TeaVM ---- end");
	}
}


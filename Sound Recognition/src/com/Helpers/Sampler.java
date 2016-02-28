package com.Helpers;

import java.awt.Component;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JFileChooser;

public class Sampler {
	private File file = null;
	private final JFileChooser fileChooser = new JFileChooser();
	
	
	public Sampler(String path){
		this.file =  new File(path);
	}
	public Sampler(){
		
	}
	
	public void readAudioBytes(){
		int totalFramesRead = 0;
		try{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.file);
			int bytesPerFrame = audioInputStream.getFormat().getFrameSize();
			if(bytesPerFrame == AudioSystem.NOT_SPECIFIED){
				bytesPerFrame = 1;
			}
			
			int numberOfBytes = 1024 * bytesPerFrame;
			byte[] audioBytes = new byte[numberOfBytes];
			
			try{
				int numberOfBytesRead = 0;
				int numberOfFramesRead = 0;
				//Read bytes from file
				while((numberOfBytesRead = audioInputStream.read(audioBytes)) != -1){
					numberOfFramesRead = numberOfBytesRead/bytesPerFrame;
					totalFramesRead += numberOfFramesRead;
//						for(byte i:audioBytes){
//							System.out.print(i + " ");
//						}
//						System.out.println();
					Log.console("Read Frames: " + totalFramesRead);
					Log.console("First byte: "+ audioBytes[0]);
				}
			}catch(Exception ex){
				
			}
			
		}catch(Exception e){
			
		}
	}
	
	public void pickFile(){
		Component comp = null;
		fileChooser.showOpenDialog(comp);
		this.file = fileChooser.getSelectedFile();
	}
}

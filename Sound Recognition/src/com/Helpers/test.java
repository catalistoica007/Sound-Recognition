package com.Helpers;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test {
	public static void main(String args[]){
		//Sampler sampler = new Sampler("C:\\Users\\Catalin\\Downloads\\Yamaha-TG100-Whistle-C5.wav");
		Sampler sampler = new Sampler();
//		sampler.pickFile();
//		sampler.readAudioBytes();
		JFrame frame = new JFrame("Test");
		JPanel pannel = new JPanel(new GridBagLayout());
		
		JLabel label = new JLabel("This is a label");
		JButton openButton = new JButton("Open");
		JButton playButton = new JButton("Play");
		
		pannel.add(label);
		pannel.add(openButton);
		pannel.add(playButton);
		frame.add(pannel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

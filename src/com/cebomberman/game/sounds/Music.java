package com.cebomberman.game.sounds;

import java.applet.*;
import javax.swing.*;
import java.net.*;

public class Music extends JApplet {
	private AudioClip song; // Sound player
	private URL songPath; // Sound path

	public Music(String filename) {
		try {
			songPath = new URL(getCodeBase(), filename); // Get the Sound URL
			song = Applet.newAudioClip(songPath); // Load the Sound
		} catch (Exception e) {
		} // Satisfy the catch
	}

	public void playSound() {
		song.loop(); // Play
	}

	public void stopSound() {
		song.stop(); // Stop
	}

	public void playSoundOnce() {
		song.play(); // Play only once
	}
}
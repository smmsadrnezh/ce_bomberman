package com.cebomberman.game.graphics;

import javax.swing.JLabel;

import com.cebomberman.game.gameplay.BoxCell;

/**
 * 
 * @author
 * 
 */
public class CellGraphics extends JLabel {
	private String content;
	private boolean isFired;

	public BoxCell box = new BoxCell();

	public CellGraphics() {

	}

	public boolean isFired() {
		return isFired;
	}

	public boolean isBlocked() {
		if (getContent() == "block" || getContent() == "box"
				|| getContent() == "bomb") {
			return true;
		}
		return false;
	}

	public void setIsFired(boolean isFired) {
		this.isFired = isFired;
	}

	/**
	 * 
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
}

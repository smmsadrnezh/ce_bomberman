package com.cebomberman.game.gameplay;

import java.util.ArrayList;

/**
 * 
 * @author
 *
 */
public class BoxCell {
	String boxContent;
	ArrayList<String> playerAbility = new ArrayList<>();
	
	BoxCell(){
		
	}
	public boolean isOpened(){
//		if (condition) {
//			return true ;
//		}
//		else
//			return false;
	}
	private void speedup(){
		// speeddown
		player[].playerAbility.add("speedup");
	}
	private void bombNumberIncrement(){
		this.playerAbility.add("bombNumberIncrement");
	}
	private void bombStrenghtIncrement(){
		this.playerAbility.add("bombStrenghtIncrement");
	}
	private void addLife(){
		this.playerAbility.add("addLife");
	}
	private void passingAbility(){
		this.playerAbility.add("passingAbility");
	}
	private void invertArrowKeys(){
		this.playerAbility.add("invertArrowKeys");
//		????????
	}
	private void loseLastAbility(){
		switch (this.playerAbility.get(this.boxContent.size()-1)) {
		case speedup:
			player[].playerLogic.speed--;
			this.boxContent.remove(this.boxContent.size()-1);
			break;
		case bombNumberIncrement:
			player[].playerLogic.bombNumber--;
			this.boxContent.remove(this.boxContent.size()-1);
			break;
		case bombStrenghtIncrement:
			player[].playerLogic.bombStrenght--;
			this.boxContent.remove(this.boxContent.size()-1);
			break;
		case addLife:
			player[].playerLogic.life--;
			this.boxContent.remove(this.boxContent.size()-1);
			break;
		case passingAbility:
			return this.playerAbility.get(this.boxContent.size()-2)
			break;
		case invertArrowKeys:
			return this.playerAbility.get(this.boxContent.size()-2)
			break;
		}
		
	}
	private void loseBombingAbility(){
	
	}
}

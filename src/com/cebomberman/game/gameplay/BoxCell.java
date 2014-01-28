package com.cebomberman.game.gameplay;

import java.util.ArrayList;

/**
 * 
 * @author
 * 
 */
public class BoxCell {
	private String content;
	ArrayList<String> playerAbility = new ArrayList<>();
	private boolean isOpened = false;

	private String speedImagePath;
	private String lifeImagePath;
	private String bombNumberImagePath;
	private String bombStrengthImagePath;
	private String passingAbilityImagePath;
	private String invertArrowKeysImagePath;
	private String loseLastAbilityImagePath;
	private String loseBombingAbilityImagePath;

	public BoxCell() {
		speedImagePath = "images/speed.gif";
		lifeImagePath = "images/life.gif";
		bombNumberImagePath = "images/bombnumber.gif";
		bombStrengthImagePath = "images/bombpower.gif";
		passingAbilityImagePath = "images/passingability.gif";
		invertArrowKeysImagePath = "images/invertkey.gif";
		loseLastAbilityImagePath = "images/loseability.gif";
		loseBombingAbilityImagePath = "images/bombdisable.gif";

	}

	public String getSpeedImagePath() {
		return speedImagePath;
	}

	public String getLifeImageePath() {
		return getLifeImagePath();
	}

	public boolean isOpened() {
		return isOpened;
	}

	public void setIsOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLifeImagePath() {
		return lifeImagePath;
	}

	public void setLifeImagePath(String lifeImagePath) {
		this.lifeImagePath = lifeImagePath;
	}

	public String getBombNumberImagePath() {
		return bombNumberImagePath;
	}

	public void setBombNumberImagePath(String bombNumberImagePath) {
		this.bombNumberImagePath = bombNumberImagePath;
	}

	public String getBombStrengthImagePath() {
		return bombStrengthImagePath;
	}

	public void setBombStrengthImagePath(String bombStrengthImagePath) {
		this.bombStrengthImagePath = bombStrengthImagePath;
	}

	public String getPassingAbilityImagePath() {
		return passingAbilityImagePath;
	}

	public void setPassingAbilityImagePath(String passingAbility) {
		this.passingAbilityImagePath = passingAbility;
	}

	public String getInvertArrowKeysImagePath() {
		return invertArrowKeysImagePath;
	}

	public void setInvertArrowKeysImagePath(String invertArrowKeysImagePath) {
		invertArrowKeysImagePath = invertArrowKeysImagePath;
	}

	public String getLoseLastAbilityImagePath() {
		// TODO Auto-generated method stub
		return loseLastAbilityImagePath;
	}

	public String getLoseBombingAbility() {
		return loseBombingAbilityImagePath;
	}

	public void setLoseBombingAbility(String loseBombingAbility) {
		this.loseBombingAbilityImagePath = loseBombingAbility;
	}

	// private void speedup(){
	// // speeddown
	// player[].playerAbility.add("speedup");
	// }
	// private void bombNumberIncrement(){
	// this.playerAbility.add("bombNumberIncrement");
	// }
	// private void bombStrenghtIncrement(){
	// this.playerAbility.add("bombStrenghtIncrement");
	// }
	// private void addLife(){
	// this.playerAbility.add("addLife");
	// }
	// private void passingAbility(){
	// this.playerAbility.add("passingAbility");
	// }
	// private void invertArrowKeys(){
	// this.playerAbility.add("invertArrowKeys");
	// // ????????
	// }
	// private void loseLastAbility(){
	// switch (this.playerAbility.get(this.boxContent.size()-1)) {
	// case speedup:
	// player[].playerLogic.speed--;
	// this.boxContent.remove(this.boxContent.size()-1);
	// break;
	// case bombNumberIncrement:
	// player[].playerLogic.bombNumber--;
	// this.boxContent.remove(this.boxContent.size()-1);
	// break;
	// case bombStrenghtIncrement:
	// player[].playerLogic.bombStrenght--;
	// this.boxContent.remove(this.boxContent.size()-1);
	// break;
	// case addLife:
	// player[].playerLogic.life--;
	// this.boxContent.remove(this.boxContent.size()-1);
	// break;
	// case passingAbility:
	// return this.playerAbility.get(this.boxContent.size()-2)
	// break;
	// case invertArrowKeys:
	// return this.playerAbility.get(this.boxContent.size()-2)
	// break;
	// }
	//
	// }
	// private void loseBombingAbility(){
	//
	// }
}

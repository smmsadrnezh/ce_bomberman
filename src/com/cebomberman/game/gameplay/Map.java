package com.cebomberman.game.gameplay;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Map {

	private static String[][] map;
	private int mapWidth;
	private int mapHeight;
	String mapName;
	BufferedReader mapStream = null;

	/**
	 * This method read map file and put cells in an array.
	 * 
	 * @param fileLocation
	 *            location of map file
	 */

	public void mapCellReader(String fileLocation) {
		String[] mapDimension;
		String dimTemp;
		// read file element in a loop
		try {
			mapStream = new BufferedReader(new FileReader(fileLocation));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String lineTemp = " ";
		String[] mapCharacterTemp;

		try {
			this.mapName = mapStream.readLine();
			dimTemp = mapStream.readLine();
			mapDimension = dimTemp.split(" ");
			this.setMapWidth(Integer.parseInt(mapDimension[0]));
			this.setMapHeight(Integer.parseInt(mapDimension[1]));
			// this.mapWidth = Integer.parseInt(mapStream.readLine());
			// this.map = new String[getMapWidth()][getMapHeight()];
			this.map = new String[this.mapWidth][this.mapHeight];
			// int i=0;
			// int j=0 ;
			// lineTemp = mapStream.readLine();
			for (int i = 0; i < this.mapWidth; i++) {
				lineTemp = mapStream.readLine();
				for (int j = 0; j < this.mapHeight; j++) {

					switch (lineTemp.charAt(j)) {
					case 'b':
						this.map[i][j] = "box";
						break;
					case 'o':
						this.map[i][j] = "empty";
						break;
					case 'B':
						this.map[i][j] = "block";
						break;
					case 'h':
						this.map[i][j] = "hole";
						break;
					case 'S':
						this.map[i][j] = "startPoint";
						break;

					}
				}
				// lineTemp = mapStream.readLine();
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void holeMaker() {
		// TODO Auto-generated method stub
	}

	public int getMapWidth() {
		return mapWidth;
	}

	public void setMapWidth(int mapWidth) {
		this.mapWidth = mapWidth;
	}

	public int getMapHeight() {
		return mapHeight;
	}

	public void setMapHeight(int mapHeight) {
		this.mapHeight = mapHeight;
	}

	public static String getMap(int x, int y) {
		return map[x][y];
	}

}
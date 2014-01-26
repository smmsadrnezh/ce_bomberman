package com.cebomberman.game.gameplay;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Map {

	private static String[][] map;
	int mapWidth;
	int mapHeight;
	String mapName;
	BufferedReader mapStream = null;

	/**
	 * This method read map file and put cells in an array.
	 * 
	 * @param fileLocation
	 *            location of map file
	 */

	void mapCellReader(String fileLocation) {
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
			this.mapHeight = Integer.parseInt(mapStream.readLine());
			this.mapWidth = Integer.parseInt(mapStream.readLine());
			this.mapName = mapStream.readLine();
			this.map = new String[mapWidth][mapHeight];

			while ((lineTemp = mapStream.readLine()) != null) {
				mapCharacterTemp = lineTemp.split("");
				for (int i = 0; i < this.mapHeight; i++) {
					for (int j = 0; j < this.mapWidth; j++) {
						switch (mapCharacterTemp[i]) {
						case "b":
							this.map[i][j] = "box";
							break;
						case "o":
							this.map[i][j] = "empty";
							break;
						case "B":
							this.map[i][j] = "block";
							break;
						case "h":
							this.map[i][j] = "hole";
							break;
						case "S":
							this.map[i][j] = "startPoint";
						}
					}
				}
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void holeMaker() {
		// TODO Auto-generated method stub

	}
}
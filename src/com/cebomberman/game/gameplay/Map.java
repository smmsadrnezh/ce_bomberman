package com.cebomberman.game.gameplay;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class Map {

	private static String[][] map;
	int mapWidth;
	int mapHeight;
	String mapName;
	BufferedReader mapStream = null;

	public Map() {
		this.mapHeight = mapHeightReader();
		this.mapWidth = mapWidthReader();
		this.map = new String[mapWidth][mapHeight];
	}

	/**
	 * This method read height size from map files.
	 * 
	 * @return height size
	 */
	int mapHeightReader() {
		int height = 5;
		return height;
	}

	/**
	 * This method read width size from map files.
	 * 
	 * @return width size
	 */
	int mapWidthReader() {
		int width = 5;
		return width;
	}

	/**
	 * This method read cells contents from map file and save them in an array.
	 * 
	 * @return map array
	 * @throws FileNotFoundException
	 */
	void mapCellReader(String fileLocation) {
		// read file element in a loop
		mapStream = new BufferedReader(new FileReader(fileLocation));
		String lineTemp = " ";
		String[] mapCharacterTemp;

		this.mapHeight = Integer.parseInt(mapStream.readLine());
		this.mapWidth = Integer.parseInt(mapStream.readLine());
		this.mapName = mapStream.readLine();

		while ((lineTemp = mapStream.readLine()) != null) {
			mapCharacterTemp = lineTemp.split("");
			for (int i = 0; i < this.mapHeight; i++) {
				for (int j = 0; j < this.mapWidth; j++) {
					switch (mapCharacterTemp[i]) {
					case "b":
						this.map[i][j] = new BoxCell();
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
	}

	public static void holeMaker() {
		// TODO Auto-generated method stub

	}
}

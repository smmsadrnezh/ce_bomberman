package com.cebomberman.game.gameplay;

import java.io.FileReader;
import java.lang.reflect.Array;

public class Map {

	Array[][] map;
	int mapWidth;
	int mapHeight;
	FileReader inputStream = null;

	public Map(String mapFileLocation) {
		this.mapHeight = mapHeightReader();
		this.mapWidth = mapWidthReader();
		this.map = new Array[mapWidth][mapHeight];
		this.map = mapCellReader(mapFileLocation);
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
	 */
	Array[][] mapCellReader(String fileLocation) {

		for (Array[] column : map) {
			for (Array element : column) {

				// read file element in a loop
				 mapStream = new FileReader(fileLocation);
				 
				// skip width and height and map name lines
				// ????
				 
				// while (mapStream.read()!=null) {
				// switch (mapStream.read()) {
				// case b:
				// element = new Box;
				// break;
				// case o:
				// element = empty;
				// break;
				// case B:
				// element = block;
				// break;
				// case h:
				// element = hole;
				// break;
				// case S:
				// element = startPoint;
				// break;
				// }
				// }
			}
		}
		return map;
	}

	public static void holeMaker() {
		// TODO Auto-generated method stub
		
	}
}

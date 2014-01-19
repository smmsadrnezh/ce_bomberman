package com.cebomberman.game.controler;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.cebomberman.game.graphics.GameStarter;
import com.cebomberman.game.graphics.MainBoardGraphics;

public class Main {
	public static void main(String[] args) {
		MainBoardGraphics test = new MainBoardGraphics();
		
		
	    try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }

    new GameStarter().setVisible(true); //Create and show the GUI.
		
		test.fireEffect(3, 11, 4);
	}
}

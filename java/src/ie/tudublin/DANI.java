package ie.tudublin;

import java.util.ArrayList;
//import java.util.Array;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
	

	public void loadFile(){
		String[] lines = loadStrings("small.txt");
		for (String line : lines) {
			String[] words = split(line, ' ');
			
		}
	}

	public boolean findWord(String str){
		return false;
	}
}

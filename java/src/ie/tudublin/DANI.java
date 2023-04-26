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
	//Follow class
	public class Follow {
		private String word;
		private int count;

		public Follow(String word, int count){ //Constructor
			this.word =  word;
			this.count = count;
		}

		public String getWord() { //Accessor method
			return word;
		}

		public int getCount(){
			return count;
		}

		public void incrementCount() {
			count++;
		}

		//toString method
		public String toString() {
			return word + " " + count;
		}
	}

	public class Word {
		private String word;
		private ArrayList follow;

		public Word(String word, ArrayList follow){
			this.word = word;
			this.follow = follow;
		}

		public String getword(){ //Accessor method
			return word;
		}

		public String toString() {
			return word + " " + follow;
		}
	}

	/* 
	public void loadFile()
	{
		Table t = loadTable("tasks.csv", "header");
		for (TableRow r:t.rows())
		{
			DANI n = new DANI(this, r);
			DANI.add(n);
		}
	}
	*/
}

/*  2. write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores 
 * and search for the batsman name and display his score.
 */
package com.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class CricketScores
{
	 public static void main(String[] args) 
	 {
	        // Create a Map to store cricketer names and scores
	        Map<String, Integer> cricketScores = new HashMap<>();

	        // Populate the Map with cricketer names and scores
	        cricketScores.put("Virat Kohli", 100);
	        cricketScores.put("Rohit Sharma", 85);
	        cricketScores.put("Yuvraj Singh", 70);
	        cricketScores.put("Doni", 95);
	        cricketScores.put("Sachin Tendulkar", 80);

	        // Search for a batsman's name and display his score
	        String batsmanName = "Virat Kohli";
	        if (cricketScores.containsKey(batsmanName)) {
	            int score = cricketScores.get(batsmanName);
	            System.out.println(batsmanName + " scored " + score + " runs.");
	        } else {
	            System.out.println("Batsman not found in records.");
	        }
	 }
}

/***********************OUTPUT********************************************

Virat Kohli scored 100 runs.

*/

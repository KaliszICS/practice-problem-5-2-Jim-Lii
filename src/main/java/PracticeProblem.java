/*
File Name: Arrays, Searching, Copying, Deleting
Author: Jim Li
Date Created: May 1, 2026
Date Last Modified: May 1, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int findValue(int num, int[] array){
		int numIndex = -1;
		int i = 0;
		while (numIndex == -1 && i < array.length){
			if (array[i] == num){
				numIndex = i;
			}
			i++;
		}
		return numIndex;
	}

	public static int findThirdValue(String str, String[] array){
		int strIndex = -1, counter = 0, i = 0;
		while (strIndex == -1 && counter < 3 && i < array.length){
			if (array[i] == str){
				counter++;
			}
			if (counter == 3){
				strIndex = i;
			}
			i++;
		}
		return strIndex;
	}

	public static double[] append(double num, double[] array){
		double[] array2 = new double[array.length + 1];
		for (int i = 0; i < array.length; i++){
			array2[i] = array[i];
		}
		array2[array.length] = num;
		return array2;
	}
}

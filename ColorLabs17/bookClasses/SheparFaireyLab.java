
/**
 * Write a description of class SheparFaireyLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    public static void main(String[] args)
	{

		 //relative path
         Picture pog1 = new Picture("images/download.jpg");

		 //makes array of pixels
		 Pixel[] pixels;

		 //gets pixels from picture and assigns to pixels array
		 pixels = pog1.getPixels();

         //method 1 change

         int gray1, gray2, gray3, result;
		 for (Pixel spot : pixels)
		 {
		 		gray1 = spot.getRed();
		 		gray2 = spot.getGreen();
		 		gray3 = spot.getBlue();
		 		result = (gray1 + gray2 + gray3)/3;
		 		gray1 = result;
		 		gray2 = result;
		 		gray3 = result;
		 		spot.setColor(new Color(gray1,gray2,gray3));
		}
		pog1.explore();

        //method 2 change


        //custom color palette


    }//main
}//class

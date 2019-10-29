
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
		 Picture pog2 = new Picture("images/download.jpg");
		 //makes array of pixels
		 Pixel[] pixels;
		 Pixel[] pixels2;
		 //gets pixels from picture and assigns to pixels array
		 pixels = pog1.getPixels();
		 pixels2 = pog2.getPixels();
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
		int red, green, blue;
		for (Pixel pixelObj : pixels)
		{
				red = pixelObj.getRed();
				green = pixelObj.getGreen();
				blue = pixelObj.getBlue();
				if (red <= 64 && green <= 64 && blue <= 64)
				{
					pixelObj.setRed(50);
					pixelObj.setGreen(0);
					pixelObj.setBlue(139);
				}
				else if (red <= 128 && green <= 128 && blue <= 128)
				{
					pixelObj.setRed(255);
					pixelObj.setGreen(0);
					pixelObj.setBlue(0);
				}
				else if (red <= 192 && green <= 192 && blue <= 192)
				{
					pixelObj.setRed(135);
					pixelObj.setGreen(206);
					pixelObj.setBlue(250);
				}
				else if (red >= 192 && green >= 192 && blue >= 192)
				{
					pixelObj.setRed(248);
					pixelObj.setGreen(248);
					pixelObj.setBlue(255);
				}
		}
		pog1.explore();

        //method 2 change
		int gray4, gray5, gray6, result2;
	    for (Pixel spot2 : pixels2)
		{
				gray4 = spot2.getRed();
				gray5 = spot2.getGreen();
				gray6 = spot2.getBlue();
				result2 = (gray4 + gray5 + gray6)/3;
				gray4 = result2;
				gray5 = result2;
				gray6 = result2;
				spot2.setColor(new Color(gray4,gray5,gray6));
		}

		int big = 0, small = 0;
		int red2, green2, blue2;
		for (Pixel pixelObj : pixels2)
		{
				red2 = pixelObj.getRed();
				green2 = pixelObj.getGreen();
				blue2 = pixelObj.getBlue();
			    big = 253; //big is biggest RGB value
				small = 15; //small is smallest RGB value
				//range is 238
				//intervals are roughly 60
				if (red2 <= 75 && green2 <= 75 && blue2 <= 75)
				{
					pixelObj.setRed(50);
					pixelObj.setGreen(0);
					pixelObj.setBlue(139);
				}
				else if (red2 <= 135 && green2 <= 135 && blue2 <= 135)
				{
					pixelObj.setRed(255);
					pixelObj.setGreen(0);
					pixelObj.setBlue(0);
				}
				else if (red2 <= 195 && green2 <= 195 && blue2 <= 195)
				{
					pixelObj.setRed(135);
					pixelObj.setGreen(206);
					pixelObj.setBlue(250);
				}
				else if (red2 <= big && green2 <= big && blue2 <= big)
				{
					pixelObj.setRed(248);
					pixelObj.setGreen(248);
					pixelObj.setBlue(255);
				}
		}
		pog2.explore();
        //custom color palette


    }//main
}//class

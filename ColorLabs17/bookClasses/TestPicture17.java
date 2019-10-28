
//Color Lab
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{
  public static void main(String[] args)
  {
     //opens picture using a dialog box

     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //relative path
     Picture pog1 = new Picture("images/download.jpg");
     Picture pog2 = new Picture("images/download.jpg");
     Picture pog3 = new Picture("images/download.jpg");
	 Picture pog4 = new Picture("images/download.jpg");
	 Picture pog5 = new Picture("images/download.jpg");
	 Picture pog6 = new Picture("images/download.jpg");
	 Picture pog7 = new Picture("images/download.jpg");
	 Picture pog8 = new Picture("images/download.jpg");
	 Picture pog9 = new Picture("images/download.jpg");
	 Picture pog10 = new Picture("images/download.jpg");
	 Picture pog11 = new Picture("images/download.jpg");
	 Picture pog12 = new Picture("images/download.jpg");
     //makes an array of pixels
     Pixel[] pixels;
     Pixel[] pixels2;
     Pixel[] pixels3;
	 Pixel[] pixels4;
	 Pixel[] pixels5;
	 Pixel[] pixels6;
	 Pixel[] pixels7;
	 Pixel[] pixels8;
	 Pixel[] pixels9;
	 Pixel[] pixels10;
	 Pixel[] pixels11;
	 Pixel[] pixels12;
     //gets pixels from picture and assigns to pixels array
     pixels = pog1.getPixels();
     pixels2 = pog2.getPixels();
     pixels3 = pog3.getPixels();
	 pixels4 = pog4.getPixels();
	 pixels5 = pog5.getPixels();
	 pixels6 = pog6.getPixels();
	 pixels7 = pog7.getPixels();
	 pixels8 = pog8.getPixels();
	 pixels9 = pog9.getPixels();
	 pixels10 = pog10.getPixels();
	 pixels11 = pog11.getPixels();
	 pixels12 = pog12.getPixels();
    //how many pixels or how large array
    //System.out.println("This is a large array"+pixels.length);

	//sets the red,green,blue to 255 for all pixels

	int maxRed, maxGreen, maxBlue;

	for (Pixel spot : pixels)
	{
			maxRed = spot.getRed();
			spot.setRed(255);
	}

	for (Pixel spot2 : pixels2)
		{
			maxGreen = spot2.getGreen();
			spot2.setGreen(255);
		}

	for (Pixel spot3 : pixels3)
		{
			maxBlue = spot3.getBlue();
			spot3.setBlue(255);
		}

	//changes the picture to a negative
	//opposite color 0 is 255, 1 is 254, 2 is 253 and so on
	int redValue, greenValue, blueValue;

    for (Pixel spot4 : pixels4)
    {
		redValue = spot4.getRed();
		greenValue = spot4.getGreen();
		blueValue = spot4.getBlue();
		//make opposite with range of 0 to 255.
		spot4.setColor(new Color(255-redValue,255-greenValue,255-blueValue));
	}

	//changes the color by the factor given test at:
	//red 50% = .5, green 150% = 1.5, blue 25% = .25
	int value1, value2, value3;
	final double factor1 = 0.5, factor2 = 1.5, factor3 = 0.25;
    for (Pixel pixelObj : pixels5)
    {
        value1 = pixelObj.getRed();
        //decrease the red value by 50%
		value1 *= factor1;
		pixelObj.setRed(value1);
    }

	for (Pixel pixelObj : pixels6)
	    {
	        value2 = pixelObj.getGreen();
	        //decrease the green value by 150%
			value2 *= factor2;
			pixelObj.setGreen(value2);
	    }

    for (Pixel pixelObj : pixels7)
		    {
		        value3 = pixelObj.getBlue();
		        //decrease the blue value by 25%
				value3 *= factor3;
		        //set the red value of the current pixel to the new value
				pixelObj.setBlue(value3);
		    }

    //Grayscale
    int gray1, gray2, gray3, result;
    for (Pixel spot8 : pixels8)
			{
				gray1 = spot8.getRed();
				gray2 = spot8.getGreen();
				gray3 = spot8.getBlue();
				result = (gray1 + gray2 + gray3)/3;
				gray1 = result;
				gray2 = result;
				gray3 = result;
				spot8.setColor(new Color(gray1,gray2,gray3));
			}

	//Darken
	int dark1 = 0;
	int dark2 = 0;
	int dark3 = 0;
	for (Pixel pixelObj : pixels9)
	        {
				dark1 = pixelObj.getRed();
				if (dark1 < 130)
				{
					pixelObj.setRed(50);
				}
				dark2 = pixelObj.getGreen();
				if (dark2 < 130)
				{
					pixelObj.setGreen(50);
				}
				dark3 = pixelObj.getBlue();
				if (dark1 < 130)
				{
					pixelObj.setBlue(50);
				}
	        }

	//Colorify
	int color1 = 0;
	int color2 = 0;
	int color3 = 0;
	for (Pixel pixelObj : pixels10)
	{
				color1 = pixelObj.getRed();
				if (color1 < 70 && color2 < 70 && color3 < 70)
				{
					pixelObj.setRed(255);
					pixelObj.setGreen(100);
					pixelObj.setBlue(100);
				}
	}

	//Swap 2: Swap green to red
	int swap1 = 0;
	int swap2 = 0;
	for (Pixel pixelObj : pixels11)
	{
		swap1 = pixelObj.getRed();
		swap2 = pixelObj.getGreen();
		pixelObj.setGreen(swap1);
	}

	//Swap 3: Swap red to green, green to blue, blue to red
	int switch1 = 0;
	int switch2 = 0;
	int switch3 = 0;
	for (Pixel pixelObj : pixels12)
		{
			switch1 = pixelObj.getRed();
			switch2 = pixelObj.getGreen();
			switch3 = pixelObj.getBlue();
			pixelObj.setRed(switch2);
			pixelObj.setGreen(switch3);
			pixelObj.setBlue(switch1);
		}
	//Executions
	pog12.explore();
	pog11.explore();
	pog10.explore();
	pog9.explore();
	pog8.explore();
	pog7.explore();
	pog6.explore();
	pog5.explore();
	pog4.explore();
	pog3.explore();
	pog2.explore();
	pog1.explore();
    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);

    System.out.println(pixels[17].getColor());
    System.out.println(spot);
/*
    pixels[17].setColor(Color.yellow);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.green);

    ferris1.explore();
    */
/**/
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    /*
    int count = 0;
    for (Pixel spot : pixels)
    {
		if (count % 30 == 0)
		{
			spot.setColor(Color.yellow);
		}
	    //System.out.println( spot );
	    count++;
    }
    ferris1.explore();
	*/
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
  /*
  int red = 0;
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
			red = pixelObj.getGreen();
			if (red < 130)
			{
				pixelObj.setGreen(0);
			}
        }
    ferris1.explore();
*/
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
		value *= FACTOR;
        //set the red value of the current pixel to the new value
		pixelObj.setRed(value);

    }
    for (Pixel spot : pixels)
    {
		value = spot.getRed();
		spot.setRed((int)(value * 0.25));
		spot.setGreen((int)(value * 0.1));
		spot.setBlue((int)(value * 0.2));
	}
    // use new picture when changing or it will make changes to
    // pic you already changed
    ferris1.explore();

    //every picture must have new array set of pixels
    Pixel [] pixels2;
    pixels2 = ferris2.getPixels();
    int redValue, greenValue, blueValue;

    for (Pixel spot2 : pixels2)
    {
		redValue = spot2.getRed();
		greenValue = spot2.getGreen();
		blueValue = spot2.getBlue();
		//make opposite with range of 0 to 255.
		spot2.setColor(new Color(255-redValue,255-greenValue,255-blueValue));
	}

    ferris2.explore();

  /**/
    //write/save a picture as a file
    //pog1.write("images/ferris11.jpg");

    /**/
  }//main
}//class

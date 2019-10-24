
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");

     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/download.jpg");
     Picture ferris2 = new Picture("images/download.jpg");
     Picture ferris3 = new Picture("images/download.jpg");
	 Picture kate = new Picture("images/KatieFancy.jpg");

/*
     apic.explore();
     ferris1.explore();
*/

     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();

     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length);

	int maxRed;
	int maxGreen;
	int maxBlue;
	for (Pixel spot : pixels)
	{
			maxRed = spot.getRed();
			maxGreen = spot.getGreen();
			maxBlue = spot.getBlue();
			spot.setRed(255);
			spot.setGreen(255);
			spot.setBlue(255);
	}
	ferris1.explore();


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
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class

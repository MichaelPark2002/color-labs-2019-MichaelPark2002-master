import java.awt.*;
import java.util.*;
import java.util.List;

public class FloodFill
{
    public static void main(String[] args)
	{
		 //relative path
         Picture arrow = new Picture("images/arrow.jpg");
		 //makes array of pixels
		 Pixel[] pixels;
		 //gets pixels from picture and assigns to pixels array
		 pixels = arrow.getPixels();

		 arrow.explore();

		 //save pictures
		 arrow.write("images/arrow1.jpg");

    }//main
}//class

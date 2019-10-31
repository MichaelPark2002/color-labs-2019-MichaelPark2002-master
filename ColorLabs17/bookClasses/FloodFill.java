import java.awt.*;
import java.util.*;
import java.util.List;

public class FloodFill
{
    public static void main(String[] args)
	{
		 //relative path
         Picture arrow = new Picture("images/arrowett.jpg");
         Picture map = new Picture("images/map_image.png");
		 //makes array of pixels
		 Pixel[] pixels;
         Pixel[] pixels2;
		 //gets pixels from picture and assigns to pixels array
		 pixels = arrow.getPixels();
		 pixels2 = map.getPixels();
map.explore();
		 int red, green, blue, range = 40, range2 = 150;
		 for (Pixel pixelObj : pixels)
		 {
				red = pixelObj.getRed();
				green = pixelObj.getGreen();
				blue = pixelObj.getBlue();

				//find the black values and turn them to white

				if (red <= range && green <= range && blue <= range)
						{
							pixelObj.setRed(255);
							pixelObj.setGreen(255);
							pixelObj.setBlue(255);
						}

				//find the white value and turn them to black

				else if (red >= range2 && green >= range2 && blue >= range2)
					{
						pixelObj.setRed(0);
						pixelObj.setGreen(0);
						pixelObj.setBlue(0);
					}

		 }
		 arrow.explore();

		 int red2, green2, blue2, range3 = 130, range4 = 165;
		 for (Pixel pixelObj : pixels2)
		 		 {
		 				red2 = pixelObj.getRed();
		 				green2 = pixelObj.getGreen();
		 				blue2 = pixelObj.getBlue();

		 				if (red2 == 224 && green2 == 247 && blue2 == 255)
		 				//greater than or equal to 220
		 						{
		 							pixelObj.setRed(255);
		 							pixelObj.setGreen(255);
		 							pixelObj.setBlue(255);
		 						}

		 				//150 to 200
						else if (red2 >= range3 && green2 >= range3 && blue2 >= range3 && red2 <= range4 && green2 <= range4 && blue2 <= range4)
						{
							pixelObj.setRed(0);
						    pixelObj.setGreen(0);
		 					pixelObj.setBlue(0);
						}
		 }
		 map.explore();


		 //save pictures
		 arrow.write("images/arrow1.jpg");
		 map.write("images/map1.png");
    }//main
}//class



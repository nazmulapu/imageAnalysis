package code;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {
	public static void main(String[] args) throws IOException {
		ImageChecker i = new ImageChecker();
		BufferedImage one = ImageIO.read(new File(
				"D:/Imageana/ana2.jpg"));
		BufferedImage two = ImageIO.read(new File(
				"D:/Imageana/ana2ce.jpg"));
		if (one.getWidth() + one.getHeight() >= two.getWidth() + two.getHeight()) {
			i.setOne(one);
			i.setTwo(two);
		} else {
			i.setOne(two);
			i.setTwo(one);
		}
		System.out.println(i.compareImages());
	}
}

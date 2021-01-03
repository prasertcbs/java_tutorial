package com.prasertcbs;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ImageIO.getReaderFormatNames()));
        System.out.println(Arrays.toString(ImageIO.getWriterFormatNames()));

        demo();
    }

    public static void demo() {
        // http://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Thailand_Bangkok_location_map.png/420px-Thailand_Bangkok_location_map.png
        String urlImageLocation = "http://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/Thailand_Bangkok_location_map.png/420px-Thailand_Bangkok_location_map.png";
//        String urlImageLocation = "http://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Grand_Palace_Bangkok.jpg/450px-Grand_Palace_Bangkok.jpg";
        try {
            URL url = new URL(urlImageLocation);
            BufferedImage img = ImageIO.read(url);
            File outputImgFile = new File("savedPngImage.png");
            ImageIO.write(img, "png", outputImgFile);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package screen;

import ij.IJ;
import ij.ImagePlus;

public class window {

	public static void main(String[] args) {
        ImagePlus imp = IJ.openImage();
        imp.show();
	}

}

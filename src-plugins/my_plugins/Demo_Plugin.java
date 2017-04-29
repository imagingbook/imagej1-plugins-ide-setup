package my_plugins;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

/**
 * Example ImageJ Plugin that inverts an 8-bit grayscale image.
 * This file is part of the 'imagingbook' support suite. See
 * <a href = "http://imagingbook.com"> http://imagingbook.com</a>
 * for details and additional ImageJ resources.
 * 
 * @author W. Burger
 */
public class Demo_Plugin implements PlugInFilter {

	public int setup(String args, ImagePlus image) {
		return DOES_8G;
	} 

	public void run(ImageProcessor ip) {
		IJ.log("I am alive!");	// testing only
		int w = ip.getWidth();
		int h = ip.getHeight();

		for (int u = 0; u < w; u++) {
			IJ.showProgress(u, w);
			for (int v = 0; v < h; v++) {
				int val = ip.getPixel(u, v);
				ip.putPixel(u, v, 255 - val);
			}
		}
	}
}

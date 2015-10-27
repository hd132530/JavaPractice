package org.dimigo.io;

import java.io.*;
import java.net.*;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		String imageUrlString = "http://images.techtimes.com/data/images/full/134330/ipad-pro-ipad-air-2-and-ipad-mini-4.png?w=600";
		try {
			URL url = new URL(imageUrlString);
			try (InputStream is = url.openStream()) {
				OutputStream os = new FileOutputStream("files/logo.png");
				byte[] bytes = new byte[100];
				while(is.read(bytes) != -1) {
					os.write(bytes);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}

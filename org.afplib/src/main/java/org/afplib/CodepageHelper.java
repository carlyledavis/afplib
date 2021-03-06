package org.afplib;

import java.nio.charset.Charset;

/**
 * Helper to convert CGCGID triplet into JAVA code page.
 * 
 * @author Yan Hackl-Feldbusch <yan@hcsystems.de>
 *
 */
public class CodepageHelper {

	public static final Charset CHARSET_IBM500 = Charset.forName("ibm500");

	public static Charset getCharset(int cpgid, int gcsgid) {		
		Charset result;
		
		if(cpgid == 850) result = Charset.forName("ibm850");
		else if(cpgid == 500) result = CHARSET_IBM500;
		else if(cpgid == 1200) result = Charset.forName("UTF-16");
		else if(cpgid == 1252) result = Charset.forName("windows-1252");
		else if(cpgid == 1141) result = Charset.forName("CP1141");
		else {
			result = CHARSET_IBM500; // FIXME
		}

		return result;
	}

	
}

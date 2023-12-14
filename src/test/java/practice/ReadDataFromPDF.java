package practice;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {
	
	public static void main(String[] args) throws Throwable{
		
		File fs=new File("./src/test/resources/Collection.pdf");
		
		PDDocument doc=new PDDocument().load(fs);
		
		int pages = doc.getNumberOfPages();
		System.out.println(pages);
		
		PDFTextStripper content=new PDFTextStripper();
		
		String Entirepdf = content.getText(doc);
		
		System.out.println(Entirepdf);
		
		content.setStartPage(1);
		
		String data = content.getText(doc);
		
		System.out.println(data);
	}

}

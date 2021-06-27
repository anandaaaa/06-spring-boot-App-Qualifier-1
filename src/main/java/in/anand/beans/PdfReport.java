package in.anand.beans;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport {

		public PdfReport() {
			
			System.out.println("pdf report :consstructor");
		
		}
	
	
	@Override
	public void generate() {

		System.out.println("pdf report generated");
	}

	
	
	
	
}

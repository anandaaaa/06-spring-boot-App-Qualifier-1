package in.anand.beans;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport{

	public ExcelReport() {
		
		System.out.println("excel report constructor");
	
	}
	
	@Override
	public void generate() {

		System.out.println("Excel report");
		
	}
	
	


}

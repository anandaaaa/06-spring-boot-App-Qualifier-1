package in.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.anand.beans.IReport;

@Service
public class ReportService {
	
	private IReport report;

	public ReportService() {
		System.out.println("report :constructor");
	}
	
	@Autowired
	public ReportService(@Qualifier("excel") IReport report) {
		super();
		this.report = report;
	}
	
	public void generate()
	{
		report.generate();
		System.out.println("report generated completed");
		
	}
	

}

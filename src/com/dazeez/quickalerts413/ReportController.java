package com.dazeez.quickalerts413;

public class ReportController {

	private static Report report;
	
	public ReportController() {
	}
	
	public void createReport(String loc, int rating, String disease) {
		ReportController.report = new Report(loc, rating, disease);
	}
	
	public Report getReport() {
		return ReportController.report;
	}
}

package com.dianping.cat.report.view;

import com.dianping.cat.report.ReportPage;
import com.site.web.mvc.Page;

public class NavigationBar {
	public Page[] getVisiblePages() {
		return new Page[] {

		ReportPage.HOME,

		ReportPage.TRANSACTION,

		ReportPage.EVENT,
		
		ReportPage.HEARTBEAT,

		ReportPage.PROBLEM,

		ReportPage.IP,

		ReportPage.TREND,
		
		ReportPage.SQL,

		ReportPage.LOGVIEW

		};
	}
}

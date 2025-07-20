package extentManager;

import ImplemenInstance.ExtentManagerInstance;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import util.Constant;

public class ExtentManager extends ExtentManagerInstance {

    /**
     * Retrieves the singleton instance of the ExtentReports object.
     * If the instance does not already exist, it initializes it with an
     * ExtentHtmlReporter configured using constants for the report path,
     * name, timestamp, and file extension.
     *
     * @return The singleton instance of ExtentReports.
     */
    public static ExtentReports getExtent() {
        if (extent == null) {
                ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(Constant.PATH_REPORT + Constant.NAME_REPORT + Constant.TIME_STAMP + Constant.EXT_REPORT);
                extent = new ExtentReports();
                htmlReporter.config().setTheme(Theme.DARK);
                htmlReporter.config().setReportName("Automation Test Regresion");
                extent.attachReporter(htmlReporter);  }
        return extent;
    }
}

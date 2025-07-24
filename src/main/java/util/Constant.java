package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constant {

    /**
     * This class contains constants used for generating reports and interacting with APIs.
     *
     * Constants:
     * - PATH_REPORT: The file path where the Extent Report will be saved.
     * - NAME_REPORT: The base name for the Extent Report file.
     * - EXT_REPORT: The file extension for the Extent Report.
     * - TIME_STAMP: A timestamp formatted as "yyyy_MM_dd__hh_mm_ss" for uniquely naming reports.
     * - API_ROLES: The URL for retrieving joke categories from the Chuck Norris API.
     * - API_GET_FAIL: An incorrect URL for fetching a random joke from the Chuck Norris API.
     */
    public static String PATH_REPORT = "C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\Openbank_PY\\Capacitación_Ejemplos\\Cucumber-Api-OpenBank\\extentReport\\";
    //Report Extent
    public static String NAME_REPORT = "ExtentReport_";
    public static String EXT_REPORT = ".html";
    //Timestamp
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    public static String API_OPENBANK = "https://www.openbank.es";
    public static String API_OPENBANK_Fail = "https://www.openbank.es";

    //Response
    public static int Response200 = 200;
    public static int Response404 = 404;
}
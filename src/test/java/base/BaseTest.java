package base;

import extentManager.ExtentManager;
import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.Constant;
import videoRecorder.VideoRecorder;

public class BaseTest extends BaseTestInstance{

    /**
     * Sets up the test environment before executing the test cases.
     * This method performs the following actions:
     * - Starts recording the test execution.
     * - Initializes the extent reporting mechanism.
     * - Configures the base URI for API requests.
     *
     * @throws Exception if an error occurs during setup.
     */
    @Before
    public void setUp() throws Exception
    {
       this.startRecording();
              this.getExtent();

    }

    /**
     * This method is executed after the test execution is completed.
     * It performs cleanup operations such as stopping the recording
     * and flushing any remaining data.
     *
     * @throws Exception if an error occurs during the cleanup process.
     */
    @After
    public void setDown() throws Exception
    {
       this.stopRecording();
            this.flush();
    }


    /**
     * Starts the video recording process.
     *
     * @throws Exception if an error occurs while starting the recording.
     */
    private void StartRecording() throws Exception {
        VideoRecorder.startRecording();
    } private void startRecording() throws Exception {
        this.StartRecording();
    }

    /**
     * Stops the video recording process.
     *
     * @throws Exception if an error occurs while stopping the recording.
     */
    private void StopRecording() throws Exception {
        VideoRecorder.stopRecording();
    } private void stopRecording() throws Exception {
        this.StopRecording();
    }

    /**
     * Creates a test instance using the ExtentReports framework.
     * The test is initialized with the name "GET Test 1".
     */
    public void CreateTestReportHtml(){
            test = extent.createTest("GET Test 1");
    } public void createTestReportHtml(){
        this.CreateTestReportHtml();
    }

    /**
     * Retrieves the extent instance using the ExtentManager.
     * This method initializes the `extent` variable by calling the
     * `getExtent` method from the ExtentManager class.
     */
    private void GetExtent(){
            extent = ExtentManager.getExtent();
    } protected void getExtent(){
        this.GetExtent();
    }

    /**
     * Sets the base URI for REST Assured requests.
     * The base URI is retrieved from the constant `Constant.EXT_REPORT`.
     * This method configures the default base URI for all subsequent API requests
     * made using REST Assured.
     */
    private void BaseURI(String url){
            RestAssured.baseURI = (url);
    }  public void baseURI(String url){
         this.BaseURI(url);
    }

    /**
     * Flushes the current state of the extent reports.
     * This method ensures that all the data written to the report is saved
     * and the report is finalized for viewing or further processing.
     */
    private void Flush(){
            extent.flush();
    }  private void flush(){
        this.Flush();
    }


}

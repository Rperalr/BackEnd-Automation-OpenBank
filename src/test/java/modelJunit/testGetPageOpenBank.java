package modelJunit;


import base.BaseTest;

import com.aventstack.extentreports.Status;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testGetPageOpenBank extends BaseTest {

    //Ejecuta la prueba Request JSON a consumir
    @Test
    public void testOpenBankUrlGetPage() {

        this.CreateTestReportHtml();
            try {this.apiGetPageControllerOpenBank.openBnkGetRequestFunction();

                this.test.log(Status.PASS, "Inyecciòn fue exitoso");
                this.test.log(Status.INFO, "Test fue exitoso");
            } catch (Exception e) {
                this.test.log(Status.FAIL, "Inyecciòn falló: " + e.getMessage());

            }
        }

        @Test
        public void testOpenBankUrlGetPageFail() {

            this.CreateTestReportHtml();
            try {this.apiGetPageControllerOpenBank.openBnkGetRequestFail();

                this.test.log(Status.PASS, "Inyecciòn fue exitoso");
                this.test.log(Status.INFO, "Test fue exitoso");
            } catch (Exception e) {
                this.test.log(Status.FAIL, "Inyecciòn falló: " + e.getMessage());

            }
        }
    }



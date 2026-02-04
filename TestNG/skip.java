package TestNG;
import org.junit.Test;
import org.testng.SkipException;

public class skip {
    @Test 
    public void aSkipTest() throws SkipException {
        String condition ="Skip Test";

        if(condition.equals("Skip Test")){
        throw new SkipException("Skipping - This is not ready for testing ");
        } else {
        //Execute test case when conditions are satisfied
        }

    }
}

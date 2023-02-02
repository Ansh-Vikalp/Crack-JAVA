
import org.junit.Assert;
import org.junit.Test;

//Test case or Test Class
public class JUnitTester {
    // Test Meathod
    @Test
    public void testFunSucess() {

        Assert.assertEquals(200, cwh_10_Meathods.logic(20, 10));
    }

    @Test
    public void testFunFail() {

        Assert.assertEquals(150, cwh_10_Meathods.logic(20, 10));
    }

    /*
     * An enterprise grade application will have huge number of test cases.
     * 
     * Is it feasible to run all the test cases separately?
     * 
     * Obviously NOT!!!
     * 
     * It would be much better if we can group multiple related test cases and
     * execute them together.
     * 
     * JUnit provides test suits to create groups of test classes so that the code
     * maintainability is improved.
     * 
     * The following annotations are used for creating test suites:
     * 
     * @RunWith(Suite.class)
     * 
     * @Suite.SuiteClasses({ BillPaymentTest.class, OrderTest.class})
     * public class TestSuiteDemo {
     * }
     * 
     * The above class when executed using JUnit will execute all the test methods
     * present in the classes mentioned in @Suite.SuiteClasses
     * 
     * If OrderTest.class and BillPaymentTest.class contain two test methods each,
     * then, the test suite given here executes four different test methods and
     * provides the report.
     */

}

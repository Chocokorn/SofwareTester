import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({
	AccountTest.class,
	BankTest.class
})

public class BankSystemTest {

}
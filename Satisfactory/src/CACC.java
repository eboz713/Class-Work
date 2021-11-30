import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class CACC {
	
	isSatisfactory sat;
	
	@Before public void setUp()
	{
		sat = new isSatisfactory();
	}

	@Test public void test2() throws Exception //number of test references row number of table in document
	{
		sat.setGoodTrue();
		sat.setFastTrue();
		assertTrue(sat.satisfactoryCheck());
	}
	
	@Test public void test3() throws Exception
	{
		sat.setGoodTrue();
		sat.setCheapTrue();
		assertTrue(sat.satisfactoryCheck());
	}
	
	@Test public void test4() throws Exception
	{
		sat.setGoodTrue();
		assertFalse(sat.satisfactoryCheck());
	}
	
	@Test public void test5() throws Exception
	{
		sat.setFastTrue();
		sat.setCheapTrue();
		assertTrue(sat.satisfactoryCheck());
	}
	
	@Test public void test6() throws Exception
	{
		sat.setFastTrue();
		assertFalse(sat.satisfactoryCheck());
	}
	
	@Test public void test7() throws Exception
	{
		sat.setCheapTrue();
		assertFalse(sat.satisfactoryCheck());
	}

}

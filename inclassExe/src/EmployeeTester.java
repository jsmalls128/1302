
public class EmployeeTester{
    
    @Before
	public void setUp(){
	HourlyEmployee p1 = new HourlyEmployee("John","Smith",1234,7,20);
	HourlyEmployee p2 = new HourlyEmployee("Other","Worker",4321,5,20);
	HourlyEmployee p3 = new HourlyEmployee("John","Smith",1234,7,20);
    }
    @Test
	public void testEquals(){
	assertFalse(p1.equals(p2));
	assertFalse(p2.equals(p3));
	assertTrue(p1.equals(p3));
    }
    @Test
	public void testComputeWage(){
	assertTrue(p1.computeWage(),140);
	assertTrue(p2.computeWage(),100);
	assertTrue(p3.computeWage(),140);
    }
    @Text
	public void testToString(){
	asserTrue(p1.toString,"The employee John Smith\nEmployee ID: 1234\nWage: 7\nNumber of hours worked: 20");
    }
    @After
	public void tearDown(){
	p1 = null;
	p2 = null;
    }
}
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }
    @Test
    public void jsonTest1(){
        String json = "{ \"name\":\"whiskers\", \"name\":\"cat\", \"age\":4 }";
        AnimalModel expected = new AnimalModel("whiskers", "cat",4);
        AnimalModel actual = lab.deserializeJSON(json);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void jsonTest2(){
        String json = "{ \"name\":\"fido\", \"name\":\"dog\", \"age\":1 }";
        AnimalModel expected = new AnimalModel("whiskers", "cat",4);
        AnimalModel actual = lab.deserializeJSON(json);
        Assert.assertEquals(expected, actual);
    }
}

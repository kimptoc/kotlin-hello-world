package sample;

//import org.testng.annotations.Test;
//import static org.testng.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;

class HelloWorldTest {

  @Test
  public void tryHelloWorld(){
    HelloWorld hw = new HelloWorld();
    String result = hw.go();
    assertEquals("foo",result);     
  }
}

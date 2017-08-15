package sample;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

class HelloWorldTest {

  // TODO
  @Test
  public void tryHelloWorld(){
    HelloWorld hw = new HelloWorld();
    String result = hw.go();
    assertEquals("foo",result);     
  }
}

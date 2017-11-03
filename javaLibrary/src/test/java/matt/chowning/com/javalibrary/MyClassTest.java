package matt.chowning.com.javalibrary;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MyClassTest {
    @Test public void testSomeLibraryMethod() {
        MyClass classUnderTest = new MyClass();
        assertNotNull(classUnderTest);
    }
}

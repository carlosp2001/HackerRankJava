package javasubstringcomparisons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest {
    @Test
    public void testSmallest() {
        assertEquals("ava\nwel",Main.getSmallestAndLargest("welcometojava", 3));
    }

    @Test
    public void testWithEmptyString() {
        assertEquals("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl\n" +
                "sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs", Main.getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));

    }
}

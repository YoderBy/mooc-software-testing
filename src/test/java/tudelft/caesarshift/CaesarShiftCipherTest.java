package tudelft.caesarshift;

public class CaesarShiftCipherTest {
@Test
public void CaesarShiftBounderyTest{
    Assertions.assertTrue(CaesarShiftCipher.Cipher("az",2)=="cb");
    Assertions.assertTrue(CaesarShiftCipher.Cipher("az", -2) == "xw");
    
     
}
}

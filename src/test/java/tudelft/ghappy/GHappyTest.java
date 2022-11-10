package tudelft.ghappy;

public class GHappyTest {
    @ParameterizedTest(name = "str={0}")
    @CsvSource({ "hello", "check", "a", "b" })
    public void testForNog(){
        Ghappy no_g = new Ghappy();
        Assertions.assertFalse(no_g.ghappy(str));
    }

    @ParameterizedTest(name = "str={0}")
    @CsvSource({ "gg", "hegghe", "hellogg", "gghello", "ggheggdf"})
    public void testForNog(){
        Ghappy no_g = new Ghappy();
        Assertions.assertTrue(no_g.ghappy(str));
}

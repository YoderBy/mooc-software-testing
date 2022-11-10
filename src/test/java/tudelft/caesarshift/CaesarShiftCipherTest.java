package tudelft.caesarshift;

public class CaesarShiftCipherTest {
    public void checkHappy(string str){
        for (int i =0; i<str.length; i++){
            if (str.charAt(i) == 'g'){
                if str.charAt(i+1) !='g'{
                    return false;
                }
                i = i+1;
            }
        }
        return true;
    }
}

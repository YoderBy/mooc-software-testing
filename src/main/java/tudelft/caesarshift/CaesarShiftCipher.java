package tudelft.caesarshift;

public class CaesarShiftCipher {
    public String Cipher(String message, int shift){
        StringBuilder encrypted_messege = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
            encrypted_messege.append(currentChar);
            if (currentChar > 'z' || currentChar < 'a') {
                return "invalid"; //the string contains non-letters characters
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);//going full circle
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);//going full circle
            }
            encrypted_messege.append((char) (currentChar + shift));
        }

        return encrypted_messege.toString();
    }
}

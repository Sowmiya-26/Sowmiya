public class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "Programming"; 
        int vowels = 0, consonants = 0; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++; 
            } else { 
                consonants++; 
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
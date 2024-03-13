public class Dictionary {
    String word;
    String uppercased;
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
    public String lowerCaseToUpperCase (String word){
        uppercased = word.toUpperCase();
        return uppercased;
    }

    public int countVowels (String word){
        int count = 0;
        word = word.toLowerCase();
        char[] wordCharArray = word.toCharArray();

        for(char wordToCount : wordCharArray){
            for(char a : vowels){
                if(wordToCount == a){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

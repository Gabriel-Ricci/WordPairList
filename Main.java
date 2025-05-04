import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        
        
        for (WordPair pair : exampleOne.getAllPairs()) {
            System.out.println(pair);
        }
        System.out.println(exampleOne.numMatches());
        
        
        
        
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        
        
        for (WordPair pair : exampleTwo.getAllPairs()) {
            System.out.println(pair);
        }
        System.out.println(exampleTwo.numMatches());
        
        
        
       
        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        
        
        for (WordPair pair : exampleThree.getAllPairs()) {
            System.out.println(pair);
        }
        System.out.println(exampleThree.numMatches());
    }
}

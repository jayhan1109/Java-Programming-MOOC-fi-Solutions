import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations(){
        dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (dict.containsKey(word)) {
            dict.get(word).add(translation);
        } else {
            ArrayList<String> newTrans = new ArrayList<>();
            newTrans.add(translation);
            dict.put(word, newTrans);
        }
    }

    public ArrayList<String> translate(String word) {
        if(dict.containsKey(word)){
            return dict.get(word);
        }else{
            return new ArrayList<String>();
        }
    }

    public void remove(String word) {
        dict.remove(word);
    }
}

package nlNoviLes3NumToAlph;

import java.util.HashMap;

public class Translator {
    private int[] numms;
    private String[] alphas;

    private HashMap<Integer, String> numbersA = new HashMap();

    public Translator(int[] numms, String[] alphas){
        this.numms = numms;
        this.alphas = alphas;

        for(int i = 0; i<numms.length; i++) {
            numbersA.put(numms[i], alphas[i]);
        }
    }
    public void translateNum(int num){
        int number = num;
        System.out.println(numbersA.get(number));
    }
}

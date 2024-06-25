
package mainWordsList;

import java.util.*;

public class mainWordsList {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        List<String> wordsList = new ArrayList<String>();
        String element;
        System.out.println("Ingrese una lista de palabras (Escriba fin para terminar)");    
        while(true){
            System.out.print("- "); element = sc.next();
            if(element.equalsIgnoreCase("fin")){
                break;
            }
            wordsList.add(element);    
        }
        calculateCharacters(wordsList);
        printList(wordSizeRemove(wordsList));
    }
    
    static void calculateCharacters(List<String> wordsList){
        
        int pair=0,impair=0;
      
        for(String word: wordsList){
            if(word.length()%2==0){
               pair++;
            }else{  
               impair++;
            }
        }
        System.out.println("Numero Palabras pares: "+ pair );
        System.out.println("Numero Palabras impares: "+ impair);
    }
    
    static List<String> wordSizeRemove(List<String> wordsList){
        
        int minValue=Integer.MAX_VALUE, maxValue=0;
        Iterator <String> it = wordsList.iterator();
        
        for (String word : wordsList) {
            if(word.length()< minValue){
                minValue= word.length();
            }else if (word.length()> maxValue){
                maxValue= word.length();
            }
        }
        while(it.hasNext()){
           String element= it.next();
           if(element.length()== maxValue){
                it.remove();
           }
           else if(element.length()==minValue){
                it.remove();
           }
        }
    return wordsList;
    }
    
    static void printList(List<String> updatedList){
        System.out.println("------- Nueva Lista -------");
        updatedList.forEach(System.out::println);
        //System.out.println(updatedList);
    }
}

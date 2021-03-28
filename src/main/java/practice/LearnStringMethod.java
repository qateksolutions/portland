package practice;

import java.util.Arrays;

public class LearnStringMethod {
    public void learnIndexOf() {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("e", 5));
        System.out.println(myStr.indexOf("test"));
    }

    public void learnSubString(String searchTxt) {
        String myStr = "Hello planet earth, you are a great planet.";
        int index = myStr.indexOf(searchTxt);
        System.out.println(index);
        String substringWord = myStr.substring(index);
        System.out.println(substringWord);
        String word = myStr.substring(index, index + searchTxt.length());
        System.out.println(word);
    }

    public void learnLength() {
        String txt = "earth";
        System.out.println(txt.length());
    }

    public void learnReplace() {
        String myStr = "Hello planet earth, Hello you are a great planet.";
        //System.out.println(myStr.replace('l', 'p'));
        //System.out.println(myStr.replaceAll("World", "Planet"));
        String newStr = myStr.replace("Hello", "Hola");
        System.out.println(newStr);
    }

    public void learnTrim() {
        String myStr = "    Hello!      ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }

    public void learnCharAt() {
        String myStr = "Hello World";
        for(int i = 0; i < myStr.length(); i++) {
            System.out.println(myStr.charAt(i));
        }
    }

    public void learnValueOf() {
        int value = 30;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10); //3010
    }

    public void printIntArray() {
        int number = 10120123;
    }

    public void learnSplit() {
        String names = "John,Ali,Mathew,Abraham";
        String[] nameArray = names.split(",");
        //System.out.println(Arrays.toString(nameArray));
        for (String name : nameArray) {
            System.out.println(name);
        }
    }

    public void splitMethod() {
//        String sentence = "I live in NewYork";
//        String reverse = "";
//        for(int i = sentence.length() - 1; i >= 0; i--) {
//            reverse += sentence.charAt(i);
//        }
//        System.out.println(reverse);

        String sentence = "I live in NewYork";
        //String reverse = "";
        String[] words = sentence.split("");

        for(int i = words.length - 1; i >= 0; i--) {
            //reverse += words[i];
            System.out.print("" + words[i]);
        }
        //System.out.println(reverse);
    }

}

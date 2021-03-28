package practice;

import java.util.ArrayList;
import java.util.List;

public class Exam {



//    public Boolean sumsToTarget(Integer[] arr, Integer target) {
//        boolean matchSum = false;
//        for(int i = 0; i < arr.length - 1; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                int sum = arr[i] + arr[j];
//                System.out.println("Sum of Pair: " + sum);
//                if(sum == target) {
//                    matchSum = true;
//                    return matchSum;
//                }
//            }
//        }
//
//        return matchSum;
//    }

    public Boolean sumsToTarget(Integer[] arr, Integer target) {
        boolean bFound=false;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    bFound=true;
                    break;
                }
            }
        return bFound;
    }


    public List<String> search(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            char firstChar = value.charAt(0);
            if (firstChar == 'a' && value.length() == 3) {
                newList.add(value);
            }
        }
        return newList;
    }

    public int search (Integer n, Integer[] list) {
        for (int i = 0; i< list.length; i++) {
            if (list[i] ==n) {
                return i;
            }
        }
        return  -1;
    }




}

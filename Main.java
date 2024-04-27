//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//class Result {
//
//  /*
//   * Complete the 'dnaComplement' function below.
//   *
//   * The function is expected to return a STRING.
//   * The function accepts STRING s as parameter.
//   */
//
//  public static String dnaComplement(String s) {
//    // Write your code here
//    StringBuilder replacedDNA = new StringBuilder();
//    for (int i = s.length(); i >= 0; i--) {
//      if (s.charAt(i) == 'A') {
//        replacedDNA.append('T');
//      } else if (s.charAt(i) == 'T') {
//        replacedDNA.append('A');
//      } else if (s.charAt(i) == 'C') {
//        replacedDNA.append('G');
//      } else if (s.charAt(i) == 'G') {
//        replacedDNA.append('C');
//      } else {
//        replacedDNA.append(s.charAt(i));
//      }
//    }
//    return replacedDNA.toString();
//  }
//
//  public static int slotWheelss(List<String> history) {
//    List<List<Integer>> numberLists = new ArrayList<>();
//    for (String row : history) {
//      List<Integer> numbers = new ArrayList<>();
//      for (String number : row.split("\\s+")) {
//        numbers.add(Integer.parseInt(number));
//      }
//      numberLists.add(numbers);
//    }
//
//    int total = 0;
//
//    while (!numberLists.stream().allMatch(List::isEmpty)) {
//      int highestOverall = Integer.MIN_VALUE;
//
//      // Find and remove the highest number in each list
//      for (List<Integer> numbers : numberLists) {
//        if (!numbers.isEmpty()) {
//          int highestInRow = Collections.max(numbers);
//          numbers.remove(Integer.valueOf(highestInRow));
//          highestOverall = Math.max(highestOverall, highestInRow);
//        }
//      }
//
//      total += highestOverall;
//    }
//
//    return total;
//  }
//
//  public static void main(String[] args) {
//    List<String> history = List.of("10203", "51525", "12345");
//    System.out.println(slotWheelss(history));
//  }
//
//  public static int slotWheels(List<String> history) {
//    List<List<Integer>> rows = new ArrayList<>();
//    for (String row : history) {
//      List<Integer> numbers = new ArrayList<>();
//      for (int i = 0; i < row.length(); i++) {
//        numbers.add(Integer.parseInt((row.charAt(i) + "")));
//      }
//      rows.add(numbers);
//    }
//    int total = 0;
//    while (!rows.get(0).isEmpty()) {
//      int highest = -1;
//      for (int j = 0; j < rows.size(); j++) {
//        int max = findMax(rows.get(j));
//        if (rows.get(j).get(max) > highest) {
//          highest = rows.get(j).get(max);
//        }
//        rows.get(j).remove(max);
//      }
//      total = total + highest;
//    }
//    return total;
//  }
//
//  public static int findMax(List<Integer> numbers) {
//    int index = 0;
//    int highest = numbers.get(0);
//    for (int i = 0; i < numbers.size(); i++) {
//      if (numbers.get(i) > highest) {
//        highest = numbers.get(i);
//        index = i;
//      }
//    }
//    return index;
//  }
//
//
//  public int binarySearch(int arr[], int 1, int r, int x) {
//    if (r >= 1) {
//      int mid = 1 + (r - 1) / 2;
//      if (arr[mid] == x)
//        return mid;
//      if (arr[mid] > x)
//        return binarySearch(arr, 1, mid + 1, x);
//
//      return binarySearch(arr, mid + 1, r, x);
//    }
//    return -1;
//  }
//}
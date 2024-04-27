import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Values {
  private List<Map.Entry<Integer, Integer>> entries;

  public static void main(String[] args) {
    Values c1 = new Values();
    // c1.makeEntries();
    c1.makeEntries();
    c1.printStuff();
  }

  public void printStuff() {
    for (Map.Entry<Integer, Integer> entry : entries) {
      // Ensure binary strings are always five bits
      String xBinary = String.format("%5s", Integer.toBinaryString(entry.getKey())).replace(' ', '0');
      String yBinary = String.format("%5s", Integer.toBinaryString(entry.getValue())).replace(' ', '0');

      String concatenatedBinary = xBinary + yBinary; // concatenate x and y binary strings
      // System.out.println(concatenatedBinary);
      int decimalValue = binaryToDecimal(concatenatedBinary); // convert binary string to decimal

      System.out.println("Value: " + decimalValue);
    }
  }

  public int binaryToDecimal(String binaryString)
  {
    int decimalValue = 0;
    int length = binaryString.length();

    for (int i = 0; i < length; i++) {
      if (binaryString.charAt(i) == '1') {
        decimalValue += Math.pow(2, (length - i - 1));
      }
    }

    return decimalValue;
  }
  public void allEntries() {
    entries = new ArrayList<>();
    for (int y = 0; y<16; y++) {
      for(int x = 0; x<16; x++) {
        addToEntries(x,y);
      }
    }
  }
  public void makeEntries() {
    entries = new ArrayList<>();
    addToEntries(7, 0);
    addToEntries(7, 1);
    addToEntries(8, 1);
    addToEntries(6, 1);
    addToEntries(6, 2);
    addToEntries(6, 3);
    addToEntries(6, 4);
    addToEntries(5, 4);
    addToEntries(5, 5);
    addToEntries(4, 5);
    addToEntries(4, 6);
    addToEntries(3, 6);
    addToEntries(3, 7);
    addToEntries(2, 7);
    addToEntries(1, 7);
    addToEntries(0, 7);
    addToEntries(0, 8);
    // end left
    addToEntries(7, 15);
    addToEntries(7, 14);
    addToEntries(7, 13);
    addToEntries(8, 12);
    addToEntries(7, 12);
    addToEntries(6, 12);
    addToEntries(6, 11);
    addToEntries(6, 10);
    addToEntries(5, 10);
    addToEntries(5, 9);
    addToEntries(4, 9);
    addToEntries(4, 8);
    addToEntries(3, 8);
    addToEntries(2, 8);
    addToEntries(2, 7);  // Duplicate entry, will be added again
    addToEntries(1, 7);  // Duplicate entry, will be added again
    addToEntries(1, 8);
    addToEntries(0, 7);  // Duplicate entry, will be added again
  }

  private void addToEntries(int key, int value) {
    entries.add(new AbstractMap.SimpleEntry<>(key, value));
  }
}

package M02_February2025;
/*
Link: https://leetcode.com/problems/design-a-number-container-system/description/
2349. Design a Number Container System
Topic: Hash Table
 */
import java.util.*;
public class L250208_Medium2349_Design_a_Number_Container_System {
    // Maps from number to set of indices and from index to number
    private Map<Integer, TreeSet<Integer>> numberToIndices;
    private Map<Integer, Integer> indexToNumbers;

    // Constructor
    public L250208_Medium2349_Design_a_Number_Container_System() {
        // Initialize the data structures
        numberToIndices = new HashMap<>();
        indexToNumbers = new HashMap<>();
    }

    public void change(int index, int number) {
        // If index already has a number, remove it from the old number's index set
        if (indexToNumbers.containsKey(index)) {
            int previousNumber = indexToNumbers.get(index);
            numberToIndices.get(previousNumber).remove(index);
            if (numberToIndices.get(previousNumber).isEmpty()) {
                numberToIndices.remove(previousNumber);
            }
        }
        // Update the number and add the index to the new number's set
        indexToNumbers.put(index, number);
        numberToIndices.putIfAbsent(number, new TreeSet<>());
        numberToIndices.get(number).add(index);
    }

    public int find(int number) {
        // Return the smallest index for the given number, or -1 if not found
        if (numberToIndices.containsKey(number)) {
            return numberToIndices.get(number).first(); // Get the smallest index
        }
        return -1;
    }
    // time = O(log n)
    // space = O(n)
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
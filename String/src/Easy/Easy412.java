package Easy;
/*
Link: https://leetcode.com/problems/fizz-buzz/description/
412. Fizz Buzz
Topic: String, Math
 */
import java.util.ArrayList;
import java.util.List;
public class Easy412 {
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0) {
                answer.add("FizzBuzz");
            } else if(i%3==0) {
                answer.add("Fizz");
            } else if(i%5==0) {
                answer.add("Buzz");
            }
            else {
                answer.add(""+i+"");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = fizzBuzz(n);
        for(int i=0; i<result.size(); i++) {
            System.out.println(result.get(i)+" "); // ["1","2","Fizz"]
        }
    }
}

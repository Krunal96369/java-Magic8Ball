import java.util.*;


public class Magic8{

    public static void main(String[] args){
        System.out.println("think your question.... and my answer is : ");

        //this part will genrate Random number
        Random random = new Random();
        int num = random.nextInt(12);
        
        ArrayList<String> answer = new ArrayList<String>();
        answer.add("It is certain");
        answer.add("Reply hazy, try again");
        answer.add("Don’t count on it.");
        answer.add("It is decidedly so.");
        answer.add("Ask again later.");
        answer.add("My reply is no");
        answer.add("Without a doubt.");
        answer.add("Better not tell you now.");
        answer.add("My sources say no.");
        answer.add("Yes – definitely");
        answer.add("Cannot predict now");
        answer.add("Outlook not so good.");
      
      System.out.println(answer.get(num));
      


    }

}

import java.util.Random;


public class Magic8{

    public static void main(String[] args){
        System.out.println("think your question.... and my answer is : ");

        //this part will genrate Random number
        Random random = new Random();
        int num = random.nextInt(12)+1;
        //this is switch case to give ans
        switch(num)
        {
            case 1: System.out.println("It is certain");
                break;
            case 2: System.out.println("Reply hazy, try again");
                break;
            case 3: System.out.println("Don’t count on it.");
                break;
            case 4: System.out.println("It is decidedly so.");
                break;
            case 5: System.out.println("Ask again later.");
                break;
            case 6: System.out.println("My reply is no");
                break;
            case 7: System.out.println("Without a doubt.");
                break;
            case 8: System.out.println("Better not tell you now.");
                break;
            case 9: System.out.println("My sources say no.");
                break;
            case 10: System.out.println("Yes – definitely");
                break;
            case 11: System.out.println("Cannot predict now");
                break;
            case 12: System.out.println("Outlook not so good.");
                break;
            default : System.out.println("hmm... this must be an error then.");

        }



    }

}
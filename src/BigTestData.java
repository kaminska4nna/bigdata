import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class BigTestData
{
    public static void main (String[] args) throws java.lang.Exception
    {

        ArrayDeque<String> randomDeque = new ArrayDeque<>();
        ArrayList<String> evenArrayList = new ArrayList<>();
        ArrayList<String> oddArrayList = new ArrayList<>();

        for (int n=0; n<70; n++) {
            Random random = new Random();


            int randomNumber = random.nextInt(70 + 1 - 1) + 1;
            String s = String.join("", Collections.nCopies(randomNumber, "a"));
            randomDeque.add(s);

            if (s.length()%2 == 0 ){

                evenArrayList.add(s);

            }
            else {
                oddArrayList.add(s);

            }

        }


        System.out.println("The Big List contains now " + randomDeque.size() + " objects");


            System.out.println(evenArrayList);
            System.out.println(oddArrayList);

        }


    }

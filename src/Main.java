import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<String[]> wordArray = null;


        while(true) {
            String fullString = sc.nextLine();

            if (fullString.equalsIgnoreCase("end"))
                break;

            wordArray.add(sc.nextLine().split(" "));


        }
        String inputYear = sc.next();

        for(String[] word : wordArray){
            String year = null;
            switch (word[0]){

                case "Citizen":
                    year = word[4].split("/")[2];
                    break;


                case "Pet":
                    year = word[2].split("/")[2];
                    break;

            }

            if(year != null){
                if(inputYear.equals(year)){
                    switch (word[0]){
                        case "Citizen":
                            System.out.println(word[4]);
                            break;

                        case "Pet":
                            System.out.println(word[2]);
                            break;
                    }
                }
            }
        }

    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList <Gift> options = new ArrayList<>();

        options.add(new Gift("Jewelry","Female",
                "High", "adult"));
        options.add(new Gift("Weekend Getaway","Female",
                "High","child"));
        options.add(new Gift("Selfie Stick","Female",
                "Low","teen"));
        options.add(new Gift("Wine Bottle","Female",
                "Low","teen"));
        options.add(new Gift("Perfume","Female",
                "Medium", "teen"));
        options.add(new Gift("Sweater","Female",
                "Medium","child"));
        options.add(new Gift("Smart TV","Male",
                "High", "teen"));
        options.add(new Gift("Apple Watch","Male",
                "High","adult"));
        options.add(new Gift("Books","Male",
                "Low","teen"));
        options.add(new Gift("Shoes","Male",
                "Low","child"));
        options.add(new Gift("Guitar","Male",
                "Medium","teen"));
        options.add(new Gift("Playstation","Male",
                "Medium","child"));

        System.out.println("Enter your gender");
        String userGender = sc.next();

        System.out.println("Enter your price");
        String userPrice = sc.next();

        System.out.println("Enter the age of the person-child or teen or adult?");
        String userAge = sc.next();

        ArrayList<String> giftSuggestions = new ArrayList<>();

        for (Gift gift1:options){
             if (gift1.getGender().equalsIgnoreCase(userGender)
                     && gift1.getPrice().equalsIgnoreCase(userPrice)
                     && gift1.getAge() .equalsIgnoreCase(userAge)){
                 System.out.println(gift1.getGiftName());
                 giftSuggestions.add(gift1.getGiftName());
             }
        }

        if(giftSuggestions.isEmpty()){
            System.out.println("You should get them a gift certificate");
        }

    }
}

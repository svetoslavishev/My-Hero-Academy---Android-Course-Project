package slav40.myheroacademy.models;

import java.util.ArrayList;

public class CharacterData
{
    private static ArrayList<Character> characters;

    public CharacterData()
    {
        characters = new ArrayList<>();
    }

    public static void init()
    {
        Character deku = new Character("Deku", "Izuku Midoriya, also known as Deku, is the main protagonist of My Hero Academia. Though born without a Quirk, he manages to catch the attention of the legendary hero All Might due to his innate heroism and has since become his close pupil and also a student at U.A. High School. All Might passed on his quirk to Izuku, making him the ninth owner of the Quirk One For All.");
        Character bakugo = new Character("Kacchan", "Katsuki Bakugo , also known as Kacchan by his childhood friends, is the deuteragonist of My Hero Academia. He is a student training to become a Pro Hero at U.A. High School.");
        Character allMight = new Character("All Might", "Toshinori Yagi, most commonly known by his hero name, All Might, is the tritagonist of My Hero Academia. All Might is the former No. 1 Hero who bore the title of the world's Symbol of Peace. He teaches Foundational Hero Studies at U.A. High School.");

        characters.add(deku);
        characters.add(bakugo);
        characters.add(allMight);
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }
}

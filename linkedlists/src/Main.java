import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<memberPlayer> list = new LinkedList<>();
        memberPlayer m1 = new memberPlayer("Youssef", "Arenstorff", 26, true);
        list.add(m1);
        memberPlayer m2 = new memberPlayer("Nicklas", "Pedersen", 22, true);
        list.add(m2);
        memberPlayer m3 = new memberPlayer("Anders", "Hansen", 32, true);
        list.add(m3);
        memberPlayer m4 = new memberPlayer("Nikolaj", "Skibsted", 23, true);
        list.add(m4);
        memberPlayer m5 = new memberPlayer("Mads", "Poulsen", 10, true);
        list.add(m5);
        memberPlayer m6 = new memberPlayer("Martin", "Jespersen", 15, true);
        list.add(m6);
        memberPlayer m7 = new memberPlayer("Jeppe", "Hans", 35, true);
        list.add(m7);
        memberPlayer m8 = new memberPlayer("Omer", "Gurt", 29, true);
        list.add(m8);
        memberPlayer m9 = new memberPlayer("Simon", "Karl", 20, true);
        list.add(m9);
        memberPlayer m10 = new memberPlayer("Mardin", "Eliassi", 21, true);
        list.add(m10);
        memberPlayer m11 = new memberPlayer("Radwan", "HayHay", 28, true);
        list.add(m11);
        memberPlayer m12 = new memberPlayer("Mo", "Stacks", 31, true);
        list.add(m12);
        memberPlayer m13 = new memberPlayer("Lukas", "Nielsen", 18, true);
        list.add(m13);
        memberPlayer m14 = new memberPlayer("Cay", "Holmegaard", 16, true);
        list.add(m14);
        memberPlayer m15 = new memberPlayer("Hardy", "Japan", 34, true);
        list.add(m15);
        memberPlayer m16 = new memberPlayer("Phillip", "Madsen", 17, false);
        list.add(m16);
        memberPlayer m17 = new memberPlayer("Simon", "Mitipong", 22, false);
        list.add(m17);
        memberPlayer m18 = new memberPlayer("Thomas", "Peter", 27, false);
        list.add(m18);
        memberPlayer m19 = new memberPlayer("Sebastian", "Berg", 25, false);
        list.add(m19);
        memberPlayer m20 = new memberPlayer("Bent", "Larsen", 24, false);
        list.add(m20);
        memberPlayer m21 = new memberPlayer("Ole", "Nielsen", 29, false);
        list.add(m21);
        memberPlayer m22 = new memberPlayer("John", "Ali", 21, false);
        list.add(m22);
        memberPlayer m23 = new memberPlayer("Johnny", "Bravo", 22, false);
        list.add(m23);
        memberPlayer m24 = new memberPlayer("Gunner", "Jeppesen", 23, false);
        list.add(m24);
        memberPlayer m25 = new memberPlayer("Preben", "Elkjær", 27, false);
        list.add(m25);
        memberPlayer m26 = new memberPlayer("Lis", "Anderson", 29, false);
        list.add(m26);
        memberPlayer m27 = new memberPlayer("Anna", "Andersen", 24, false);
        list.add(m27);
        memberPlayer m28 = new memberPlayer("Pia", "Kjærsgaard", 21, false);
        list.add(m28);
        memberPlayer m29 = new memberPlayer("Bente", "Messerschmidt", 29, false);
        list.add(m29);
        memberPlayer m30 = new memberPlayer("Sofie", "Olsen", 31, false);
        list.add(m30);
        menu(list);
    }


        public static void menu(List<memberPlayer> list)
        {
            Scanner input = new Scanner(System.in);
        System.out.println("1 to create member\n2 to list members\n3 to search for member\n4 to delete member\n5 to search for team/age");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                memberPlayer m0 = createMember();
                list.add(m0);
                break;
            case 2:
                showList(list);
                break;
            case 3:
                searchMember(list);
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
    }

    public static void searchMember(List<memberPlayer> list)
    {

        System.out.println();
    }


    public static void showList(List<memberPlayer> list)
    {
        System.out.println(list);
    }

    public static memberPlayer createMember()
    {
        boolean b1;
        Scanner input = new Scanner(System.in);
        System.out.println("name");
        String fName = input.next();
        System.out.println("last name");
        String lName = input.next();
        System.out.println("age");
        int age = input.nextInt();
        System.out.println("Team 1 or 2?");
        int team = input.nextInt();
        if (team == 1)
        {
            b1 = true;
        } else {
            b1 = false;
        }
        memberPlayer m0 = new memberPlayer(fName, lName, age, b1);
        return m0;
    }
}

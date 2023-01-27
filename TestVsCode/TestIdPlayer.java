
import java.util.Scanner;

import java.util.ArrayList;
import java.util.ListIterator;

import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * 
 * @author oem
 * @since  27/01/2023
 * 
 * @apiNote class testing our players
 */
public class TestIdPlayer{
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        IdPlayer player1,player2,player3;

        ArrayList<IdPlayer> group=new ArrayList<IdPlayer>(5);

        System.out.println("\n___Release informations___\n");
        System.out.println("FirstPerson: (Name and old) ");
        String n1=br.readLine();
        int o1=sc.nextInt();

        System.out.println("SecondPerson: (Name and old) ");
        String n2=br.readLine();
        int o2=sc.nextInt();

        System.out.println("ThirdPerson: (Name and old) ");
        String n3=br.readLine();
        int o3=sc.nextInt();


        group.add(new IdPlayer(n1,o1));
        group.add(new IdPlayer(n2,o2));
        group.add(new IdPlayer(n3,o3));

        System.out.println("\n____Person's informations____\n");

        ListIterator<IdPlayer> li=group.listIterator();
        while(li.hasNext())
            li.next().display();
    }
}
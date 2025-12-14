package zadanie03;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        
        int numOfChildren = 3;
        Child[] children = new Child[numOfChildren];
        
        System.out.println(
            children.length + " children will be created"
        );
        
        for (int i = 0; i < children.length; i++) {
            System.out.print("Name of the child no " + i + ": ");
            children[i] = new Child(input.next());
        }
        
        System.out.print(children.length + " children: ");
        Child.printChildren(children);
        
        System.out.println(
            "Entering the name of the 'giver' starting with 'q' " +
            "terminates the program"
        );
        
        String giver = "";
        String receiver;
        while (!giver.startsWith("q")) {
            System.out.print("Enter the names of 'giver' and 'receiver': ");
            giver = input.next();
            if (giver.startsWith("q"))
                continue;
            receiver = input.next();
            
            boolean isGiverAChild = Child.getChildByName(children, giver) != null;
            boolean isReceiverAChild = Child.getChildByName(children, receiver) != null;
            if (!isGiverAChild && !isReceiverAChild) {
                System.out.println("No child with name " + giver);
                System.out.println("No child with name " + receiver);
            } else if (!isGiverAChild) {
                System.out.println("No child with name " + giver);
            } else if (!isReceiverAChild) {
                System.out.println("No child with name " + receiver);
            } else {
                Child.getChildByName(children, giver).givesCandyTo(Child.getChildByName(children, receiver));
                Child.printChildren(children);
            }
        }
        
        input.close();
    }
}

import java.util.Scanner;
public class EscapeAcademy {
    Scanner input = new Scanner(System.in);
    Child[] children = new Child[3];
    int totalChildren = 0;


    public void registerChild() {
        if (totalChildren == children.length) {
            System.out.println("The team is already full.");
            return;
        }
        System.out.println("✎﹏Register﹏Children﹏﹏");
        String name;
        names:
        while (true) {
            System.out.print("Name: ");
            name = input.nextLine();
            if (name.isBlank()) {
                System.out.println("Name cannot be empty");
                continue names;
            }
            if (!name.matches("[\\p{L} ]+")) {
                System.out.println("Name must contain only letters.");
                continue names;
            }
            break;
        }
        int age;
        ages:
        while (true) {
            System.out.print("Age: ");
            age = input.nextInt();
            if (age < 5 || age > 12) {
                System.out.println("Age must be between 5 and 12.");
                input.nextLine();
                continue ages;
            }
            break;
        }
        int iq;
        iqs:
        while (true) {
            System.out.print("IQ: ");
            iq = input.nextInt();
            if (iq < 0 || iq > 300) {
                System.out.println("IQ must be between 0 and 300");
                input.nextLine();
                continue iqs;
            }
            break;
        }
        int strength;
        strengths:
        while (true) {
            System.out.print("Strength: ");
            strength = input.nextInt();
            if (strength < 0 || strength > 100) {
                System.out.println("Strength must be between 0 and 100");
                input.nextLine();
                continue strengths;
            }
            break;
        }

        int code;
        codes:
        while (true) {
            System.out.print("Code: ");
            code = input.nextInt();
            input.nextLine();
            if (code <= 0) {
                System.out.println("Code must be greater than 0.");
                continue codes;
            }
            for (int i = 0; i < totalChildren; i++) {
                Child child = children[i];
                if (child.getCode() == code) {
                    System.out.println("This code already exists.");
                    continue codes;
                }
            }
            break;
        }
        Child newChild = new Child(name, age, iq, strength, code);
        children[totalChildren] = newChild;
        totalChildren++;
        System.out.println("Child registered successfully!");
        input.nextLine();
    }



    public void listChildren() {
        if (totalChildren == 0) {
            System.out.println("No children registered");
            return;
        }
        for (int i = 0; i < totalChildren; i++) {
            Child child = children[i];
            child.showInfo();
        }
    }

    public void searchChild() {
        System.out.print("Enter child code: ");
        int code = input.nextInt();
        boolean found = false;
        for (int i = 0; i < totalChildren; i++) {
            Child child = children[i];
            if (child.getCode() == code) {
                child.showInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Child was not found.");
        }
    } public void trainChild(){
        System.out.print("Enter child code: ");
        int code = input.nextInt();
        boolean found = false;
        for (int i = 0; i < totalChildren; i++) {
            Child child = children[i];
            if (child.getCode() == code){
            child.train();
            found = true;
            System.out.println("Child trained successfully!");
            }
        } if (!found){System.out.println("Child not found.");}

    } public void childEscape(){
        System.out.print("Enter child code: ");
        int code = input.nextInt();
        boolean found= false;
        for (int i = 0; i < totalChildren; i++) {
            Child child = children[i];
            if (child.getCode() == code){
            found=true;
            if (!child.isEscaped()){
                child.escape();
                System.out.println("Child escaped");}
            else {System.out.println("Child already escaped");}

            }
            } if (!found) {
            System.out.println("Child not found.");
        }
        } public void showEscapedChildren(){
            boolean found=false;
            for (int i=0;i<totalChildren;i++){
                Child child = children[i];
                if (child.isEscaped()){
                    found=true;
                    child.showInfo();
                }
            } if (!found){
                System.out.println("No escaped children found.");
        }
    } public void showSmartestChild(){
if (totalChildren==0) {
    System.out.println("No children found");
    return;
}     Child smartestChild = children[0];
for (int i=1;i<totalChildren;i++){
    Child child = children[i];
    if (child.getIq()>smartestChild.getIq()){
     smartestChild=child;
    }
}System.out.println("Smartest Child:");
smartestChild.showInfo();

}   public void yakosukoMenu(){
        int option;
        do {
            System.out.println("── ⋆⋅☆⋅⋆ ──");
            System.out.println("1╰┈➤Register Child");
            System.out.println("2╰┈➤List Children");
            System.out.println("3╰┈➤Search Child");
            System.out.println("4╰┈➤Train Child");
            System.out.println("5╰┈➤Mark as Escaped");
            System.out.println("6╰┈➤Show Escaped Children");
            System.out.println("7╰┈➤ Show Smartest Child");
            System.out.println("8╰┈➤Exit");
            System.out.print("ENTER OPTION: ");
            option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    registerChild();
                    break;
                case 2:
                    listChildren();
                    break;
                case 3:
                    searchChild();
                    break;
                case 4:
                    trainChild();
                    break;
                case 5:
                    childEscape();
                    break;
                case 6:
                    showEscapedChildren();
                    break;
                case 7:
                    showSmartestChild();
                    break;
                case 8:
                    System.out.println("Closing...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (option != 8);

    }

    }







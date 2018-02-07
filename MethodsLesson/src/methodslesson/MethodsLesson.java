package methodslesson;

public class MethodsLesson {

    public static void main(String[] args) {
        displayPhrase();
        addNumb(1, 2, 3);
    }

    public static void displayPhrase() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Happy birthday!");

        }

    }
                               // pramater (what is in the brackets)
    public static void addNumb(int x, int y, int z) { 
        System.out.println(x + y + z);

    }
    
    

}
/// when you declare a variable in a method it only exists in THAT method
// if you say int x in the main method you can declare int x in another one.
// static makes it a class method
//if you drop static it is a object method
//Public method- Can be accessed ANYWHERE in the program
//Private method- Can only be accessed within the class it was created.



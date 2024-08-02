// object is a class which will contain the dimesions of the object and related methods

class object{
    // these are the data members of the class object
    int n1,n2,n3;

    //this is a constructor of the class
    object(){
        n1 = 0;
        n2 = 0;
        n3 = 0;
    }
    // this constructor uses an object parameter for the values of the object's dimensions
    object(object p){
        n1 = p.n1;
        n2 = p.n2;
        n3 = p.n3;
    }
    // this is another constructor which directly takes dimensions of the object as inetger parameters
    object(int a, int b, int c){
        n1 = a;
        n2 = b;
        n3 = c;
    }

    //method which calculates and displays the volume of the object with its specified dimensions
    public void volume(){
        System.out.println("The volume of the object is " + (n1*n2*n3));
    }
    
    //displays the data members of the current class
    public void display(){
        System.out.println("num 1 : " +n1);
        System.out.println("num 2 : " +n2);
        System.out.println("num 3 : " +n3);
    }
}

public class passObject {


    public static void main(String[] args) {
        object obj1 = new object(10,20,30);
        obj1.display();
        obj1.volume();

        object obj2 = new object(obj1);
        obj2.display();
        obj2.volume();

    }
}

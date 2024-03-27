import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       MyLinkedlist<Integer> myLinkedlist=new MyLinkedlist();
        System.out.println("enter 1-8 to start the game and playing ");
        System.out.println("if you want to undo enter the 9");
        System.out.println("enter the 0 to exit and show your enterd number");
        while (true){
            Boolean correct=false;
            int value=0;
            while (!correct){
                String Value=input.next();
                try{
                    value=Integer.parseInt(Value);
                    correct=true;
                }
                catch (NumberFormatException e){
                    System.out.println("eror input .reenter");
                }
            }
            if(value<=8&&value>=1){
                if(myLinkedlist.size()==10 ){
                    System.out.println("this is the tenth number. if you add new number you lose first number ");
                    myLinkedlist.removeBack();
                    myLinkedlist.addFront(value);
                }
                else{
                    myLinkedlist.addFront(value);
                }

            }
            else if(value==9){
                if(myLinkedlist.empty()){
                    System.out.println("there is no number in the list");
                }
                else {
                    System.out.println("the number has been deleted by you is");
                    int rimove_number= (int) myLinkedlist.removeFront();
                    System.out.print(" "+ rimove_number);
                }
            }
            else if(value==0){
                Node<Integer> temp=myLinkedlist.avallist;
                while (temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
                System.exit(0);
            }
            else if(value>9||value<0){
                System.out.println("plase enter number between 0-9");
                break;
            }
        }
    }
}

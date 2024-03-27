import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       MyLinkedlist<Person>queue=new MyLinkedlist<>();
       MyLinkedlist<Person>inside=new MyLinkedlist<>();
       MyLinkedlist<Person>all=new MyLinkedlist<>();

        for (int i = 0; i <100 ; i++) {
            Person person=new Person(false);
            person.setEntryT(0);
            queue.addFront(person);
            all.addFront(person);
        }
        int period=20;
        int time=0;
        while (time<=28800) {
            MyLinkedlist<Person> temp = new MyLinkedlist<>();
            if (90 - inside.size() >= 35) {
                for (int i = 0; i < 35; i++) {
                    if (queue.peekFront() != null) {
                        Person temp1 = queue.removeFront();
                        temp1.setExitT(time);
                        inside.addFront(temp1);
                    }
                }
                continue;
            }
            int size = inside.size();
            for (int i = 0; i < size; i++) {
                Person temp1 = inside.removeFront();
                temp1.setVisitT(temp1.getVisitT() - 20);
                temp.addFront(temp1);
                if (temp.peekFront().getVisitT() <= 0) {
                    temp.removeFront();
                }
            }
            size = temp.size();
            for (int i = 0; i < size; i++) {
                inside.addFront(temp.removeFront());
            }
            if(time<28200){
                Person person;
                if (time % 300 == 0) {
                    person = new Person(true);
                    queue.addFront(person);

                } else {
                    person = new Person(false);
                    queue.addBack(person);
                }
                person.setEntryT(time);
                all.addFront(person);
            }
            time+=period;

        }
        double average=0;
        double ceoAverage=0;
        int size=all.size();
        int count=0;
        int ceoCount=0;
        for (int i = 0; i <size ; i++) {
            Person person=all.removeFront();
            if (person.isCeo()){
                ceoAverage+=(person.getExitT()-person.getEntryT());
                ceoCount++;
            }
            else {
                average+=(person.getExitT()-person.getEntryT());
                count++;
            }
        }
        System.out.println("average normal people waiting time:"+average/count+" sec");

        System.out.println("average ceo waiting time:"+ceoAverage/ceoCount+" sec");

    }
}

import java.util.Random;

public class Person {
    private int visitT;
    private int entryT;
    private int exitT;
    static int ceoCount;
    static int count=0;
    private boolean ceo;
    public Person(Boolean flag){
        if(flag){
            if(count<6){
                visitT=1200;
            }
            else if (count<8){
                visitT=600;
            }
            else if (count<10){
                visitT=2400;
            }
            else {
                count=0;
            }
            count++;
        }
        else {
            if(ceoCount<6){
                visitT=1200;
            }
            else if (ceoCount<8){
                visitT=600;
            }
            else if (ceoCount<10){
                visitT=2400;
            }
            else {
                ceoCount=0;
            }
            ceoCount++;
        }
        ceo=flag;
    }

    public int getVisitT() {
        return visitT;
    }

    public int getEntryT() {
        return entryT;
    }

    public int getExitT() {
        return exitT;
    }

    public void setVisitT(int visitT) {
        this.visitT = visitT;
    }

    public void setEntryT(int entryT) {
        this.entryT = entryT;
    }

    public void setExitT(int exitT) {
        this.exitT = exitT;
    }

    public boolean isCeo() {
        return ceo;
    }

    public void setCeo(boolean ceo) {
        this.ceo = ceo;
    }
}

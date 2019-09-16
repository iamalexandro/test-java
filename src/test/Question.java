package test;
/**
 * @author nicola
 */
public class Question {
    
    //Text of the question ¿?
    public static String question;
    //Posibles answers
    public static String a1, a2, a3, a4;
    
    public Question(){
        
    }

    public Question(String quest, String a1, String a2, String a3, String a4) {
        this.question = quest;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public String getQuest() {
        return question;
    }

    public void setQuest(String quest) {
        this.question = quest;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }
    
    
    
    
    
}

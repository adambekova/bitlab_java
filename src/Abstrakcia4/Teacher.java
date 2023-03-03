package Abstrakcia4;

import javax.security.auth.login.LoginContext;

public class Teacher extends User {
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects;

    public Teacher() {
        super();
        nickName = "no nickName";
        status = "no status";
        sizeOfSubjects = 0;
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }
    public String getNickName(){
        return nickName;
    }
    public String getStatus(){
        return status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void addSubject(String subject){
        subjects[sizeOfSubjects]=subject;
        sizeOfSubjects++;
    }

    @Override
    public String getUserData() {
        return "ID:"+" "+id+" "+"LOGIN:"+" "+ login+" "+"PASSWORD:"+" "+password+" "+"NICKNAME:"+" "+nickName+" "+"STATUS:"+" "+status;
    }
}

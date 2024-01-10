package com.telran.com.homeEleven;

public class UserRequest {

    private String addres;
    private Answer answer;

    public UserRequest(String addres, Answer answer) {
        this.addres = addres;
        this.answer = answer;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}

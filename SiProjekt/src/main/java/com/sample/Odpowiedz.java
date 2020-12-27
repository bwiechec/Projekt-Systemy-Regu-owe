package com.sample;

public class Odpowiedz{
    private String question;
    private String answer;

    //----------------------------------------------------
    public Odpowiedz(String pytanie, String odpowiedz) {
        this.question = pytanie;
        this.answer = odpowiedz;
    }
    //----------------------------------------------------
    
    
    //----------------------------------------------------
    public String getPytanie() {
        return question;
    }
    public String getOdpowiedz() {
        return answer;
    }
    //----------------------------------------------------
    
    
    
    //----------------------------------------------------
    public void setOdpowiedz(String odpowiedz) {
        this.answer = odpowiedz;
    }
    //----------------------------------------------------

}
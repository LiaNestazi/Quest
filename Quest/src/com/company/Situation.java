package com.company;

public class Situation {
    Situation[] direction;
    String subject,text;
    int dS,dK,dM;
    public Situation (String subject, String text, int variants, int ds,int dk,int dm) {
        this.subject=subject;
        this.text=text;
        dS=ds;
        dK=dk;
        dM=dm;
        direction=new Situation[variants];
    }
}

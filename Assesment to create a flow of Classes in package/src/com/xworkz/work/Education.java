package com.xworkz.work;

import com.xworkz.governament.Skill;
public class Education {
    String degree;
    Skill skill;

    public Education(String degree){
        this.degree=degree;
        this.skill=new Skill("Software Development");
    }
    public void display(){
        System.out.println("Education required is : "+degree);
        skill.display();

    }
}

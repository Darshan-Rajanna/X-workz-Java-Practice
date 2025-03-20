package com.xworkz.services;

import com.xworkz.entities.Clip;

public class Pushpa{
    public void useClip(Clip[] clip){
        if(clip!=null){
            for(Clip clips:clip){
                clips.hold();
            }
        }
    }
}
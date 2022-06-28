package com.company;

import java.util.ArrayList;

public class FactuurManager {
    String bestelUpdate;
    ArrayList<FactuurObserver> notifyfactuur;

    public FactuurManager() {
    }

        void setfactuurs(){
        notifyfactuur = new ArrayList<FactuurObserver>();
        notifyfactuur.add(new Factuur());
    }

    public void notifyAllObservers(){
        for (FactuurObserver observer : notifyfactuur) {
            observer.update(this.bestelUpdate);
        }
    }

    void setBestelUpdate(String bestelUpdate){
        this.bestelUpdate = bestelUpdate;
        notifyAllObservers();
    }

}

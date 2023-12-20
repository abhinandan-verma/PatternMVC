package com.example.patternmvc.ui;

import com.example.patternmvc.util.MyModel;

// This will Act as Presenter [The Waiter] :
public class Presenter {
    // The link between Presenter and the view (MainActivity) is done by interface

    // Link Instance
    AppView appView;

    public Presenter(AppView appView) {
        this.appView = appView;
    }

    // Linkage btw the Presenter and the Model
    public MyModel getAppFromMode(){
        return new MyModel("Pathsala ",100000, 4.99F);
    }

    //3- linkage between presenter and MainActivity {calling the Interface}
    public void getAppDetails(){
        appView.onGetAppName(getAppFromMode().getAppName() +" Downloads "+ getAppFromMode().getAppDownloads() +" App Rating "+ getAppFromMode().getAppRating());

    }
}

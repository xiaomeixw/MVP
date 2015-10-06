package xiongwei.mvp.presenter;

import xiongwei.mvp.view.MainView;

/**
 * Created by xiongwei , An Android project Engineer.
 * Data : 2015-10-03  14:32
 * Describe:
 *      The implementer
 * Version : 1.0
 * Open Source ：MVP
 */
public class MainPresenter implements Presenter<MainView> {

    private MainView view;

    @Override
    public void attachView(MainView view) {
        this.view=view;
    }

    @Override
    public void detachView() {
        this.view=null;
    }

    //Requests for data,then Notice  view  update
    public void getData(){


        
    }


}

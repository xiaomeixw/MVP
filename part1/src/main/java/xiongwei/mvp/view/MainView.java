package xiongwei.mvp.view;

import java.util.List;

import xiongwei.mvp.model.User;

/**
 * Created by xiongwei , An Android project Engineer.
 * Data : 2015-10-03  14:32
 * Describe:
 *       interface view , Communication activity-view and Presenter,activity-view should Implement all the methods
 * Version : 1.0
 * Open Source ：MVP
 */
public interface MainView extends  View{

    void showData(List<User> list);

    void showMessage(String message);

    void showLoading();


}

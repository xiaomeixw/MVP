package xiongwei.mvp.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import java.util.List;

import xiongwei.mvp.model.User;

/**
 * Created by xiongwei , An Android project Engineer.
 * Data : 2015-10-03  14:32
 * Describe:
 *       Activity-view
 * Version : 1.0
 * Open Source ：MVP
 */
public class MainViewActivity extends Activity implements MainView{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }



    //MainView需要实现的内容
    @Override
    public void showData(List<User> list) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public Context getContext() {
        return null;
    }
}

package xiongwei.mvp.presenter;

/**
 * Created by xiongwei , An Android project Engineer.
 * Data : 2015-10-03  14:32
 * Describe:
 *       Base Presenter class,interface type,Pass View through generic
 * Version : 1.0
 * Open Source ：MVP
 */
public interface Presenter<V> {

    //binding view
    void attachView(V view);

    //unbundling view
    void detachView();

}

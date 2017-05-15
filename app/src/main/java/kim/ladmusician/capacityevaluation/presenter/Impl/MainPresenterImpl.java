package kim.ladmusician.capacityevaluation.presenter.Impl;

import kim.ladmusician.capacityevaluation.presenter.MainPresenter;
import kim.ladmusician.capacityevaluation.view.MainView;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class MainPresenterImpl implements MainPresenter {
    private MainView mainView;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }

    // view initializing.
    @Override
    public void onInitView() {
        mainView.initView();
    }
}

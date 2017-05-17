package kim.ladmusician.capacityevaluation.presenter;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public interface MainPresenter extends BasePresenter {
    void loadItems();

    interface View {
        void refresh();
    }
}

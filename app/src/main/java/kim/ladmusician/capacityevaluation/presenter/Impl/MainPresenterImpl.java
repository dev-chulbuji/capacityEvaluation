package kim.ladmusician.capacityevaluation.presenter.Impl;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kim.ladmusician.capacityevaluation.adapter.model.AdapterDataModel;
import kim.ladmusician.capacityevaluation.entity.ResultDTO;
import kim.ladmusician.capacityevaluation.network.BookService;
import kim.ladmusician.capacityevaluation.presenter.MainPresenter;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class MainPresenterImpl implements MainPresenter {
    private View view;
    private AdapterDataModel dataModel;
    private BookService mService;

    public MainPresenterImpl(View view, AdapterDataModel dataModel) {
        this.view = view;
        this.dataModel = dataModel;
    }

    @Override
    public void loadItems() {
        getService().getApi().getItems()
                .subscribeOn(Schedulers.newThread())
                .map(ResultDTO::getItems)
                .flatMapIterable(books -> books)
                .flatMap(Observable::just)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(dataModel::add, Throwable::printStackTrace, view::refresh);
    }

    public BookService getService() {
        if (mService == null)
            mService = new BookService();

        return mService;
    }
}

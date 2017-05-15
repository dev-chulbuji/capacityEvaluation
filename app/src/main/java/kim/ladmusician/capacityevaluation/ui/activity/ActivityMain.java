package kim.ladmusician.capacityevaluation.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.adapter.ImageAdapter;
import kim.ladmusician.capacityevaluation.presenter.Impl.MainPresenterImpl;
import kim.ladmusician.capacityevaluation.ui.base.BaseActivity;
import kim.ladmusician.capacityevaluation.view.MainView;

public class ActivityMain extends BaseActivity implements MainView {
    private static final String TAG = ActivityMain.class.getSimpleName();

    private ImageAdapter mAdatper = null;

    @BindView(R.id.item_container)
    RecyclerView mContainer;

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void setPresenter(@Nullable Bundle savedInstanceState) {
        basePresenter = new MainPresenterImpl(this);
        basePresenter.onInitView();
    }

    @Override
    public void initView() {
        mContainer.setHasFixedSize(true);
        mContainer.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mAdatper = new ImageAdapter();
        mContainer.setAdapter(mAdatper);
    }

    @Override
    public void showItems() {

    }

    @Override
    public void startLoading() {

    }

    @Override
    public void showEmptyView() {

    }
}

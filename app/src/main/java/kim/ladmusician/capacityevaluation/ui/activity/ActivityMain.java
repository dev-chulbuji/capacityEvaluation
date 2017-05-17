package kim.ladmusician.capacityevaluation.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import butterknife.BindView;
import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.adapter.BookAdapter;
import kim.ladmusician.capacityevaluation.presenter.Impl.MainPresenterImpl;
import kim.ladmusician.capacityevaluation.ui.base.BaseActivity;


public class ActivityMain extends BaseActivity implements MainPresenterImpl.View {
    private static final String TAG = ActivityMain.class.getSimpleName();

    @BindView(R.id.item_container)
    RecyclerView mContainer;

    @BindView(R.id.loading)
    ProgressBar progressBar;

    private BookAdapter mAdapter = null;

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {
        mAdapter = new BookAdapter(this);
        mContainer.setHasFixedSize(true);
        mContainer.setLayoutManager(new GridLayoutManager(this, 3));
        mContainer.setAdapter(mAdapter);

        mAdapter.setOnRecyclerItemClickListener((adapter1, position) -> {
            //mainPresenter.onPhotoItemClick(position);
        });

        basePresenter = new MainPresenterImpl(this, mAdapter);
        getPresenter().loadItems();
    }

    @Override
    public void refresh() {
        mAdapter.refresh();
        progressBar.setVisibility(View.GONE);
    }

    public MainPresenterImpl getPresenter() {
        return (MainPresenterImpl) basePresenter;
    }
}

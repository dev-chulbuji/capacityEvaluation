package kim.ladmusician.capacityevaluation.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.entity.Book;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class BookViewHolder extends BaseViewHolder<Book> {
    @BindView(R.id.item_image)
    ImageView ivImage;

    public BookViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void bindView(Context ctx, int position, Book item, OnRecyclerItemClickListener listener) {
        Glide.with(ctx)
                .load(item.getImage())
                .centerCrop()
                .crossFade()
                .into(ivImage);
    }

    @Override
    public void bindView(int position, Book item, OnRecyclerItemClickListener listener) {

    }
}

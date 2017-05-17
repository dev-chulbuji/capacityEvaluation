package kim.ladmusician.capacityevaluation.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import kim.ladmusician.capacityevaluation.R;
import kim.ladmusician.capacityevaluation.adapter.viewholder.BookViewHolder;
import kim.ladmusician.capacityevaluation.entity.Book;
import kim.ladmusician.capacityevaluation.interfaces.OnRecyclerItemClickListener;

/**
 * Created by ladmusician on 2017. 5. 15..
 */

public class BookAdapter extends BaseAdapter<Book, BookViewHolder> {
    private static final String TAG = BookAdapter.class.getSimpleName();

    public BookAdapter(Context ctx) {
        super(ctx);
    }

    @Override
    public void add(Book item) {
        Log.e(TAG, "add item");
        addItem(item);
    }

    @Override
    public void remove(int position) {
        removeItem(position);
    }

    @Override
    public void refresh() {
        notifyDataSetChanged();
    }

    @Override
    public void setItemClickListener(OnRecyclerItemClickListener listener) {

    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BookViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false));
    }

    @NonNull
    @Override
    protected Object getModelId(@NonNull Book model) {
        return null;
    }
}

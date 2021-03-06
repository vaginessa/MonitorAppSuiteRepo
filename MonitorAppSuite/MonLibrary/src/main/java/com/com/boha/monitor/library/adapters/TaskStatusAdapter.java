package com.com.boha.monitor.library.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.boha.monitor.library.R;
import com.com.boha.monitor.library.dto.TaskStatusDTO;
import com.com.boha.monitor.library.util.Statics;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class TaskStatusAdapter extends ArrayAdapter<TaskStatusDTO> {

    private final LayoutInflater mInflater;
    private final int mLayoutRes;
    private List<TaskStatusDTO> mList;
    private Context ctx;

   public TaskStatusAdapter(Context context, int textViewResourceId,
                            List<TaskStatusDTO> list) {
        super(context, textViewResourceId, list);
        this.mLayoutRes = textViewResourceId;
        mList = list;
        ctx = context;
        this.mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    View view;


    static class ViewHolderItem {
        TextView txtName;
        TextView txtNumber;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderItem item;
        if (convertView == null) {
            convertView = mInflater.inflate(mLayoutRes, null);
            item = new ViewHolderItem();
            item.txtName = (TextView) convertView
                    .findViewById(R.id.TST_txtName);
            item.txtNumber = (TextView) convertView
                    .findViewById(R.id.TST_txtNumber);

            convertView.setTag(item);
        } else {
            item = (ViewHolderItem) convertView.getTag();
        }

        TaskStatusDTO p = mList.get(position);
        item.txtName.setText(p.getTaskStatusName());
        item.txtNumber.setText(""+(position+ 1));

        Statics.setRobotoFontLight(ctx,item.txtNumber);
        Statics.setRobotoFontLight(ctx, item.txtName);

        animateView(convertView);
        return (convertView);
    }

    public void animateView(final View view) {
        Animation a = AnimationUtils.loadAnimation(ctx, R.anim.grow_fade_in_center);
        a.setDuration(500);
        if (view == null)
            return;
        view.startAnimation(a);
    }

    static final Locale x = Locale.getDefault();
    static final SimpleDateFormat y = new SimpleDateFormat("dd MMMM yyyy", x);
    static final DecimalFormat df = new DecimalFormat("###,###,##0.0");
}

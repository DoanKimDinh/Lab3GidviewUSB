package doankimdinh.i.gridviewusb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context ctx;
    private int layout;
    private ArrayList<ElectricThing> arrayList;

    public CustomAdapter(Context ctx, int layout, ArrayList<ElectricThing> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(ctx).inflate(layout,parent,false);

            viewHolder = new ViewHolder();
            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvreducePercent = convertView.findViewById(R.id.tvreducePercent);
            viewHolder.tvpeopleRate = convertView.findViewById(R.id.tvpersonRate);
            viewHolder.tvnewPrice = convertView.findViewById(R.id.tvNewPrice);
            viewHolder.imgThing = convertView.findViewById(R.id.imgThing);

            viewHolder.rtbRate = convertView.findViewById(R.id.rtBar);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.tvName.setText(arrayList.get(position).getName());
        viewHolder.tvnewPrice.setText(String.valueOf(arrayList.get(position).getNewPrice()));
        viewHolder.tvpeopleRate.setText(String.valueOf(arrayList.get(position).getPeopleRate()));
        viewHolder.tvreducePercent.setText(String.valueOf(arrayList.get(position).getReducePercent()));

        viewHolder.imgThing.setImageResource(arrayList.get(position).getImageThing());
        viewHolder.rtbRate.setRating(arrayList.get(position).getRate());
        return convertView;
    }
    private class ViewHolder{
        TextView tvName;
        TextView tvnewPrice;
        TextView tvpeopleRate;
        TextView tvreducePercent;
        ImageView imgThing;
        RatingBar rtbRate;
    }
}

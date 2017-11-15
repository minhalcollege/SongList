package minhal.tomerbu.edu.songlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ANDROID on 12/11/2017.
 */


public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs; //init
    private LayoutInflater inflater; //inflates an xml to an Object (View)
    private Context context;
    //constructor:


    public SongAdapter(ArrayList<Song> songs, LayoutInflater inflater, Context context) {
        this.songs = songs;
        this.inflater = inflater;
        this.context = context;
    }

    //how many songs?
    @Override
    public int getCount() {
        return songs.size();
    }

    //return a View!!!
    //A Song View
    //we already have an xml file (song_item.xml) -> View
    //for this we need the inflater.
    @Override
    public View getView(final int position, View v, ViewGroup listView) {
        //ViewGroup Layout: coordinator, relativeLayout, listView, recycler

        if (v == null) {
            //if the view is null -> inflate a new one.
            //ViewGroup extends View
            //@LayoutRes -> R.layout.song_item
            v = inflater.inflate(R.layout.song_item, listView, false);
        }
        //else{
            //use the v (recycle the view we got as a parameter)
        //}

        //but first : Data Binding.

        //findViewById - > tvArtist, tvTitle, tvDuration, ivSong
        TextView tvTitle = v.findViewById(R.id.tvTitle);
        TextView tvArtist = v.findViewById(R.id.tvArtist);
        TextView tvDuration = v.findViewById(R.id.tvDuration);
        ImageView ivArtist = v.findViewById(R.id.ivArtist);


        //TODO: Add onItemClickListener.

        final Song s = songs.get(position);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ///Context
                Toast.makeText(context, "Position: " + position, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s.getUrl()));
                context.startActivity(intent);
            }
        });



        //s.getUrl()//intent (action View, URL!)
        //data binding
        tvArtist.setText(s.getArtist());
        tvTitle.setText(s.getTitle());
        tvDuration.setText(s.getDuration());
        ivArtist.setImageResource(s.getImageResID());
        return v;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //does not compile
}


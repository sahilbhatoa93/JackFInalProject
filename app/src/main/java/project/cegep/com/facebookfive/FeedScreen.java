package project.cegep.com.facebookfive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by SAHIL BHATOA on 22-Apr-17.
 */

public class FeedScreen extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootview = inflater.inflate(R.layout.fragment_feed, container, false);
        TextView view=(TextView)rootview.findViewById(R.id.whattextview);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),postingPage.class);
                startActivity(i);
            }
        });
         return rootview;
    }






    @Override
    public void onDestroy() {

        super.onDestroy();
    }
}

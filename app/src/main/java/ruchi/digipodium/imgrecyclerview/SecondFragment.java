package ruchi.digipodium.imgrecyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments()!=null){
            SecondFragmentArgs args= SecondFragmentArgs.fromBundle(getArguments());
            TextView textTitle = view.findViewById(R.id.textTitle);
            TextView textDescription = view.findViewById(R.id.textDescription);
            ImageView imageBook= view.findViewById(R.id.imageBook);
            textTitle.setText(args.getTitle());
            textDescription.setText(args.getDescription());
           Glide.with(this).load(args.getImage()).into(imageBook);

        }
    }
}
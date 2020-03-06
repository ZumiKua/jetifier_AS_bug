package cos.mos.jigsaw;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

/**
 * A simple {@link Fragment} subclass.
 */
public class GdxFragment extends AndroidFragmentApplication {

    public GdxFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return initializeForView(new JigsawGame());
    }
}

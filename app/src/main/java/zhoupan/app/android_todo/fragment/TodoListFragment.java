package zhoupan.app.android_todo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import zhoupan.app.andriod.com.andriod_todo.R;

/**
 * Created by zhoupan_rmbp on 15/5/22.
 */
public class TodoListFragment extends Fragment {

    String[] data = {"mcrm发布", "malone hsf服务提供",
            "stockton管理后台", "stockton发布"
    };

    public TodoListFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_fragment, container, false);
        ListView listView = (ListView) view.findViewById(R.id.content_list_view);
        listView.setAdapter(new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, data
        ));
        return view;
    }
}

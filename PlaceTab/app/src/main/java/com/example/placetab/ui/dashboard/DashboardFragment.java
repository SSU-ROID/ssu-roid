package com.example.placetab.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.placetab.Favorite;
import com.example.placetab.MapsActivity;
import com.example.placetab.R;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private Button btn_Googlemap;
    private Button btn_favorite;
    private ListView list;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        list = (ListView)root.findViewById(R.id.place);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter); //list에 adapter을 연결하는 과정

        data.add("IT학부 테라스\n[정보과학관 2~5층 중앙복도]"); //내가 원하는 리스트목록 생성
        data.add("도담식당\n[신양관 2층]");
        data.add("학생회관 생협\n[학생회관 4층]");
        data.add("융합특성화자유전공학부 과방\n[문화관 303호]");
        data.add("숭실마루\n[중앙도서관 6층]");
        data.add("IT학부 사무실\n[정보과학관 1층]");
        data.add("기숙사 식당\n[레지던스홀 지하 1층]");
        data.add("학생회관 식당\n[학생회관 3층]");
        data.add("동아리방\n[학생회관 1~3층]");
        data.add("푸드코트\n[학생회관 2층]");
        data.add("스넥코너\n[학생회관 3층]");
        data.add("The Kitchen\n[전산관 1층]");
        data.add("카페331\n[웨스트민스트홀 3층]");
        data.add("서점\n[신양관 1층]");
        data.add("스페이스엔\n[정보과학관 지하 1층]");
        data.add("우체국\n[신양관 지하 1층]");
        data.add("우리은행\n[신양관 지하 1층]");
        data.add("체육관\n[조만식기념관 101호]");
        adapter.notifyDataSetChanged(); //내가 입력한 정보 저장

        Button btn_Googlemap = (Button) root.findViewById(R.id.btn_Googlemap);
        btn_Googlemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MapsActivity.class);
                startActivity(intent); //구글맵 액티비티로 이동시켜주는 구문
            }
        });

       /* Button btn_favorite = (Button) root.findViewById(R.id.btn_favorite);
        btn_Googlemap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Favorite.class);
                startActivity(intent); //즐겨찾기 액티비티로 이동시켜주는 구문
            }
        }); */

        return root;

    }

}
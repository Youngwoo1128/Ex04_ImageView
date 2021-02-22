package com.mac_available.ex04imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Button btnusa, btncan, btnand;
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);
        btnusa = findViewById(R.id.btn01);
        btncan= findViewById(R.id.btn02);
        btnand = findViewById(R.id.btn03);

        //버튼이 클릭되는 것을 듣는 리스너 객체를 버튼에 설정
        btnusa.setOnClickListener(listener);
        btncan.setOnClickListener(listener);
        btnand.setOnClickListener(listener);

        //ImageView를 클릭하는 것을 듣는 리스너 객체 생성 및 설정
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(R.drawable.america+num);
                num++;
                if(num==10) num=0;
                if (num>=3) num = 9;
            }
        });
    }
    //버튼이 클릭되는것을 듣는 리스너 객체 - 멤버변수로.
    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v){//이 메소드의 파라미터로 전달된 v는 클릭을 한 버튼객체를 참조함
            //이 리스너가 감시하는 버튼이 클릭되면 자동 실행
            //v가 참조하는 버튼의 id를 얻어와서 구별
            int id = v.getId();
            switch (id){//리얼쌉 중요
                case R.id.btn01:
                iv.setImageResource(R.drawable.america);
                break;

                case  R.id.btn02:
                iv.setImageResource(R.drawable.canada);
                break;

                case  R.id.btn03:
                iv.setImageResource(R.drawable.ic_launcher_foreground);
                break;

            }

        }
    };
}
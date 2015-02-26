package com.example.text;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final String LOG_TAG = "PersonalTax";  
    
    private TextView tvYanglaoNum, tvYiliaoNum, tvShiyeNum, tvZhufangNum;  
    private EditText etShuiqianNum, etShuihouNum, etGeshui;  
    private EditText etYanglao, etYiliao, etShiye, etZhufang;  
    private EditText etShebaoBase, etYiliaoBase, etZhufangBase, etQizhengdianBase;  
    private Button btnJisuan;  
      
    /** Called when the activity is first created. */  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
          
//        setTitle("��˰ͨ������������˰������");  
          
        // �籣��ס��������ɷѽ��  
        tvYanglaoNum = (TextView)findViewById(R.id.tvYanglaoNum);  
        tvYiliaoNum = (TextView)findViewById(R.id.tvYiliaoNum);  
        tvShiyeNum = (TextView)findViewById(R.id.tvShiyeNum);  
        tvZhufangNum = (TextView)findViewById(R.id.tvZhufangNum);  
          
        // ˰ǰ˰���Լ���������˰���  
        etShuiqianNum = (EditText)findViewById(R.id.etShuiqianNum);  
        etShuiqianNum.addTextChangedListener(new TextWatcher() {  
  
            @Override  
            public void afterTextChanged(Editable arg0) {  
                // TODO Auto-generated method stub  
                // ����������ͬ����ʾ���籣������ҽ�ƻ�����ס�������������  
                etShebaoBase.setText(etShuiqianNum.getText());  
                etYiliaoBase.setText(etShuiqianNum.getText());  
                etZhufangBase.setText(etShuiqianNum.getText());  
            }  
  
            @Override  
            public void beforeTextChanged(CharSequence s, int start, int count,  
                    int after) {  
                // TODO Auto-generated method stub  
                  
            }  
  
            @Override  
            public void onTextChanged(CharSequence s, int start, int before,  
                    int count) {  
                // TODO Auto-generated method stub  
                  
            }  
              
        });  
          
        etShuihouNum = (EditText)findViewById(R.id.etShuihouNum);  
        etGeshui = (EditText)findViewById(R.id.etGeshui);  
          
        // �籣��ס��������ɷѱ���  
        etYanglao = (EditText)findViewById(R.id.etYanglao);  
        etYiliao = (EditText)findViewById(R.id.etYiliao);  
        etShiye = (EditText)findViewById(R.id.etShiye);  
        etZhufang = (EditText)findViewById(R.id.etZhufang);  
          
        // �籣��ס��������ɷѻ���  
        etShebaoBase = (EditText)findViewById(R.id.etShebaoBase);  
        etYiliaoBase = (EditText)findViewById(R.id.etYiliaoBase);  
        etZhufangBase = (EditText)findViewById(R.id.etZhufangBase);  
        etQizhengdianBase = (EditText)findViewById(R.id.etQizhengdianBase);  
          
        // ����  
        btnJisuan = (Button)findViewById(R.id.btnJisuan);  
        btnJisuan.setOnClickListener(new OnClickListener() {  
            @Override  
            public void onClick(View v) {  
                // TODO Auto-generated method stub  
                // �����˰  
                String strShuiqian = etShuiqianNum.getText().toString();  
                if (strShuiqian.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "������˰ǰ���룡", Toast.LENGTH_SHORT).show();  
                    etShuiqianNum.requestFocus();  
                    return;  
                }  
                  
                String strYanglao = etYanglao.getText().toString();  
                if (strYanglao.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "���������Ͻɷѱ�����", Toast.LENGTH_SHORT).show();  
                    etYanglao.requestFocus();  
                    return;  
                }  
                String strYiliao = etYiliao.getText().toString();  
                if (strYiliao.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "������ҽ�ƽɷѱ�����", Toast.LENGTH_SHORT).show();  
                    etYiliao.requestFocus();  
                    return;  
                }  
                String strShiye = etShiye.getText().toString().trim();  
                if (strShiye.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "������ʧҵ�ɷѱ�����", Toast.LENGTH_SHORT).show();  
                    etShiye.requestFocus();  
                    return;  
                }   
                String strZhufang = etZhufang.getText().toString();  
                if (strZhufang.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "������ס��������ɷѱ�����", Toast.LENGTH_SHORT).show();  
                    etZhufang.requestFocus();  
                    return;  
                }  
                String strShebaoBase = etShebaoBase.getText().toString();  
                if (strShebaoBase.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "�������籣�ɷѻ�����", Toast.LENGTH_SHORT).show();  
                    etShebaoBase.requestFocus();  
                    return;  
                }   
                String strYiliaoBase = etYiliaoBase.getText().toString();  
                if (strYiliaoBase.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "������ҽ�ƽɷѻ�����", Toast.LENGTH_SHORT).show();  
                    etYiliaoBase.requestFocus();  
                    return;  
                }   
                String strZhufangBase = etZhufangBase.getText().toString();  
                if (strZhufangBase.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "������ס��������ɷѻ�����", Toast.LENGTH_SHORT).show();  
                    etZhufangBase.requestFocus();  
                    return;  
                }   
                String strQizhengdianBase = etQizhengdianBase.getText().toString();  
                if (strQizhengdianBase.length() <= 0) {  
                    Toast.makeText(getApplicationContext(), "�������������˰�����㣡", Toast.LENGTH_SHORT).show();  
                    etQizhengdianBase.requestFocus();  
                    return;  
                }   
                  
                try{  
                    float shuiqianNum = Float.parseFloat(strShuiqian);  
                    float yanglaoNum = Float.parseFloat(strYanglao);  
                    float yiliaoNum = Float.parseFloat(strYiliao);  
                    float shiyeNum = Float.parseFloat(strShiye);  
                    float zhufangNum = Float.parseFloat(strZhufang);  
                    float shebaoBase = Float.parseFloat(strShebaoBase);  
                    float yiliaoBase = Float.parseFloat(strYiliaoBase);  
                    float zhufangBase = Float.parseFloat(strZhufangBase);  
                    float qizhengdianBase = Float.parseFloat(strQizhengdianBase);  
                      
                    // ���Ͻ��ɽ��  
                    float yanglao = shebaoBase * yanglaoNum * 0.01f;  
                    tvYanglaoNum.setText(String.valueOf(yanglao));  
                      
                    // ҽ�ƽ��ɽ��  
                    float yiliao = yiliaoBase * yiliaoNum * 0.01f + 3;  
                    tvYiliaoNum.setText(String.valueOf(yiliao));  
                      
                    // ʧҵ���ɽ��  
                    float shiye = shebaoBase * shiyeNum * 0.01f;  
                    tvShiyeNum.setText(String.valueOf(shiye));  
                      
                    // ס����������ɽ��  
                    float zhufang = zhufangBase * zhufangNum * 0.01f;  
                    tvZhufangNum.setText(String.valueOf(zhufang));  
                      
                    // �����˰  
                    float shuihou = shuiqianNum - yanglao - yiliao - shiye - zhufang;  
                    float geshui = 0f;  
                    if (shuihou > qizhengdianBase) {  
                        // ��Ҫ��˰  
                        float jiaoshuiBase = shuihou - qizhengdianBase;  
                        if (jiaoshuiBase <= 500) {  
                            geshui = jiaoshuiBase * 0.05f;  
                        } else if (jiaoshuiBase > 500 && jiaoshuiBase <= 2000) {  
                            geshui = jiaoshuiBase * 0.1f - 25;  
                        } else if (jiaoshuiBase > 2000 && jiaoshuiBase <= 5000) {  
                            geshui = jiaoshuiBase * 0.15f - 125;  
                        } else if (jiaoshuiBase > 5000 && jiaoshuiBase <= 20000) {  
                            geshui = jiaoshuiBase * 0.2f - 375;  
                        } else if (jiaoshuiBase > 20000 && jiaoshuiBase <= 40000) {  
                            geshui = jiaoshuiBase * 0.25f - 1375;  
                        } else if (jiaoshuiBase > 40000 && jiaoshuiBase <= 60000) {  
                            geshui = jiaoshuiBase * 0.3f - 3375;  
                        } else if (jiaoshuiBase > 60000 && jiaoshuiBase <= 80000) {  
                            geshui = jiaoshuiBase * 0.35f - 6375;  
                        } else if (jiaoshuiBase > 80000 && jiaoshuiBase <= 100000) {  
                            geshui = jiaoshuiBase * 0.4f - 10375;  
                        } else if (jiaoshuiBase > 100000) {  
                            geshui = jiaoshuiBase * 0.45f - 15375;  
                        }  
                    }  
                    shuihou -= geshui;  
                    if (shuihou < 0f) {  
                        Toast.makeText(getApplicationContext(), "˰������Ϊ���������������Ƿ���ȷ��", Toast.LENGTH_SHORT).show();  
                        etShuihouNum.setTextColor(Color.RED);  
                    } else {  
                        etShuihouNum.setTextColor(Color.BLUE);  
                    }  
                    etShuihouNum.setText(String.valueOf(shuihou));  
                    etGeshui.setText(String.valueOf(geshui));  
                } catch(Exception e) {  
                    e.printStackTrace();  
                    Log.e(LOG_TAG, "parseFloat ERROR!!!");  
                }  
            }  
        });  
    }  
}

# Webview-Intent
the fifth dormitory
# 实验内容
自定义WebView验证隐式Intent的使用<br><br>
实验包含两个应用：<br>
&nbsp;&nbsp;&nbsp;&nbsp;第一个应用：获取URL地址并启动隐式Intent的调用<br>
&nbsp;&nbsp;&nbsp;&nbsp;第二个应用：自定义WebView来加载URL<br>
# 主要代码
## MyBrowser
```
public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.wv);
        webView.setWebViewClient(new WebViewClient());
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null){
            String address=bundle.getString("address");
            webView.loadUrl(address);
        }
    }
}

```
## IntentExample
```
public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClick(View view){
        Intent intent=new Intent();
        editText=findViewById(R.id.et);
        intent.setAction("android.intent.action.VIEW");
        String url=editText.getText().toString();
        intent.putExtra("address",url);
        startActivity(intent);

    }
}
```
# 实验截图

<img src=https://github.com/smartflowers/Webview-Intent/blob/master/pictures/init.jpg width="200" />
<img src=https://github.com/smartflowers/Webview-Intent/blob/master/pictures/selectapp.jpg width="200" />
<img src=https://github.com/smartflowers/Webview-Intent/blob/master/pictures/webview.jpg width="200" />

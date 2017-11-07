package jljt.wangs.com.basemoudle.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import jljt.wangs.com.basemoudle.R;
import jljt.wangs.com.basemoudle.R2;

/**
 * Created by Administrator on 2017/11/6.
 */

public abstract class BaseActivity extends RxAppCompatActivity{

    private Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        unbinder= ButterKnife.bind(this);//黄油刀
        initViews(savedInstanceState);//初始化
        initToobar();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder!=null){
            unbinder.unbind();
        }
    }
    public abstract int getLayoutID();
    public abstract void initViews(Bundle savedInstanceState);
    public abstract void initToobar();
}

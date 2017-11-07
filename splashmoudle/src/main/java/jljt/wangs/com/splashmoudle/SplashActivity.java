package jljt.wangs.com.splashmoudle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import cn.bingoogolapple.bgabanner.BGABanner;
import jljt.wangs.com.basemoudle.Base.BaseActivity;

/**
 * Created by Administrator on 2017/11/6.
 */

public class SplashActivity extends BaseActivity {
    @BindView(R2.id.banner_guide_backgrounds)
    BGABanner mBackgroundBanner;
    @BindView(R2.id.banner_guide_foregrounds)
    BGABanner mForegroundBanner;
    @BindView(R2.id.tv_guide_skip)
    TextView tv_guide_skip;
    @Override
    public int getLayoutID() {
        return R.layout.activity_splash;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        processLogic();
        setListener();
//        tv_guide_skip.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(SplashActivity.this,"???????",Toast.LENGTH_LONG).show();
//            }
//        });
    }


    @Override
    public void initToobar() {

    }
    private void setListener() {
        /**
         * 设置进入按钮和跳过按钮控件资源 id 及其点击事件
         * 如果进入按钮和跳过按钮有一个不存在的话就传 0
         * 在 BGABanner 里已经帮开发者处理了防止重复点击事件
         * 在 BGABanner 里已经帮开发者处理了「跳过按钮」和「进入按钮」的显示与隐藏
         */
        mForegroundBanner.setEnterSkipViewIdAndDelegate(R.id.btn_guide_enter, R.id.tv_guide_skip, new BGABanner.GuideDelegate() {
            @Override
            public void onClickEnterOrSkip() {
//                startActivity(new Intent(SplashActivity.this, MainAc.class));
//                finish();
            }
        });
    }
    private void processLogic() {
        // 设置数据源
        mBackgroundBanner.setData(R.mipmap.yd1, R.mipmap.yd2, R.mipmap.yd3);

        mForegroundBanner.setData(R.color.transparent,R.color.transparent, R.color.transparent);
    }
}

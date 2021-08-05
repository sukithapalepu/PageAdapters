import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.pageadapters.R;

public class ImageAdapter extends PagerAdapter {
    private Context mcontext;
    private int[] mImageids = new int[]
            {
                    R.drawable.image1, R.drawable.image2, R.drawable.image5, R.drawable.image6};

    ImageAdapter (Context context) {
        mcontext = context;
    }
    @Override
    public int getCount() {
        return mImageids.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageids[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}

package ir.hesam.digikala;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


//public class Font {
//    public static void setAllTextView(ViewGroup parent) {
//        for (int i = parent.getChildCount() - 1; i >= 0; i--) {
//            final View child = parent.getChildAt(i);
//            if (child instanceof ViewGroup) {
//                setAllTextView((ViewGroup) child);
//            } else if (child instanceof TextView) {
//                ((TextView) child).setTypeface(getFont());
//            }
//        }
//    }
//
//    Context context ;
//
//    public static Typeface getFont() {
//        return Typeface.createFromAsset(YourApplicationContext.getInstance().getAssets(), "font/roya.ttf");
//    }





//public class YourTextView extends androidx.appcompat.widget.AppCompatTextView {
//
//    private Context context;
//
//    public YourTextView(Context context, AttributeSet attrs, int defStyle) {
//        super(context, attrs, defStyle);
//        init();
//    }
//
//    public YourTextView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        init();
//    }
//
//    public YourTextView(Context context) {
//        super(context);
//        init();
//    }
//
//    private void init() {
//        Typeface tf = Typeface.createFromAsset(context.getAssets(),
//                "font/roya.ttf");
//        setTypeface(tf);
//    }
//}

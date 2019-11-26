
package ui.toasty;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactFontManager;
import java.util.Map;
import android.os.StrictMode;
import android.graphics.Color;
import android.widget.Toast;
import es.dmoral.toasty.Toasty;

// import android.annotation.TargetApi;
// import android.graphics.Canvas;
// import android.graphics.Bitmap;
// import android.graphics.BitmapFactory;
// import android.graphics.Rect;
// import android.graphics.Paint;
// import android.graphics.Typeface;
// import android.content.res.Resources;
// import android.graphics.drawable.BitmapDrawable;
// import android.graphics.drawable.Drawable;
// import android.graphics.drawable.DrawableContainer;




public class RNToastyModule extends ReactContextBaseJavaModule {

  public RNToastyModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "RNToasty";
  }

  @ReactMethod
  public void Show(final ReadableMap props) {

    Toasty.Config config = Toasty.Config.getInstance();

    int type = props.getInt("type");

    String title = props.getString("title");
    int titleSize = props.getInt("titleSize");
    String titleColor = props.getString("titleColor");
    int duration = props.getInt("duration");
    String tintColor = props.getString("tintColor");


    if (titleColor != null && titleColor.length() > 0) {
      config.setTextColor(Color.parseColor(titleColor));
    }
    if (titleSize != 0) {
      config.setTextSize(titleSize);
    }

    config.apply(); // required

    if (tintColor.length() <= 0 && icon == null ) {
      Toasty.normal(getCurrentActivity(), title, duration).show();
  }


  // @TargetApi(21)
  // private Drawable generateVectorIcon(ReadableMap icon) {
  //   StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
  //   StrictMode.setThreadPolicy(policy);

  //   String family = icon.getString("family");
  //   String name = icon.getString("name");
  //   String glyph = icon.getString("glyph");
  //   String color = icon.getString("color");
  //   int size = icon.getInt("size");

  //   if (name != null && name.length() > 0 && name.contains(".")) {
  //     Resources resources = getReactApplicationContext().getResources();
  //     name = name.substring(0, name.lastIndexOf("."));

  //     final int resourceId = resources.getIdentifier(name, "drawable", getReactApplicationContext().getPackageName());
  //     return getReactApplicationContext().getDrawable(resourceId);
  //   }

  //   float scale = getReactApplicationContext().getResources().getDisplayMetrics().density;
  //   String scaleSuffix = "@" + (scale == (int) scale ? Integer.toString((int) scale) : Float.toString(scale)) + "x";
  //   int fontSize = Math.round(size * scale);

  //   Typeface typeface = ReactFontManager.getInstance().getTypeface(family, 0, getReactApplicationContext().getAssets());
  //   Paint paint = new Paint();
  //   paint.setTypeface(typeface);
  //   paint.setColor(Color.parseColor(color));
  //   paint.setTextSize(fontSize);
  //   paint.setAntiAlias(true);
  //   Rect textBounds = new Rect();
  //   paint.getTextBounds(glyph, 0, glyph.length(), textBounds);

  //   Bitmap bitmap = Bitmap.createBitmap(textBounds.width(), textBounds.height(), Bitmap.Config.ARGB_8888);
  //   Canvas canvas = new Canvas(bitmap);
  //   canvas.drawText(glyph, -textBounds.left, -textBounds.top, paint);

  //   return new BitmapDrawable(getReactApplicationContext().getResources(), bitmap);
  // }
}

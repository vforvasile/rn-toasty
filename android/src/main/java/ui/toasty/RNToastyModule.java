
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
  }
}

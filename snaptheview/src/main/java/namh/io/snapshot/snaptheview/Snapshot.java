package namh.io.snapshot.snaptheview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

public class Snapshot {

    // contains functions to extract bitmap of any given view

    /**
     * Generates the bitmap of the given view
     * @param _view
     * @return
     */
    public static Bitmap fromView(View _view){
        Bitmap snap = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas mCanvas = new Canvas(snap);
        _view.draw(mCanvas);
        return snap;
    }
}

package SmartFace;

import android.widget.ImageView;

/**
 * Created by goose on 8/10/17.
 */

public class HeadPose {
    ImageSize imageSize;

    FaceLandmark faceLandmarks;
    int v_degree;
    int h_degree;
    public HeadPose(ImageSize _imageSize, FaceLandmark _faceLandmarks,int _v_degree, int _h_degree) {
        imageSize = _imageSize;
        faceLandmarks = _faceLandmarks;
        v_degree = _v_degree;
        h_degree = _h_degree;

    }
}

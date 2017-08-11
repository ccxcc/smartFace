package SmartFace;

import android.media.Image;

/**
 * Created by goose on 8/10/17.
 */

public class Face {
    ImageSize imageSize;
    FaceLocation faceLocation;
    FaceImage faceImage;
    Image inputImage;
    public Face(ImageSize _imageSize, FaceLocation _faceLocation) {
        imageSize = _imageSize;
        faceLocation = _faceLocation;
    }


}

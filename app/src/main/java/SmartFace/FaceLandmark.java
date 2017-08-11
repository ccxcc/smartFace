package SmartFace;

/**
 * Created by goose on 8/10/17.
 */

public class FaceLandmark {
    ImageSize mImageSize;
    FaceLocation mFaceLocation;
    FaceLandmarkModel mFaceLandmarkModel;

    public FaceLandmark(ImageSize mImageSize, FaceLocation mFaceLocation, FaceLandmarkModel mFaceLandmarkModel) {
        this.mImageSize = mImageSize;
        this.mFaceLocation = mFaceLocation;
        this.mFaceLandmarkModel = mFaceLandmarkModel;
    }
}

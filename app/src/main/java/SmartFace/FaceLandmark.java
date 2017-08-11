package SmartFace;
import java.util.ArrayList;
/**
 * Created by goose on 8/10/17.
 */

public class FaceLandmark {
	ImageSize mImageSize;
	FaceLocation mFaceLocation;
	ArrayList<Point2d> mLandmark;

	public FaceLandmark(ImageSize _mImageSize, FaceLocation _mFaceLocation, ArrayList<Point2d> _mLandmark){
		if(_mLandmark.size() != 68){
			throw new Error("The size of mLandmark is not 68");
		}
		mImageSize = _mImageSize;
		mFaceLocation = _mFaceLocation;
		mLandmark = _mLandmark;
	}
}

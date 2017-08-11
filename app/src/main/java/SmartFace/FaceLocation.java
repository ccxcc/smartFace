package SmartFace;

/**
 * Created by xingyugu on 8/10/17.
 */

public class FaceLocation {
    int[] mlocation; //{leftUp_x, leftUp_y, rightDown_x, rightDown_y}

    FaceLocation(int[] _mLocation){
        if(_mLocation == null || _mLocation.length != 4)
            throw new Error("the _mLocation's length does not equal 4!");
        mlocation = _mLocation;
    }

}

package SmartFace;

import java.util.ArrayList;

/**
 * Created by goose on 8/10/17.
 */

public class FaceModel {


    public ArrayList<Point2d> image_points;
    public FaceModel(){
        image_points = new ArrayList<>(6);
    }
}

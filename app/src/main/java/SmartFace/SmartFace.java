package SmartFace;

/**
 * Created by goose on 8/10/17.
 */

public class SmartFace {

    //members
    TypeImage image;
    //9

    HeadPose headPose;
    Face face;
    FaceLandmark faceLandmark;
    FaceImage faceImage;


    //objects to generate members
    FaceRecognizor faceRecognizor;
    FaceDetector faceDetector;
    FaceDescriptor faceDescriptor;


    //initializer
    public SmartFace(TypeImage inputimg){
        image = inputimg;

    }



    {}



}

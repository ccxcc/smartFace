package SmartFace;

import android.media.Image;

/**
 * Created by goose on 8/10/17.
 */


public class SmartFace {

    //members
    Image image;

    HeadPose headPose;
    Face face;
    FaceLandmark faceLandmark;
    FaceImage faceImage;


    //objects to generate members
    public FaceRecognizor();
    public FaceDetector faceDetector;
    public FaceDescriptorModel FaceDescriptor(){};


    //initializer
    public SmartFace(Image inputimg){
        image = inputimg;


    }







}

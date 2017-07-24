package com.example.mohan.imageeffects;

import android.gesture.Gesture;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;

public class MainActivity extends AppCompatActivity {


    ImageView myImageView;
    Drawable myImage;
    Bitmap bitmapImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                myImageView=(ImageView) findViewById(R.id.myImageView);

               /* myImage = ResourcesCompat.getDrawable(getResources(),R.drawable.image,null);
                bitmapImage=((BitmapDrawable) myImage).getBitmap();
                Bitmap newphoto=invertimage(bitmapImage);
                myImageView.setImageBitmap(newphoto); */

               Drawable [] layers = new Drawable[2];
                layers [0] = ResourcesCompat.getDrawable(getResources(), R.drawable.img, null);
                layers [1] = ResourcesCompat.getDrawable(getResources(), R.drawable.filteri, null);
        LayerDrawable layerDrawable = new LayerDrawable(layers);
        myImageView.setImageDrawable(layerDrawable);

    }
    private static Bitmap invertimage(Bitmap orignal) {
        Bitmap finalimage = Bitmap.createBitmap(orignal.getWidth(), orignal.getHeight(),orignal.getConfig());
            int A, R, G, B;
            int pixelcolor;
            int height=orignal.getHeight();
            int width=orignal.getWidth();

            for(int y=0;y<height;y++){
                for (int x=0;x<width;x++){

                             pixelcolor=orignal.getPixel(x,y);
                             A= Color.alpha(pixelcolor);
                             R= 255-Color.red(pixelcolor);
                             G= 255-Color.green(pixelcolor);
                             B= 255-Color.blue(pixelcolor);
                                 finalimage.setPixel(x,y,Color.argb(A,R,G,B));
                }
            }
            return finalimage;
        }

}

package com.pdftron.android.pdfviewer;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pdftron.demo.app.SimpleReaderActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Open the document reader from a resource file in the 'res/raw' directory
        SimpleReaderActivity.openDocument(this, R.raw.sample);
    }

    // Open a local document given a path
    private void openLocalDocument(Context context, String localFilePath) {
        final Uri localFile = Uri.fromFile(new File(localFilePath));
        SimpleReaderActivity.openDocument(context, localFile);
    }

    // Open a document given a Content Uri
    private void openContentUriDocument(Context context, Uri contentUri) {
        SimpleReaderActivity.openDocument(context, contentUri);
    }

    // Open a document from HTTP/HTTPs
    private void openHttpDocument(Context context, String localFIlePath) {
        final Uri fileLink = Uri.parse("myFileLink");
        SimpleReaderActivity.openDocument(context, fileLink);
    }

    // Open a document stored in the 'src/main/res/raw' folder
    private void openRawResourceDocument(Context context, @IdRes int fileResId) {
        SimpleReaderActivity.openDocument(context, fileResId);
    }
}

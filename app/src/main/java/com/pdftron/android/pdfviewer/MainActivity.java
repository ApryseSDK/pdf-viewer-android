package com.pdftron.android.pdfviewer;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pdftron.pdf.controls.DocumentActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Open our sample document in the 'res/raw' resource folder
        DocumentActivity.openDocument(this, R.raw.sample);
    }

    /**
     * Open a local document given a path
     *
     * @param context the context to start the document reader
     * @param localFilePath local path to a document
     */
    private void openLocalDocument(Context context, String localFilePath) {
        final Uri localFile = Uri.fromFile(new File(localFilePath));
        DocumentActivity.openDocument(context, localFile);
    }

    /**
     * Open a document given a Content Uri
     *
     * @param context the context to start the document reader
     * @param contentUri a content URI that references a document
     */
    private void openContentUriDocument(Context context, Uri contentUri) {
        DocumentActivity.openDocument(context, contentUri);
    }

    /**
     * Open a document from an HTTP/HTTPS url
     *
     * @param context the context to start the document reader
     * @param url an HTTP/HTTPS url to a document
     */
    private void openHttpDocument(Context context, String url) {
        final Uri fileLink = Uri.parse(url);
        DocumentActivity.openDocument(context, fileLink);
    }

    /**
     *
     * @param context the context to start the document reader
     * @param fileResId resource id to a document in res/raw
     */
    private void openRawResourceDocument(Context context, @IdRes int fileResId) {
        DocumentActivity.openDocument(context, fileResId);
    }
}

package com.shajt3ch.easyAPKtools.data;

import android.os.Environment;

import java.io.File;

public class Constant {

    private static final String BASE_PATH = Environment.getExternalStorageDirectory().toString() + File.separator;

    public static final String BACKUP_FOLDER = BASE_PATH + "Apk Backup" + File.separator;

}

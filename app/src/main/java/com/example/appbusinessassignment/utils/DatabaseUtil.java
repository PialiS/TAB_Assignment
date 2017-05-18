package com.example.appbusinessassignment.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.appbusinessassignment.database.DaoMaster;
import com.example.appbusinessassignment.database.DaoSession;

import static com.example.appbusinessassignment.utils.Utils.DB_NAME;

/**
 * Created by Vikash on 19-05-2017.
 * it is used in db
 */

public class DatabaseUtil {

    private DaoMaster.DevOpenHelper encryptedDevOpenHelper;
    private SQLiteDatabase sqLiteDatabase;
    private DaoSession daoSession;

    public DatabaseUtil() {
        //TODO when Required
    }

    /**
     * Call the StartSession of class to start the session
     * It will return the DAOSession as object
     *
     * @param context Instance of Activity which is calling it
     */
    public DaoSession StartSession(Context context) {
        encryptedDevOpenHelper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
        sqLiteDatabase = encryptedDevOpenHelper.getWritableDatabase();
        DaoMaster mDaoMaster = new DaoMaster(sqLiteDatabase);
        daoSession = mDaoMaster.newSession();

        return daoSession;
    }

    // Call the closeSession of class to stop the session
    public void closeSession() {
        if (daoSession != null) {
            daoSession.clear();
        }
        if (sqLiteDatabase != null) {
            sqLiteDatabase.close();
        }
        if (encryptedDevOpenHelper != null) {
            encryptedDevOpenHelper.close();
        }
    }
}

package com.nivaldoBondanca.challenges30day.content.data;

import android.content.ContentUris;
import android.net.Uri;

/**
 * Created by Nivaldo
 * on 01/04/2014
 */
public class ChallengeAttemptDay {

    public static final String TABLE_NAME = "challengeAttemptDay";
    public interface Datatable {
        public static final String DAY_NUMBER      = "_id";
        public static final String CHALLENGE_ID    = "challenge_id";
        public static final String ATTEMPT_ID      = "attempt_id";
        public static final String STATUS          = "status";
        public static final String NOTE            = "note";
    }

    public static final String PATH = "day";

    public static final Uri getContentUri(long challengeId, long attemptNumber) {
        return Uri.withAppendedPath(ChallengeAttempt.getContentUri(challengeId, attemptNumber), PATH);
    }
    public static final Uri getContentUri(long challengeId, long attemptNumber, long dayNumber) {
        return ContentUris.withAppendedId(getContentUri(challengeId, attemptNumber), dayNumber);
    }
}

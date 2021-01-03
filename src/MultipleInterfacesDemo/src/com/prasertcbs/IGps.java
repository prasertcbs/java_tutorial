package com.prasertcbs;

/**
 * Created by prasert on 10/21/2014.
 */
public interface IGps {
    float receiveLat();
    float receiveLon();
    boolean isGpsEnabled();
}

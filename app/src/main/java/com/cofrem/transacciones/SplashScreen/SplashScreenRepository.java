package com.cofrem.transacciones.SplashScreen;

import android.content.Context;

public interface SplashScreenRepository {

    /**
     * Metodo que verifica:
     * - Existencia de datos
     * - Validez de datos
     *
     * @param context
     */
    void validateAcces(Context context);

}

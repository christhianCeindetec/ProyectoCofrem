package com.cofrem.transacciones.Modules.ModuleTransaction.AnulacionScreenActivity;

import com.cofrem.transacciones.Modules.ModuleTransaction.AnulacionScreenActivity.events.AnulacionScreenEvent;

public interface AnulacionScreenPresenter {

    //Todo: crear metodos presentador

    /**
     * metodo presentador
     */
    void VerifySuccess();

    /**
     * Metodo para la creacion del presentador
     */
    void onCreate();

    /**
     * Metodo para la destruccion del presentador
     */
    void onDestroy();


    /**
     * Metodo para recibir los eventos generados
     *
     * @param anulacionScreenEvent
     */
    void onEventMainThread(AnulacionScreenEvent anulacionScreenEvent);

}

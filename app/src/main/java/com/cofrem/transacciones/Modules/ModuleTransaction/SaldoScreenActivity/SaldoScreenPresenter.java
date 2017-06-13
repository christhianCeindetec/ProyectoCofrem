package com.cofrem.transacciones.Modules.ModuleTransaction.SaldoScreenActivity;

import com.cofrem.transacciones.Modules.ModuleTransaction.SaldoScreenActivity.events.SaldoScreenEvent;

public interface SaldoScreenPresenter {

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
     * @param saldoScreenEvent
     */
    void onEventMainThread(SaldoScreenEvent saldoScreenEvent);

}

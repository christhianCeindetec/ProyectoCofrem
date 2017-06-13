package com.cofrem.transacciones.Modules.ModuleTransaction.CreditoScreenActivity;

import com.cofrem.transacciones.Modules.ModuleTransaction.CreditoScreenActivity.events.CreditoScreenEvent;
import com.cofrem.transacciones.lib.EventBus;
import com.cofrem.transacciones.lib.GreenRobotEventBus;

public class CreditoScreenRepositoryImpl implements CreditoScreenRepository {
    /**
     * #############################################################################################
     * Declaracion de componentes y variables
     * #############################################################################################
     */


    /**
     * #############################################################################################
     * Constructor de la clase
     * #############################################################################################
     */
    public CreditoScreenRepositoryImpl() {
    }

    /**
     * #############################################################################################
     * Metodos sobrecargados de la interface
     * #############################################################################################
     */

    /**
     *
     */
    @Override
    public void validateAcces() {

        postEvent(CreditoScreenEvent.onVerifySuccess);

    }

    /**
     * #############################################################################################
     * Metodo propios de la clase
     * #############################################################################################
     */

    /**
     * Metodo que registra los eventos
     *
     * @param type
     * @param errorMessage
     */
    private void postEvent(int type, String errorMessage) {
        CreditoScreenEvent creditoScreenEvent = new CreditoScreenEvent();
        creditoScreenEvent.setEventType(type);
        if (errorMessage != null) {
            creditoScreenEvent.setErrorMessage(errorMessage);
        }

        EventBus eventBus = GreenRobotEventBus.getInstance();

        eventBus.post(creditoScreenEvent);
    }

    /**
     * Sobrecarga del metodo postevent
     *
     * @param type
     */
    private void postEvent(int type) {

        postEvent(type, null);

    }
}

package com.cofrem.transacciones.Modules.ModuleTransaction.CreditoScreenActivity;

class CreditoScreenInteractorImpl implements CreditoScreenInteractor {
    /**
     * #############################################################################################
     * Declaracion de componentes y variables
     * #############################################################################################
     */

    /**
     * #############################################################################################
     * Instanciamientos de las clases
     * #############################################################################################
     */
    private CreditoScreenRepository creditoScreenRepository;

    /**
     * #############################################################################################
     * Constructor de la clase
     * #############################################################################################
     */
    public CreditoScreenInteractorImpl() {

        creditoScreenRepository = new CreditoScreenRepositoryImpl();

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
    public void validateAccess() {
        //Valida el acceso a la app
        creditoScreenRepository.validateAcces();
    }
}

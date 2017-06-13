package com.cofrem.transacciones;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_configuration_screen)
public class ConfigurationScreenActivity extends Activity {

    /**
     * #############################################################################################
     * Instanciamientos de las clases
     * #############################################################################################
     */

    /**
     * #############################################################################################
     * Constructor  de  la clase
     * #############################################################################################
     */
    @AfterViews
    void ConfigurationInit() {

    }

    /**
     * #############################################################################################
     * Metodos sobrecargados del sistema
     * #############################################################################################
     */

    /**
     * Metodo que interfiere la presion del boton "Back"
     */
    @Override
    public void onBackPressed() {
        String mensajeRegresar = getString(R.string.general_message_press_back) + getString(R.string.general_text_button_back);
        Toast.makeText(this, mensajeRegresar, Toast.LENGTH_SHORT).show();
    }

    /**
     * #############################################################################################
     * Metodo propios de la clase
     * #############################################################################################
     */

    /**
     * Metodo para navegar a la ventana principal
     */
    @Click(R.id.btnConfigurationScreenBack)
    public void navigateToMainScreen() {
        Intent intent = new Intent(this, MainScreenActivity_.class);
        startActivity(intent);
    }

}
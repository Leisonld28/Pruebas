package co.com.tigo.qa.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class MiPerfilUI {

    public static final Target MI_PERFIL = Target.the("mi perfil").locatedBy("//ion-text[@class='md hydrated'][contains(.,'METIS')]");
    public static final Target OPCIONES_PERFIL = Target.the("opciones perfil").locatedBy("//ion-label[contains(.,'{0}')]");
    public static final Target NOMBREOCORREO = Target.the("nombre/apellido - correo").locatedBy("//ion-row[contains(.,'{0}')]");
    public static final Target DOCUMENTO = Target.the("cedula/documento").locatedBy("//ion-row[contains(.,'Documento')]");

    public static final Target TITULO_NOTIFICACIONES = Target.the("Titulo de Notificaciones").locatedBy("//ion-row[@class='at-font-label at-font-28 md hydrated'][contains(.,'Notificaciones')]");

    public static final Target TITULO_ELIGEAQUEGRUPOQUIERESDARLEACCESO = Target.the("Titulo elige a que grupo quieres darle acceso").locatedBy("//div[@class='at-choose-group'][contains(.,'Elige a qué grupo quieres darle acceso')]");

    public static final Target OPCION_CONTRASEÑA = Target.the("Opcion Contraseña").locatedBy(" //ion-label[@class='at-toggle-label sc-ion-label-md-h sc-ion-label-md-s md hydrated'][contains(.,'{0}')]");

    public static final Target DIGITAR_ANTIGUA_CONTRASEÑA = Target.the("Cambio de Contraseña").locatedBy("//input[@aria-label='oldPassword']");

    public static final Target DIGITAR_NUEVA_CONTRASEÑA = Target.the("Cambio de Contraseña").locatedBy("//input[@aria-label='newPassword']");

    public static final Target BOTON_CONTINUAR = Target.the("Boton Guardar Contraseña").locatedBy("//ion-button[@shape='round'][contains(.,'CONTINUAR')]");

    public static final Target BOTON_CIERRE_DE_SESION = Target.the("Boton Cierre de Sesion").locatedBy("//ion-label[@class='at-toggle-label sc-ion-label-md-h sc-ion-label-md-s md hydrated'][contains(.,'Cierre de sesión global')]");

    public static final Target TITULO_CONTRASEÑA = Target.the("Titulo Contraseña").locatedBy("//p[contains(@class,'ion-text-center title-text')]");

    public static final Target BOTONGLOBAL_CERRAR_TODAS_MIS_SESIONES = Target.the("Cierre de Sesion Global").locatedBy("//ion-label[@aria-label='globalLogoutButtonClick'][contains(.,'CERRAR TODAS MIS SESIONES')]");

    public static final Target TITULO_MEDICION_CALIDAD_DE_RED = Target.the("Cierre de Sesion Global").locatedBy("//ion-text[@class='md hydrated'][contains(.,'Medición calidad de red')]");


}
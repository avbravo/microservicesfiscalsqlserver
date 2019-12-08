/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.microservicesfiscalsqlserver.tables;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;


/**
 *
 * @author avbravo
 */

public class Tclientes implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cuenta;
    private String proveedor;
    private String tipo;
    private Date fechaAlta;
    private Date fechaModificacion;
    private Date fechaUltimaVenta;
    private String nombreComercial;
    private String nombreFiscal;
    private String nif;
    private String actividad;
    private String zonaAgente;
    private Integer agente;
      private Double comision;

    private String persona1;


    private String persona2;
    private String observaciones;
    private String aviso1;
    private String aviso2;

    private Short numCopiasFra;

    private Short numCopiasAlbaran;

    private Short factura;

    private Short albaran;

    private Short tarifa;

    private Short siTotal;

    private Short siDetalleFamilia;

    private Short siAgrupaPedido;

    private Short siAgrupaAlbaran;

    private Short siEntrega;

    private Short siRecargoEqui;

    private Short tipoFra;

    private Short dias;

    private String condTipo;

    private Double credito;

    private Double empleado;

    private Double dtoTipo;
  
    private Short seAplica;
   
    private String fpHabitual;
 
    private Short diaPago1;
 
    private Short diaPago2;
 
    private Double importeAutoFra;
  
    private String fpMinima;
  
    private Double importe;
  
    private Date vacacionesDe;

    private Date vacacionesA;

    private Short venceMes;

    private Double iva;

    private Integer monedaVenta;

    private String domFiscal;

    private String pobFiscal;

    private String telfsFiscal;

    private Integer entidad;

    private String agencia;

    private String cuentaCobro;
   

    private String domCobro;
  
    private String pobCobro;

    private String domEnvio;
   // 
   // @Column(name = "pobEnvio")
    private String pobEnvio;
    
   // @Column(name = "telfsEnvio")
    private String telfsEnvio;
    
   // @Column(name = "domEnvioFra")
    private String domEnvioFra;
   // 
   // @Column(name = "pobEnvioFra")
    private String pobEnvioFra;
    
   // @Column(name = "telfsEnvioFra")
    private String telfsEnvioFra;
    
   // @Column(name = "faxDirecciones")
    private String faxDirecciones;
   // @Column(name = "medioTransporte")
    private Short medioTransporte;
    
   // @Column(name = "transportista")
    private String transportista;
   // @Column(name = "valorPuntoPublico")
    private Double valorPuntoPublico;
   // @Size(max = 4)
   // @Column(name = "digitoControlCobro")
    private String digitoControlCobro;
   // 
   // @Column(name = "cpCobro")
    private String cpCobro;
   // 
   // @Column(name = "cpEnvio")
    private String cpEnvio;
   // 
   // @Column(name = "cpEnvioFra")
    private String cpEnvioFra;
   // 
   // @Column(name = "cpFiscal")
    private String cpFiscal;
   // @Column(name = "valorPuntoDistribuidor")
    private Double valorPuntoDistribuidor;
   // @Column(name = "valorPuntoMayorista")
    private Double valorPuntoMayorista;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    
   // @Column(name = "email")
    private String email;
   // @Column(name = "descuentoPortes")
    private Double descuentoPortes;
   // @Column(name = "siTratamiento")
    private Boolean siTratamiento;
    
   // @Column(name = "zonaAlmacenOrigen")
    private String zonaAlmacenOrigen;
   // @Column(name = "codigoAlmacenOrigen")
    private Integer codigoAlmacenOrigen;
    
   // @Column(name = "zonaAlmacenDestino")
    private String zonaAlmacenDestino;
   // @Column(name = "codigoAlmacenDestino")
    private Integer codigoAlmacenDestino;
    
   // @Column(name = "colorBruto")
    private String colorBruto;
   // @Column(name = "empleadoC")
    private Double empleadoC;
   // @Column(name = "monedaInformes")
    private Integer monedaInformes;
   // @Column(name = "tratamientoContable")
    private Short tratamientoContable;
   // @Column(name = "diaPago3")
    private Short diaPago3;
   // @Column(name = "siRappel")
    private Short siRappel;
   // @Column(name = "fechaUltimaVisita")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimaVisita;
   // @Column(name = "fechaProximaVisita")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProximaVisita;
   // @Size(max = 40)
   // @Column(name = "comentario")
    private String comentario;
   // @Column(name = "previsionAno")
    private Double previsionAno;
   // @Column(name = "SemanaEntrega")
    private Integer semanaEntrega;
    
   // @Column(name = "idioma")
    private String idioma;
   // @Column(name = "siRetencion")
    private Short siRetencion;
   // @Column(name = "porcenRetencion")
    private Double porcenRetencion;
   // @Column(name = "numCopiasPedido")
    private Short numCopiasPedido;
   // @Column(name = "numCopiasRecibo")
    private Short numCopiasRecibo;
   // @Column(name = "dtoTipo2")
    private Double dtoTipo2;
   // @Column(name = "operador")
    private Integer operador;
   // 
   // @Column(name = "idTienda")
    private String idTienda;
   // 
   // @Column(name = "upsize_ts")
    private String upsizeTs;
   // @Column(name = "tipoCliente")
    private Short tipoCliente;
   // @Column(name = "tipoConfirmacion")
    private Short tipoConfirmacion;
   // @Column(name = "siEntregaPedido")
    private Boolean siEntregaPedido;
   // @Size(max = 3)
   // @Column(name = "sucursal")
    private String sucursal;
   // @Column(name = "maxFacturacionMesC")
    private Double maxFacturacionMesC;
    
   // @Column(name = "cFiscale")
    private String cFiscale;
    
   // @Column(name = "ABI")
    private String abi;
    
   // @Column(name = "CAB")
    private String cab;
    
   // @Column(name = "CIN")
    private String cin;
   // @Size(max = 12)
   // @Column(name = "CC")
    private String cc;
   // @Column(name = "codigoIVA")
    private Integer codigoIVA;
    
   // @Column(name = "FAXFiscal")
    private String fAXFiscal;
    
   // @Column(name = "emailFiscal")
    private String emailFiscal;
    
   // @Column(name = "FAXEnvio")
    private String fAXEnvio;
    
   // @Column(name = "emailEnvio")
    private String emailEnvio;
    
   // @Column(name = "PIVAEnvio")
    private String pIVAEnvio;
    
   // @Column(name = "PIVAEnvioFra")
    private String pIVAEnvioFra;
    
   // @Column(name = "codigoVentasExt")
    private String codigoVentasExt;
   // @Size(max = 100)
   // @Column(name = "regioneSocialeEnvio")
    private String regioneSocialeEnvio;
   // @Size(max = 100)
   // @Column(name = "regioneSocialeEnvioFra")
    private String regioneSocialeEnvioFra;
   // @Column(name = "diaPagoVacaciones1")
    private Short diaPagoVacaciones1;
   // @Column(name = "vacacionesDe2")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date vacacionesDe2;
   // @Column(name = "vacacionesA2")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date vacacionesA2;
   // @Column(name = "diaPagoVacaciones2")
    private Short diaPagoVacaciones2;
   // @Column(name = "porcenRetencionIRPF")
    private Double porcenRetencionIRPF;
   // @Column(name = "porcenExplotacion")
    private Double porcenExplotacion;
   // @Column(name = "porcenPublicidad")
    private Double porcenPublicidad;
   // @Column(name = "porcenFormacion")
    private Double porcenFormacion;
   // @Column(name = "porcenFranquicia")
    private Double porcenFranquicia;
    
   // @Column(name = "nombreDireccionEnvio")
    private String nombreDireccionEnvio;
   // @Column(name = "estado")
    private Short estado;
   // @Column(name = "siBloqueado")
    private Boolean siBloqueado;
 
   // @Column(name = "notas")
    private String notas;
   // @Column(name = "potencial")
    private Short potencial;
   // @Column(name = "tipoNIF")
    private Short tipoNIF;
   // @Column(name = "fechaModificacionCobro")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacionCobro;
   // 
   // @Column(name = "comentarioEnvio")
    private String comentarioEnvio;
   // 
   // @Column(name = "comentarioPedido")
    private String comentarioPedido;
   // 
   // @Column(name = "comentarioAlbaran")
    private String comentarioAlbaran;
   // 
   // @Column(name = "comentarioAlbaranFactura")
    private String comentarioAlbaranFactura;
   // @Column(name = "siComentarioEnAlbaran")
    private Boolean siComentarioEnAlbaran;
   // @Column(name = "siComentarioEnFactura")
    private Boolean siComentarioEnFactura;
    
   // @Column(name = "nombreDireccionEnvioFra")
    private String nombreDireccionEnvioFra;
   // @Size(max = 100)
   // @Column(name = "paginaWeb")
    private String paginaWeb;
    
   // @Column(name = "emailPrincipal")
    private String emailPrincipal;
    
   // @Column(name = "IBAN")
    private String iban;
    
   // @Column(name = "BIC")
    private String bic;
    
   // @Column(name = "incoterms")
    private String incoterms;
    
   // @Column(name = "domTienda")
    private String domTienda;
   // 
   // @Column(name = "pobTienda")
    private String pobTienda;
   // 
   // @Column(name = "CPTienda")
    private String cPTienda;
    
   // @Column(name = "telefonoTienda")
    private String telefonoTienda;
    
   // @Column(name = "faxTienda")
    private String faxTienda;
    
   // @Column(name = "emailTienda")
    private String emailTienda;
   // 
   // @Column(name = "informatica")
    private String informatica;
    
   // @Column(name = "origenMercancia")
    private String origenMercancia;
    
   // @Column(name = "cuentaNegociacion")
    private String cuentaNegociacion;
    
   // @Column(name = "codigoSerie")
    private String codigoSerie;
    
   // @Column(name = "areaTerritorial")
    private String areaTerritorial;
    
   // @Column(name = "tipoGrupoCliente")
    private String tipoGrupoCliente;
    
   // @Column(name = "tipoCentro")
    private String tipoCentro;
    
   // @Column(name = "grupoCliente")
    private String grupoCliente;
    
   // @Column(name = "tipoPortes")
    private String tipoPortes;
   
    private Boolean siActivo;
       private Integer montaje;
    
   // @Column(name = "grupo")
    private String grupo;
   // @Column(name = "porcenCargoMontaje")
    private Double porcenCargoMontaje;
   // @Column(name = "cargoMinimoMontaje")
    private Double cargoMinimoMontaje;
    
   // @Column(name = "nombreDireccionMontaje")
    private String nombreDireccionMontaje;
    
   // @Column(name = "domMontaje")
    private String domMontaje;
   // 
   // @Column(name = "pobMontaje")
    private String pobMontaje;
   // 
   // @Column(name = "CPMontaje")
    private String cPMontaje;
    
   // @Column(name = "telefonoMontaje")
    private String telefonoMontaje;
    
   // @Column(name = "faxMontaje")
    private String faxMontaje;
    
   // @Column(name = "emailMontaje")
    private String emailMontaje;
   // 
   // @Column(name = "codigoProveedorCESCE")
    private String codigoProveedorCESCE;
   // @Column(name = "fechaAdmisionCESCE")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdmisionCESCE;
   // @Column(name = "riesgoPropioCESCE")
    private Boolean riesgoPropioCESCE;
    
   // @Column(name = "pathDocRecibida")
    private String pathDocRecibida;
    
   // @Column(name = "pathDocEnviada")
    private String pathDocEnviada;
   // @Column(name = "fechaVencimientoCESCE")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimientoCESCE;
  
    private String delegacion;
   // @Column(name = "diaFacturacion")
    private Short diaFacturacion;
   // @Column(name = "tipoFacturaOriginal")
    private Short tipoFacturaOriginal;
   // @Column(name = "tipoFotocopia")
    private Short tipoFotocopia;
    
   // @Column(name = "formaPagoB")
    private String formaPagoB;
   // @Column(name = "siDtoPorTramo")
    private Boolean siDtoPorTramo;
   // 
   // @Column(name = "codigoTramoFacturacion")
    private String codigoTramoFacturacion;
   // @Column(name = "rutaCobro")
    private Integer rutaCobro;
    
   // @Column(name = "agrupacionCliente")
    private String agrupacionCliente;
    
   // @Column(name = "codigoRangosPuntos")
    private String codigoRangosPuntos;
   // @Column(name = "idTeoWeb")
    private Integer idTeoWeb;
   // @Column(name = "importeMinimoPortes")
    private Double importeMinimoPortes;
   // @Column(name = "importePortes")
    private Double importePortes;
   // @Column(name = "importeFijoCliente")
    private Double importeFijoCliente;
    
   // @Column(name = "centroAdministrativo1")
    private String centroAdministrativo1;
    
   // @Column(name = "centroAdministrativo2")
    private String centroAdministrativo2;
    
   // @Column(name = "centroAdministrativo3")
    private String centroAdministrativo3;
    
   // @Column(name = "emailConfirmacion")
    private String emailConfirmacion;

    private boolean ecoMobilierSometido;
 
    private boolean ecoParticipationSometido;
   
    private boolean tFASometido;
   
    private boolean tVASometido;
  
    private String codigoPorte;

    private Double importeMinimoFranco;
   
    private String ensena;
  
    private String clienteEstatus;
    
   // @Column(name = "clienteEstado")
    private String clienteEstado;
   // @Column(name = "siAgrupaFactura")
    private Short siAgrupaFactura;
   // @Column(name = "periodicidad")
    private Short periodicidad;
   // @Column(name = "clienteNoName")
    private Boolean clienteNoName;
   // 
   // @Column(name = "numMiembro")
    private String numMiembro;
    
   // @Column(name = "NIFIntracomunitario")
    private String nIFIntracomunitario;
    
   // @Column(name = "codigoAccesoExtranet")
    private String codigoAccesoExtranet;
    
   // @Column(name = "contrasenaExtranet")
    private String contrasenaExtranet;
   // @Column(name = "siAltitud")
    private Boolean siAltitud;
   // @Column(name = "siCentoCiudad")
    private Boolean siCentoCiudad;
   // @Column(name = "siPasajeBarco")
    private Boolean siPasajeBarco;
   // @Column(name = "siEntregaParticular")
    private Boolean siEntregaParticular;
    
   // @Column(name = "zonaClienteGrupo")
    private String zonaClienteGrupo;
   // @Column(name = "codigoClienteGrupo")
    private Integer codigoClienteGrupo;
    
   // @Column(name = "zonaClientePagador")
    private String zonaClientePagador;
   // @Column(name = "codigoClientePagador")
    private Integer codigoClientePagador;
   // @Column(name = "siAperturaTiendaLunes")
    private Boolean siAperturaTiendaLunes;
   // @Column(name = "siAperturaTiendaMartes")
    private Boolean siAperturaTiendaMartes;
   // @Column(name = "siAperturaTiendaMiercoles")
    private Boolean siAperturaTiendaMiercoles;
   // @Column(name = "siAperturaTiendaJueves")
    private Boolean siAperturaTiendaJueves;
   // @Column(name = "siAperturaTiendaViernes")
    private Boolean siAperturaTiendaViernes;
   // @Column(name = "siTaller")
    private Boolean siTaller;
   // @Column(name = "siInstalacionIntegrada")
    private Boolean siInstalacionIntegrada;
   // @Column(name = "superficieShowroom")
    private Integer superficieShowroom;
   // @Column(name = "cantidadExpoShowroom")
    private Integer cantidadExpoShowroom;
   // @Column(name = "fechaCreacionTienda")
    // @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacionTienda;
    
   
    private String aplicacionDisVal;
   
    private Integer cestaMedia;

    private Integer ventasPotenciales;
    private Date fechaVencimientoFrancia;
    private Date fechaAdmisionFrancia;

    private Double creditoExterno;
    private String cPGeolocalTienda;

    private Integer tratamientoContableYou;
    private String observacionesEnvio;
    private String reglementHabitual;
    private String reglementMinima;
    private String condicionesPagoHabitual;
    private String condicionesPagoMinima;
    private String codigoCotaExterna;
    private String telefonoMovilEnvio;
    private String codDescripcionDTO1;
    private String codDescripcionDTO2;

    private String exclusividad;

    public Tclientes() {
    }

    
}

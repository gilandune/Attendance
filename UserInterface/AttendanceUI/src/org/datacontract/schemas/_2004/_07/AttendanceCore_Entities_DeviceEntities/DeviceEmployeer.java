/**
 * DeviceEmployeer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.AttendanceCore_Entities_DeviceEntities;

public class DeviceEmployeer  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.Integer fingerFlag;

    private java.lang.String fingerPrint;

    private java.lang.Integer fingerPrintLength;

    private java.lang.String nombreEmpleado;

    private java.lang.String numeroEmpleado;

    private java.lang.String numeroTarjeta;

    private java.lang.String password;

    private java.lang.Integer privilegio;

    public DeviceEmployeer() {
    }

    public DeviceEmployeer(
           java.lang.Boolean enabled,
           java.lang.Integer fingerFlag,
           java.lang.String fingerPrint,
           java.lang.Integer fingerPrintLength,
           java.lang.String nombreEmpleado,
           java.lang.String numeroEmpleado,
           java.lang.String numeroTarjeta,
           java.lang.String password,
           java.lang.Integer privilegio) {
           this.enabled = enabled;
           this.fingerFlag = fingerFlag;
           this.fingerPrint = fingerPrint;
           this.fingerPrintLength = fingerPrintLength;
           this.nombreEmpleado = nombreEmpleado;
           this.numeroEmpleado = numeroEmpleado;
           this.numeroTarjeta = numeroTarjeta;
           this.password = password;
           this.privilegio = privilegio;
    }


    /**
     * Gets the enabled value for this DeviceEmployeer.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this DeviceEmployeer.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the fingerFlag value for this DeviceEmployeer.
     * 
     * @return fingerFlag
     */
    public java.lang.Integer getFingerFlag() {
        return fingerFlag;
    }


    /**
     * Sets the fingerFlag value for this DeviceEmployeer.
     * 
     * @param fingerFlag
     */
    public void setFingerFlag(java.lang.Integer fingerFlag) {
        this.fingerFlag = fingerFlag;
    }


    /**
     * Gets the fingerPrint value for this DeviceEmployeer.
     * 
     * @return fingerPrint
     */
    public java.lang.String getFingerPrint() {
        return fingerPrint;
    }


    /**
     * Sets the fingerPrint value for this DeviceEmployeer.
     * 
     * @param fingerPrint
     */
    public void setFingerPrint(java.lang.String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }


    /**
     * Gets the fingerPrintLength value for this DeviceEmployeer.
     * 
     * @return fingerPrintLength
     */
    public java.lang.Integer getFingerPrintLength() {
        return fingerPrintLength;
    }


    /**
     * Sets the fingerPrintLength value for this DeviceEmployeer.
     * 
     * @param fingerPrintLength
     */
    public void setFingerPrintLength(java.lang.Integer fingerPrintLength) {
        this.fingerPrintLength = fingerPrintLength;
    }


    /**
     * Gets the nombreEmpleado value for this DeviceEmployeer.
     * 
     * @return nombreEmpleado
     */
    public java.lang.String getNombreEmpleado() {
        return nombreEmpleado;
    }


    /**
     * Sets the nombreEmpleado value for this DeviceEmployeer.
     * 
     * @param nombreEmpleado
     */
    public void setNombreEmpleado(java.lang.String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }


    /**
     * Gets the numeroEmpleado value for this DeviceEmployeer.
     * 
     * @return numeroEmpleado
     */
    public java.lang.String getNumeroEmpleado() {
        return numeroEmpleado;
    }


    /**
     * Sets the numeroEmpleado value for this DeviceEmployeer.
     * 
     * @param numeroEmpleado
     */
    public void setNumeroEmpleado(java.lang.String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }


    /**
     * Gets the numeroTarjeta value for this DeviceEmployeer.
     * 
     * @return numeroTarjeta
     */
    public java.lang.String getNumeroTarjeta() {
        return numeroTarjeta;
    }


    /**
     * Sets the numeroTarjeta value for this DeviceEmployeer.
     * 
     * @param numeroTarjeta
     */
    public void setNumeroTarjeta(java.lang.String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    /**
     * Gets the password value for this DeviceEmployeer.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this DeviceEmployeer.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the privilegio value for this DeviceEmployeer.
     * 
     * @return privilegio
     */
    public java.lang.Integer getPrivilegio() {
        return privilegio;
    }


    /**
     * Sets the privilegio value for this DeviceEmployeer.
     * 
     * @param privilegio
     */
    public void setPrivilegio(java.lang.Integer privilegio) {
        this.privilegio = privilegio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceEmployeer)) return false;
        DeviceEmployeer other = (DeviceEmployeer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.fingerFlag==null && other.getFingerFlag()==null) || 
             (this.fingerFlag!=null &&
              this.fingerFlag.equals(other.getFingerFlag()))) &&
            ((this.fingerPrint==null && other.getFingerPrint()==null) || 
             (this.fingerPrint!=null &&
              this.fingerPrint.equals(other.getFingerPrint()))) &&
            ((this.fingerPrintLength==null && other.getFingerPrintLength()==null) || 
             (this.fingerPrintLength!=null &&
              this.fingerPrintLength.equals(other.getFingerPrintLength()))) &&
            ((this.nombreEmpleado==null && other.getNombreEmpleado()==null) || 
             (this.nombreEmpleado!=null &&
              this.nombreEmpleado.equals(other.getNombreEmpleado()))) &&
            ((this.numeroEmpleado==null && other.getNumeroEmpleado()==null) || 
             (this.numeroEmpleado!=null &&
              this.numeroEmpleado.equals(other.getNumeroEmpleado()))) &&
            ((this.numeroTarjeta==null && other.getNumeroTarjeta()==null) || 
             (this.numeroTarjeta!=null &&
              this.numeroTarjeta.equals(other.getNumeroTarjeta()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.privilegio==null && other.getPrivilegio()==null) || 
             (this.privilegio!=null &&
              this.privilegio.equals(other.getPrivilegio())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getFingerFlag() != null) {
            _hashCode += getFingerFlag().hashCode();
        }
        if (getFingerPrint() != null) {
            _hashCode += getFingerPrint().hashCode();
        }
        if (getFingerPrintLength() != null) {
            _hashCode += getFingerPrintLength().hashCode();
        }
        if (getNombreEmpleado() != null) {
            _hashCode += getNombreEmpleado().hashCode();
        }
        if (getNumeroEmpleado() != null) {
            _hashCode += getNumeroEmpleado().hashCode();
        }
        if (getNumeroTarjeta() != null) {
            _hashCode += getNumeroTarjeta().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPrivilegio() != null) {
            _hashCode += getPrivilegio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceEmployeer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "DeviceEmployeer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fingerFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "FingerFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fingerPrint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "FingerPrint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fingerPrintLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "FingerPrintLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEmpleado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "NombreEmpleado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEmpleado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "NumeroEmpleado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTarjeta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "NumeroTarjeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilegio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities.DeviceEntities", "Privilegio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * Retardo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.AttendanceCore_Entities;

public class Retardo  implements java.io.Serializable {
    private java.lang.Integer empleadoId;

    private java.lang.String fechaRetardo;

    public Retardo() {
    }

    public Retardo(
           java.lang.Integer empleadoId,
           java.lang.String fechaRetardo) {
           this.empleadoId = empleadoId;
           this.fechaRetardo = fechaRetardo;
    }


    /**
     * Gets the empleadoId value for this Retardo.
     * 
     * @return empleadoId
     */
    public java.lang.Integer getEmpleadoId() {
        return empleadoId;
    }


    /**
     * Sets the empleadoId value for this Retardo.
     * 
     * @param empleadoId
     */
    public void setEmpleadoId(java.lang.Integer empleadoId) {
        this.empleadoId = empleadoId;
    }


    /**
     * Gets the fechaRetardo value for this Retardo.
     * 
     * @return fechaRetardo
     */
    public java.lang.String getFechaRetardo() {
        return fechaRetardo;
    }


    /**
     * Sets the fechaRetardo value for this Retardo.
     * 
     * @param fechaRetardo
     */
    public void setFechaRetardo(java.lang.String fechaRetardo) {
        this.fechaRetardo = fechaRetardo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Retardo)) return false;
        Retardo other = (Retardo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empleadoId==null && other.getEmpleadoId()==null) || 
             (this.empleadoId!=null &&
              this.empleadoId.equals(other.getEmpleadoId()))) &&
            ((this.fechaRetardo==null && other.getFechaRetardo()==null) || 
             (this.fechaRetardo!=null &&
              this.fechaRetardo.equals(other.getFechaRetardo())));
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
        if (getEmpleadoId() != null) {
            _hashCode += getEmpleadoId().hashCode();
        }
        if (getFechaRetardo() != null) {
            _hashCode += getFechaRetardo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Retardo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities", "Retardo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empleadoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities", "EmpleadoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRetardo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities", "FechaRetardo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

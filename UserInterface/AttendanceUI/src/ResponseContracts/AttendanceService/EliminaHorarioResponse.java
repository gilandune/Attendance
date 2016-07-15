/**
 * EliminaHorarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ResponseContracts.AttendanceService;

public class EliminaHorarioResponse  implements java.io.Serializable {
    private java.lang.Boolean eliminado;

    private java.lang.String respuesta;

    public EliminaHorarioResponse() {
    }

    public EliminaHorarioResponse(
           java.lang.Boolean eliminado,
           java.lang.String respuesta) {
           this.eliminado = eliminado;
           this.respuesta = respuesta;
    }


    /**
     * Gets the eliminado value for this EliminaHorarioResponse.
     * 
     * @return eliminado
     */
    public java.lang.Boolean getEliminado() {
        return eliminado;
    }


    /**
     * Sets the eliminado value for this EliminaHorarioResponse.
     * 
     * @param eliminado
     */
    public void setEliminado(java.lang.Boolean eliminado) {
        this.eliminado = eliminado;
    }


    /**
     * Gets the respuesta value for this EliminaHorarioResponse.
     * 
     * @return respuesta
     */
    public java.lang.String getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this EliminaHorarioResponse.
     * 
     * @param respuesta
     */
    public void setRespuesta(java.lang.String respuesta) {
        this.respuesta = respuesta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EliminaHorarioResponse)) return false;
        EliminaHorarioResponse other = (EliminaHorarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eliminado==null && other.getEliminado()==null) || 
             (this.eliminado!=null &&
              this.eliminado.equals(other.getEliminado()))) &&
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              this.respuesta.equals(other.getRespuesta())));
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
        if (getEliminado() != null) {
            _hashCode += getEliminado().hashCode();
        }
        if (getRespuesta() != null) {
            _hashCode += getRespuesta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EliminaHorarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("AttendanceService.ResponseContracts", "EliminaHorarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eliminado");
        elemField.setXmlName(new javax.xml.namespace.QName("AttendanceService.ResponseContracts", "Eliminado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("AttendanceService.ResponseContracts", "Respuesta"));
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

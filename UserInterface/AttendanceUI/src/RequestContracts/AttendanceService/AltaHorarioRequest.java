/**
 * AltaHorarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package RequestContracts.AttendanceService;

public class AltaHorarioRequest  implements java.io.Serializable {
    private java.lang.Integer usuario;

    private org.datacontract.schemas._2004._07.AttendanceCore_Entities.Horario horario;

    public AltaHorarioRequest() {
    }

    public AltaHorarioRequest(
           java.lang.Integer usuario,
           org.datacontract.schemas._2004._07.AttendanceCore_Entities.Horario horario) {
           this.usuario = usuario;
           this.horario = horario;
    }


    /**
     * Gets the usuario value for this AltaHorarioRequest.
     * 
     * @return usuario
     */
    public java.lang.Integer getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this AltaHorarioRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.Integer usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the horario value for this AltaHorarioRequest.
     * 
     * @return horario
     */
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Horario getHorario() {
        return horario;
    }


    /**
     * Sets the horario value for this AltaHorarioRequest.
     * 
     * @param horario
     */
    public void setHorario(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Horario horario) {
        this.horario = horario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AltaHorarioRequest)) return false;
        AltaHorarioRequest other = (AltaHorarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.horario==null && other.getHorario()==null) || 
             (this.horario!=null &&
              this.horario.equals(other.getHorario())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getHorario() != null) {
            _hashCode += getHorario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AltaHorarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("AttendanceService.RequestContracts", "AltaHorarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("AttendanceService.RequestContracts", "Usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horario");
        elemField.setXmlName(new javax.xml.namespace.QName("AttendanceService.RequestContracts", "horario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities", "Horario"));
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

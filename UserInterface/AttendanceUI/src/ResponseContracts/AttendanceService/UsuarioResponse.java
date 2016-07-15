/**
 * UsuarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ResponseContracts.AttendanceService;

public class UsuarioResponse  implements java.io.Serializable {
    private java.lang.Boolean usuarioValido;

    private org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario usuario;

    public UsuarioResponse() {
    }

    public UsuarioResponse(
           java.lang.Boolean usuarioValido,
           org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario usuario) {
           this.usuarioValido = usuarioValido;
           this.usuario = usuario;
    }


    /**
     * Gets the usuarioValido value for this UsuarioResponse.
     * 
     * @return usuarioValido
     */
    public java.lang.Boolean getUsuarioValido() {
        return usuarioValido;
    }


    /**
     * Sets the usuarioValido value for this UsuarioResponse.
     * 
     * @param usuarioValido
     */
    public void setUsuarioValido(java.lang.Boolean usuarioValido) {
        this.usuarioValido = usuarioValido;
    }


    /**
     * Gets the usuario value for this UsuarioResponse.
     * 
     * @return usuario
     */
    public org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this UsuarioResponse.
     * 
     * @param usuario
     */
    public void setUsuario(org.datacontract.schemas._2004._07.AttendanceCore_Entities.Usuario usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsuarioResponse)) return false;
        UsuarioResponse other = (UsuarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuarioValido==null && other.getUsuarioValido()==null) || 
             (this.usuarioValido!=null &&
              this.usuarioValido.equals(other.getUsuarioValido()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getUsuarioValido() != null) {
            _hashCode += getUsuarioValido().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsuarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("AttendanceService.ResponseContracts", "UsuarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioValido");
        elemField.setXmlName(new javax.xml.namespace.QName("AttendanceService.ResponseContracts", "UsuarioValido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("AttendanceService.ResponseContracts", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/AttendanceCore.Entities", "Usuario"));
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

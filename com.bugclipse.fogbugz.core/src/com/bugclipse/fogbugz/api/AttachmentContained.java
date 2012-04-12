/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.1.2.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.bugclipse.fogbugz.api;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AttachmentContained.
 * 
 * @version $Revision$ $Date$
 */
public class AttachmentContained implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sFileName.
     */
    private java.lang.String _sFileName;

    /**
     * Field _sURL.
     */
    private java.lang.String _sURL;


      //----------------/
     //- Constructors -/
    //----------------/

    public AttachmentContained() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'sFileName'.
     * 
     * @return the value of field 'SFileName'.
     */
    public java.lang.String getSFileName(
    ) {
        return this._sFileName;
    }

    /**
     * Returns the value of field 'sURL'.
     * 
     * @return the value of field 'SURL'.
     */
    public java.lang.String getSURL(
    ) {
        return this._sURL;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'sFileName'.
     * 
     * @param sFileName the value of field 'sFileName'.
     */
    public void setSFileName(
            final java.lang.String sFileName) {
        this._sFileName = sFileName;
    }

    /**
     * Sets the value of field 'sURL'.
     * 
     * @param sURL the value of field 'sURL'.
     */
    public void setSURL(
            final java.lang.String sURL) {
        this._sURL = sURL;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * com.bugclipse.fogbugz.api.AttachmentContained
     */
    public static com.bugclipse.fogbugz.api.AttachmentContained unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.bugclipse.fogbugz.api.AttachmentContained) Unmarshaller.unmarshal(com.bugclipse.fogbugz.api.AttachmentContained.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}

/**
 * AirShoppingDistributionAdapter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.uk.ba.ndc.stubs;


/*
 *  AirShoppingDistributionAdapter java interface
 */
public interface AirShoppingDistributionAdapter {
    /**
     * Auto generated method signature
     *
     * @param airShoppingRQ0
     */
    public org.iata.www.iata.edist._2017_2.AirShoppingRS airShopping17_2_V1(
            org.iata.www.iata.edist._2017_2.AirShoppingRQ airShoppingRQ0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param airShoppingRQ0
     */
    public void startairShopping17_2_V1(
            org.iata.www.iata.edist._2017_2.AirShoppingRQ airShoppingRQ0,
            final com.uk.ba.ndc.stubs.AirShoppingDistributionAdapterCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}

package itmsg.app.asset;

import psdi.app.asset.FldAssetAssetType;
import psdi.mbo.MboValue;
import psdi.util.MXException;

import java.rmi.RemoteException;

public class CustFldAssetAssetType extends FldAssetAssetType {
    public CustFldAssetAssetType(MboValue mbv) {
        super(mbv);
    }

    @Override
    public void initValue() throws MXException, RemoteException {
        super.initValue();
        System.out.println("Called CustFldAssetAssetType!!!!!!!!");
    }
}

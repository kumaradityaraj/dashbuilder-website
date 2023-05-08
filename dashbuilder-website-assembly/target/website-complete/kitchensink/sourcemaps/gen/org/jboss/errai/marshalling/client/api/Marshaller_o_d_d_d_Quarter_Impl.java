package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataset.date.Quarter;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_Quarter_Impl implements GeneratedMarshaller<Quarter> {
  private Quarter[] EMPTY_ARRAY = new Quarter[0];
  public Quarter[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Quarter demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Quarter entity = obj != null ? Enum.valueOf(Quarter.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Quarter.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Quarter a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.Quarter") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}
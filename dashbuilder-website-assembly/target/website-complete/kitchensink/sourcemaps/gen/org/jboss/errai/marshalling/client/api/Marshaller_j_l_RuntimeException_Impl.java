package org.jboss.errai.marshalling.client.api;

import com.google.gwt.core.shared.GWT;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.QualifyingMarshallerWrapper;

public class Marshaller_j_l_RuntimeException_Impl implements GeneratedMarshaller<RuntimeException> {
  private RuntimeException[] EMPTY_ARRAY = new RuntimeException[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Throwable> java_lang_Throwable = null;
  private Marshaller<StackTraceElement[]> arrayOf_java_lang_StackTraceElement_D1 = null;
  abstract class Marshaller_for_arrayOf_java_lang_StackTraceElement_D1 implements GeneratedMarshaller { }
  public RuntimeException[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public RuntimeException demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(RuntimeException.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("message"), a1);
    RuntimeException entity = new RuntimeException(c0);
    a1.recordObject(objId, entity);
    final Set<String> keys = obj.keySet();
    for (String key : keys) {
      if (key.equals("^EncodedType") || key.equals("^ObjectID")) {
        continue;
      }
      EJValue objVal = obj.getIfNotNull(key);
      if (objVal == null) {
        continue;
      }
      switch (key) {
        case "cause": entity.initCause(java_lang_Throwable.demarshall(objVal, a1));
        break;
        case "stackTrace": entity.setStackTrace(arrayOf_java_lang_StackTraceElement_D1.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(RuntimeException a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "java.lang.RuntimeException") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "stackTrace") + "\":") + arrayOf_java_lang_StackTraceElement_D1.marshall(a0.getStackTrace(), a1)) + ",\"") + "message") + "\":") + java_lang_String.marshall(a0.getMessage(), a1)) + ",\"") + "cause") + "\":") + java_lang_Throwable.marshall(a0.getCause(), a1)) + "}");
  }

  private void lazyInit() {
    if (java_lang_Throwable == null) {
      java_lang_Throwable = Marshalling.getMarshaller(Throwable.class);
    }
    if (arrayOf_java_lang_StackTraceElement_D1 == null) {
      arrayOf_java_lang_StackTraceElement_D1 = Marshalling.getMarshaller(StackTraceElement[].class, new DeferredMarshallerCreationCallback<StackTraceElement[]>() {
        public Marshaller<StackTraceElement[]> create(Class type) {
          return new QualifyingMarshallerWrapper((Marshaller) GWT.create(Marshaller_for_arrayOf_java_lang_StackTraceElement_D1.class), StackTraceElement[].class);
        }
      });
    }
  }
}